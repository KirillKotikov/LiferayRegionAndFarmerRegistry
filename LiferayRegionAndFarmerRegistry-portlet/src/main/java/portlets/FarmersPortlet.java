package portlets;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.kotikov.model.Farmer;
import ru.kotikov.service.FarmerLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FarmersPortlet extends MVCPortlet {

    public void addFarmer(ActionRequest request, ActionResponse response) {

        try {
            Farmer farmer = FarmerLocalServiceUtil.createFarmer(FarmerLocalServiceUtil.getFarmersCount() + 1);
            farmer.setFarmerName(ParamUtil.getString(request, "farmerName"));
            farmer.setFarmerLegalForm(ParamUtil.getString(request, "FarmerLegalForm"));
            farmer.setFarmerInn(ParamUtil.getLong(request, "FarmerInn"));
            farmer.setFarmerKpp(ParamUtil.getLong(request, "FarmerKpp"));
            farmer.setFarmerOgrn(ParamUtil.getLong(request, "FarmerOgrn"));
            farmer.setFarmerRegistrationRegionId(ParamUtil.getLong(request, "FarmerRegistrationRegionId"));
            farmer.setFarmerFieldRegionsId(ParamUtil.getString(request, "FarmerFieldRegionsId"));
            int year = ParamUtil.getInteger(request, "dateYear");
            int month = ParamUtil.getInteger(request, "dateMonth");
            int day = ParamUtil.getInteger(request, "dateDay");
            Calendar calendar = new GregorianCalendar();
            calendar.set(year, month, day);
            Date registrationDate = calendar.getTime();
            farmer.setFarmerRegistrationDate(registrationDate);
            farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
            FarmerLocalServiceUtil.addFarmer(farmer);
            response.setRenderParameter("jspPage", "/html/farmers/farmersView.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFarmer(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer farmer = FarmerLocalServiceUtil.getFarmer(ParamUtil.getLong(request, "farmerId"));
        farmer.setFarmerName(ParamUtil.getString(request, "farmerName"));
        farmer.setFarmerLegalForm(ParamUtil.getString(request, "FarmerLegalForm"));
        farmer.setFarmerInn(ParamUtil.getLong(request, "FarmerInn"));
        farmer.setFarmerKpp(ParamUtil.getLong(request, "FarmerKpp"));
        farmer.setFarmerOgrn(ParamUtil.getLong(request, "FarmerOgrn"));
        farmer.setFarmerRegistrationRegionId(ParamUtil.getLong(request, "FarmerRegistrationRegionId"));
        farmer.setFarmerFieldRegionsId(ParamUtil.getString(request, "FarmerFieldRegionsId"));
        int year = ParamUtil.getInteger(request, "dateYear");
        int month = ParamUtil.getInteger(request, "dateMonth");
        int day = ParamUtil.getInteger(request, "dateDay");
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month, day);
        Date registrationDate = calendar.getTime();
        farmer.setFarmerRegistrationDate(registrationDate);
        farmer.setFarmerArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
        FarmerLocalServiceUtil.updateFarmer(farmer);
        response.setRenderParameter("jspPage", "/html/farmers/farmersView.jsp");
    }

    public void changeFarmerArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer currentFarmer = FarmerLocalServiceUtil.getFarmer(Long.parseLong(request.getParameter("currentFarmerId")));
        currentFarmer.setFarmerArchiveStatus(!request.getParameter("currentFarmerArchiveStatus").equals("true"));
        FarmerLocalServiceUtil.updateFarmer(currentFarmer);
        response.setRenderParameter("jspPage", "/html/farmers/farmersView.jsp");
    }

    public void getCurrentFarmer(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Farmer currentFarmer = FarmerLocalServiceUtil.getFarmer(Long.parseLong(request.getParameter("currentFarmerId")));
        request.setAttribute("currentFarmer", currentFarmer);
        response.setRenderParameter("jspPage", "/html/farmers/updateFarmer.jsp");
    }
}
