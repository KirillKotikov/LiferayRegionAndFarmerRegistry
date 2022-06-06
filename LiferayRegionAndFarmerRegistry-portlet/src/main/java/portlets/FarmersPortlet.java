package portlets;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.kotikov.model.Farmer;
import ru.kotikov.service.FarmerLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FarmersPortlet extends MVCPortlet {

    public void addFarmer(ActionRequest request, ActionResponse response) {

        try {
            Farmer farmer = FarmerLocalServiceUtil.createFarmer(CounterLocalServiceUtil.increment());
            farmer.setFarmerName(ParamUtil.getString(request, "farmerName"));
            farmer.setFarmerLegalForm(ParamUtil.getString(request, "farmerLegalForm"));
            farmer.setFarmerInn(ParamUtil.getLong(request, "farmerInn"));
            farmer.setFarmerKpp(ParamUtil.getLong(request, "farmerKpp"));
            farmer.setFarmerOgrn(ParamUtil.getLong(request, "farmerOgrn"));
            farmer.setFarmerRegistrationRegionId(ParamUtil.getLong(request, "farmerRegistrationRegionId"));

            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            if (!(ParamUtil.getString(request, "farmerRegistrationDate")).equals("")) {
                farmer.setFarmerRegistrationDate(format.parse
                        (ParamUtil.getString(request, "farmerRegistrationDate")));
            } else farmer.setFarmerRegistrationDate(null);
            farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "farmerArchiveStatus"));



            FarmerLocalServiceUtil.addFarmer(farmer);
            response.setRenderParameter("jspPage", "/farmersView.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFarmer(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer farmer = FarmerLocalServiceUtil.getFarmer(ParamUtil.getLong(request, "farmerId"));
        farmer.setFarmerName(ParamUtil.getString(request, "farmerName"));
        farmer.setFarmerLegalForm(ParamUtil.getString(request, "farmerLegalForm"));
        farmer.setFarmerInn(ParamUtil.getLong(request, "farmerInn"));
        farmer.setFarmerKpp(ParamUtil.getLong(request, "farmerKpp"));
        farmer.setFarmerOgrn(ParamUtil.getLong(request, "farmerOgrn"));
        farmer.setFarmerRegistrationRegionId(ParamUtil.getLong(request, "farmerRegistrationRegionId"));

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            farmer.setFarmerRegistrationDate(format.parse(ParamUtil.getString(request, "farmerRegistrationDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
        FarmerLocalServiceUtil.updateFarmer(farmer);
        response.setRenderParameter("jspPage", "/farmersView.jsp");
    }

    public void changeFarmerArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer currentFarmer = FarmerLocalServiceUtil.getFarmer(Long.parseLong(request.getParameter("currentFarmerId")));
        currentFarmer.setFarmerArchiveStatus(!request.getParameter("currentFarmerArchiveStatus").equals("true"));
        FarmerLocalServiceUtil.updateFarmer(currentFarmer);
        response.setRenderParameter("jspPage", "/farmersView.jsp");
    }

    public void getCurrentFarmer(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer currentFarmer = FarmerLocalServiceUtil.getFarmer(Long.parseLong(request.getParameter("currentFarmerId")));
        request.setAttribute("currentFarmer", currentFarmer);
        response.setRenderParameter("jspPage", "/html/farmers/updateFarmer.jsp");
    }

    public void filterFarmer(ActionRequest request, ActionResponse response) throws SystemException {
        List<Farmer> resultList = new ArrayList<Farmer>();
        List<Farmer> farmerList = FarmerLocalServiceUtil.getAllFarmers();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date starDate, endDate;
        try {
            if (!(ParamUtil.getString(request, "startRegistrationDate")).equals("")) {
                starDate = (format.parse(ParamUtil.getString(request, "startRegistrationDate")));
            } else {
                starDate = null;
            }
            if (!(ParamUtil.getString(request, "endRegistrationDate")).equals("")) {
                endDate = (format.parse(ParamUtil.getString(request, "endRegistrationDate")));
            } else {
                endDate = null;
            }

            for (Farmer farmer : farmerList) {
                if (
                        ((ParamUtil.getString(request, "searchFarmerName")).equals("")
                                || farmer.getFarmerName().equalsIgnoreCase(ParamUtil.getString(request, "searchFarmerName")))
                                && (ParamUtil.getLong(request, "searchFarmerInn") == 0
                                || farmer.getFarmerInn() == ParamUtil.getLong(request, "searchFarmerInn"))
                                && (ParamUtil.getLong(request, "searchFarmerRegistrationRegionId") == 0
                                || farmer.getFarmerRegistrationRegionId() == ParamUtil.getLong(request, "searchFarmerRegistrationRegionId"))
                                && (starDate == null || farmer.getFarmerRegistrationDate().after(starDate))
                                && (endDate == null || farmer.getFarmerRegistrationDate().before(endDate))
                                && (farmer.getFarmerArchiveStatus() == ParamUtil.getBoolean(request, "searchFarmerArchiveStatus"))
                ) {
                    resultList.add(farmer);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("resultList", resultList);
        response.setRenderParameter("jspPage", "/html/farmers/filterFarmers.jsp");
    }
}
