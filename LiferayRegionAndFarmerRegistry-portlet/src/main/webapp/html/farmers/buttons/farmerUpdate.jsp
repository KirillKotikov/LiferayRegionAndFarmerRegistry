<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Farmer farmer = (Farmer) res.getObject();
    String farmerId = String.valueOf(farmer.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentFarmer" var="getCurrentFarmerUrl">
        <portlet:param name="currentFarmerId" value="<%=farmerId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentFarmerUrl %>"/>
</liferay-ui:icon-menu>