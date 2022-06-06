<%@include file="/html/init.jsp" %>

<%
  ResultRow res = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
  Region region = (Region) res.getObject();
  String regionId = String.valueOf(region.getPrimaryKey());
  String currentRegionArchiveStatus = String.valueOf(region.getRegionArchiveStatus());
%>

<liferay-ui:icon-menu>
  <portlet:actionURL name="changeRegionArchiveStatus" var="changeRegionArchiveStatusUrl">
    <portlet:param name="currentRegionId" value="<%=regionId%>"/>
    <portlet:param name="currentRegionArchiveStatus" value="<%=currentRegionArchiveStatus%>"/>
  </portlet:actionURL>
  <liferay-ui:icon image="edit" message="Change archive status" url="<%= changeRegionArchiveStatusUrl %>"/>
</liferay-ui:icon-menu>