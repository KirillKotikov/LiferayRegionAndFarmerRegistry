package portlets;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.kotikov.model.Region;
import ru.kotikov.service.RegionLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class RegionsPortlet extends MVCPortlet {

    public void addRegion(ActionRequest request, ActionResponse response) {

        try {
            Region region = RegionLocalServiceUtil.createRegion(RegionLocalServiceUtil.getRegionsCount() + 1);
            region.setRegionName(ParamUtil.getString(request, "regionName"));
            region.setRegionCode(ParamUtil.getLong(request, "regionCode"));
            region.setRegionArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
            RegionLocalServiceUtil.addRegion(region);
            response.setRenderParameter("jspPage", "/html/regions/regionsView.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRegion(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Region region = RegionLocalServiceUtil.getRegion(ParamUtil.getLong(request, "regionId"));
        region.setRegionName(ParamUtil.getString(request, "regionName"));
        region.setRegionCode(ParamUtil.getLong(request, "regionCode"));
        region.setRegionArchiveStatus(ParamUtil.getBoolean(request, "archiveStatus"));
        RegionLocalServiceUtil.updateRegion(region);
        response.setRenderParameter("jspPage", "/html/regions/regionsView.jsp");
    }

    public void changeRegionArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Region currentRegion = RegionLocalServiceUtil.getRegion(Long.parseLong(request.getParameter("currentRegionId")));
        currentRegion.setRegionArchiveStatus(!request.getParameter("currentRegionArchiveStatus").equals("true"));
        RegionLocalServiceUtil.updateRegion(currentRegion);
        response.setRenderParameter("jspPage", "/html/regions/regionsView.jsp");
    }

    public void getCurrentRegion(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Region currentRegion = RegionLocalServiceUtil.getRegion(Long.parseLong(request.getParameter("currentRegionId")));
        request.setAttribute("currentRegion", currentRegion);
        response.setRenderParameter("jspPage", "/html/regions/updateRegion.jsp");
    }
}
