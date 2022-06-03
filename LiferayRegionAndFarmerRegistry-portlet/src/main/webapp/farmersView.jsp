<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addFarmer">
    <portlet:param name="mvcPath" value="/html/farmers/addFarmer.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addFarmer %>" value="Add farmer"/>
<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= FarmerLocalServiceUtil.getFarmers(searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.kotikov.model.Farmer" modelVar="farmer">
        <liferay-ui:search-container-column-jsp path="/html/farmers/buttons/farmerUpdate.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="farmerName" name="Farmer name"/>
        <liferay-ui:search-container-column-text property="farmerLegalForm" name="Legal form"/>
        <liferay-ui:search-container-column-text property="farmerInn" name="INN"/>
        <liferay-ui:search-container-column-text property="farmerKpp" name="KPP"/>
        <liferay-ui:search-container-column-text property="farmerOgrn" name="OGRN"/>
        <liferay-ui:search-container-column-text property="farmerRegistrationRegionId" name="Registration region id"/>
        <liferay-ui:search-container-column-text property="farmerRegistrationDate" name="Registration date"/>
        <liferay-ui:search-container-column-text property="farmerArchiveStatus" name="Farmer archive status"/>
        <liferay-ui:search-container-column-jsp path="/html/farmers/buttons/changeArchiveStatus.jsp" align="right"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>
