<%@include file="/html/init.jsp" %>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= RegionLocalServiceUtil.getByRegionArchiveStatus(true) %>"/>

    <aui:fieldset label="Regions archive"/>
    <liferay-ui:search-container-row
            className="ru.kotikov.model.Region" modelVar="region">
        <liferay-ui:search-container-column-jsp path="/html/regions/buttons/regionUpdate.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="regionId" name="Region id"/>
        <liferay-ui:search-container-column-text property="regionName" name="Region name"/>
        <liferay-ui:search-container-column-text property="regionCode" name="Region code"/>
        <liferay-ui:search-container-column-jsp path="/html/regions/buttons/changeArchiveStatus.jsp" align="right"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row>
    <portlet:renderURL var="regionsViewUrl">
        <portlet:param name="mvcPath" value="/regionsView.jsp"/>
    </portlet:renderURL>
    <aui:button onClick="<%= regionsViewUrl %>" value="Return"/>
</aui:button-row>