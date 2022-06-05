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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("MM.dd.yy");
            farmer.setFarmerRegistrationDate(format.parse
                    (ParamUtil.getString(request, "farmerRegistrationDate")));

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

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("MM.dd.yy");
        try {
            farmer.setFarmerRegistrationDate(format.parse(ParamUtil.getString(request, "farmerRegistrationDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
        FarmerLocalServiceUtil.updateFarmer(farmer);
        response.setRenderParameter("jspPage", "/html/farmers/farmersView.jsp");
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
}
