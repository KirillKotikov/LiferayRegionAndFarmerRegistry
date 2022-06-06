<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addRegion">
    <portlet:param name="mvcPath" value="/html/regions/addRegion.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addRegion %>" value="Add region"/>
<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= RegionLocalServiceUtil.getByRegionArchiveStatus(false)%>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.model.Region" modelVar="region">
        <liferay-ui:search-container-column-jsp path="/html/regions/buttons/regionUpdate.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="regionId" name="Region id"/>
        <liferay-ui:search-container-column-text property="regionName" name="Region name"/>
        <liferay-ui:search-container-column-text property="regionCode" name="Region codes"/>
        <liferay-ui:search-container-column-jsp path="/html/regions/buttons/changeArchiveStatus.jsp" align="right"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row>
    <portlet:renderURL var="archive">
        <portlet:param name="mvcPath" value="/html/regions/archive.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= archive %>" value="Archive"/>
</aui:button-row>