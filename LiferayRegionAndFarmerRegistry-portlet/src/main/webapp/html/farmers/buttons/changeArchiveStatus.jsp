<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Farmer farmer = (Farmer) res.getObject();
    String farmerId = String.valueOf(farmer.getPrimaryKey());
    String currentFarmerArchiveStatus = String.valueOf(farmer.getFarmerArchiveStatus());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="changeFarmerArchiveStatus" var="changeFarmerArchiveStatusUrl">
        <portlet:param name="currentFarmerId" value="<%=farmerId%>"/>
        <portlet:param name="currentFarmerArchiveStatus" value="<%=currentFarmerArchiveStatus%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Change archive status" url="<%= changeFarmerArchiveStatusUrl %>"/>
</liferay-ui:icon-menu>