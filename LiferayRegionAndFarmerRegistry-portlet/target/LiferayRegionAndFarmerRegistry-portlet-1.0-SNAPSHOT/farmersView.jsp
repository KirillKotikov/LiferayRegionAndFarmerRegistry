<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addFarmer">
    <portlet:param name="mvcPath" value="/html/farmers/addFarmer.jsp"/>
</portlet:renderURL>
<aui:button onClick="<%= addFarmer %>" value="Add farmer"/>

<portlet:actionURL name="filterFarmer" var="filterFarmerUrl"/>
    <aui:form action="<%= filterFarmerUrl %>">
        <p>Search parameters: </p>
        <aui:input name="searchFarmerName" label="Farmer name"/>
        <aui:input name="searchFarmerInn" label="INN">
            <aui:validator name="digits" errorMessage="INN consists of 12 digits!"/>
            <aui:validator name="rangeLength" errorMessage="INN consists of 12 digits!">[11,13]</aui:validator>
        </aui:input>
        <aui:input name="searchFarmerRegistrationRegionId" label="Registration region id">
            <aui:validator name="digits" errorMessage="Id consist of digits only!"/>
        </aui:input>
        <div id="date">
            <aui:input readonly="true" name="startRegistrationDate" label="Registration start date:" placeholder="dd.mm.yyyy"/>
            <aui:input readonly="true" name="endRegistrationDate" label="Registration end date:" placeholder="dd.mm.yyyy"/>
        </div>
        <aui:script>
            YUI().use(
            'aui-datepicker',
            function(Y) {
            new Y.DatePicker(
            {
            trigger: '#date input',
            mask: '%d.%m.%Y',
            calendar: {
            selectionMode: 'multiple'
            },
            popover: {
            zIndex: 1
            },
            panes: 2
            }
            );
            }
            );</aui:script>
        <label>Archive status:
            <aui:input name="searchFarmerArchiveStatus" type="radio" label="true" value="true"> </aui:input>
            <aui:input name="searchFarmerArchiveStatus" type="radio" label="false" value="false" checked="true"> </aui:input>
        </label>
        <aui:button type="submit" name="Search" value="Search"/>
    </aui:form>

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
