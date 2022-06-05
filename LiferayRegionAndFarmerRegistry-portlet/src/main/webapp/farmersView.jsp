<%@include file="/html/init.jsp" %>

<portlet:renderURL var="addFarmer">
    <portlet:param name="mvcPath" value="/html/farmers/addFarmer.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addFarmer %>" value="Add farmer"/>
<portlet:actionURL name="filterFarmer" var="filterFarmerUrl"/>

<aui:row>
    <aui:form action="<%= filterFarmerUrl %>" name="<portlet:namespace />fm">
        <b>Search parameters: </b>
        <aui:input name="searchFarmerName" label="Farmer name"> </aui:input>
        <aui:input name="searchFarmerInn" label="INN">
            <aui:validator name="range" errorMessage="INN consists of 12 digits!">[11,13]</aui:validator>
        </aui:input>
        <aui:input name="searchFarmerRegistrationRegionId" label="Registration region id"/>
        <label>Registration start date:
            <textarea readonly name="startRegistrationDate" class="form-control" type="text"
                       placeholder="dd.mm.yyyy">01.05.2022</textarea>
        </label>
        <label>Registration end date:
            <textarea readonly name="endRegistrationDate" class="form-control" type="text"
                      placeholder="dd.mm.yyyy">01.05.2022</textarea>
        </label>
        <aui:script>
            YUI().use(
            'aui-datepicker',
            function(Y) {
            new Y.DatePicker(
            {
            trigger: 'textarea',
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
            <aui:input name="searchFarmerArchiveStatus" type="checkbox" label="true" value="true"> </aui:input>
            <aui:input name="searchFarmerArchiveStatus" type="checkbox" label="false" value="false"> </aui:input>
        </label>
    </aui:form>
</aui:row>

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
