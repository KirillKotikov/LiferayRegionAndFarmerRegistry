<%@include file="/html/init.jsp" %>

<%
    ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Region region = (Region) res.getObject();
    String regionId = String.valueOf(region.getPrimaryKey());
%>

<liferay-ui:icon-menu>
    <portlet:actionURL name="getCurrentRegion" var="getCurrentRegionUrl">
        <portlet:param name="currentRegionId" value="<%=regionId%>"/>
    </portlet:actionURL>
    <liferay-ui:icon image="edit" message="Edit" url="<%=getCurrentRegionUrl %>"/>
</liferay-ui:icon-menu>