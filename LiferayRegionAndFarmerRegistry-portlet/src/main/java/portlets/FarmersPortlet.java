package portlets;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.kotikov.model.Farmer;
import ru.kotikov.service.FarmerLocalServiceUtil;
import ru.kotikov.service.RegionLocalServiceUtil;
import utils.FarmerFinderUtil;

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
            farmer.setFarmerRegistrationRegionName(ParamUtil.getString(request, "farmerRegistrationRegionName"));
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            if (!(ParamUtil.getString(request, "farmerRegistrationDate")).equals("")) {
                farmer.setFarmerRegistrationDate(format.parse
                        (ParamUtil.getString(request, "farmerRegistrationDate")));
            } else farmer.setFarmerRegistrationDate(null);
            farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "farmerArchiveStatus"));
            String[] fieldsRegions = ParamUtil.getParameterValues(request, "farmerFieldsRegions");
            long[] fieldsRegionsId = new long[fieldsRegions.length];
            for (int i = 0; i < fieldsRegions.length; i++) {
                fieldsRegionsId[i] = RegionLocalServiceUtil.getByRegionName(fieldsRegions[i]).get(0).getRegionId();
            }
            RegionLocalServiceUtil.setFarmerRegions(farmer.getFarmerId(), fieldsRegionsId);
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
        farmer.setFarmerRegistrationRegionName(ParamUtil.getString(request, "farmerRegistrationRegionName"));
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            farmer.setFarmerRegistrationDate(format.parse(ParamUtil.getString(request, "farmerRegistrationDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String[] fieldsRegions = ParamUtil.getParameterValues(request, "farmerFieldsRegions");
        long[] fieldsRegionsId = new long[fieldsRegions.length];
        for (int i = 0; i < fieldsRegions.length; i++) {
            fieldsRegionsId[i] = RegionLocalServiceUtil.getByRegionName(fieldsRegions[i]).get(0).getRegionId();
        }
        RegionLocalServiceUtil.clearFarmerRegions(farmer.getFarmerId());
        RegionLocalServiceUtil.setFarmerRegions(farmer.getFarmerId(), fieldsRegionsId);
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

        List<Farmer> resultList = null;
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
            resultList = FarmerFinderUtil.getFarmersWithFilters(
                    ParamUtil.getString(request, "searchFarmerName"),
                    ParamUtil.getLong(request, "searchFarmerInn"),
                    ParamUtil.getString(request, "searchFarmerRegistrationRegionName"),
                    starDate,
                    endDate,
                    ParamUtil.getString(request, "searchFarmerArchiveStatus")
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("resultList", resultList);
        response.setRenderParameter("jspPage", "/html/farmers/filterFarmers.jsp");
    }

}