<%@ page import="java.util.List" %>
<%@include file="/html/init.jsp" %>

<%
    List<Region> regionList = RegionLocalServiceUtil.getAllRegions();
%>
<jsp:useBean id="resultList" type="java.util.List" scope="request"/>

<portlet:renderURL var="addFarmer">
    <portlet:param name="mvcPath" value="/html/farmers/addFarmer.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addFarmer %>" value="Add farmer"/>
<portlet:actionURL name="filterFarmer" var="filterFarmerUrl"/>

<aui:form action="<%= filterFarmerUrl %>">
    <br/>
    <b>Search parameters: </b>
    <br/>
    <aui:input name="searchFarmerName" label="Farmer name"> </aui:input>
    <aui:input name="searchFarmerInn" label="INN">
        <aui:validator name="digits" errorMessage="INN consists of 12 digits!"/>
        <aui:validator name="rangeLength" errorMessage="INN consists of 12 digits!">[12,12]</aui:validator>
    </aui:input>
    <aui:select name="searchFarmerRegistrationRegionName" label="Registration region name">
        <%
            for (Region region : regionList) {
        %>
        <aui:option label="<%=region.getRegionName()%>" value="<%=region.getRegionName()%>"/>
        <%}%>
    </aui:select>
    <div id="date">
        <aui:input readonly="true" name="startRegistrationDate" label="Registration start date:"
                   placeholder="dd.mm.yyyy"/>
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
        <aui:input name="searchFarmerArchiveStatus" type="radio" label="false" value="false"
                   checked="true"> </aui:input>
    </label>
    <aui:button-row>
        <aui:button type="submit" name="Search" value="Search"/>
        <portlet:renderURL var="farmersViewUrl">
            <portlet:param name="mvcPath" value="/farmersView.jsp"/>
        </portlet:renderURL>
        <aui:button onClick="<%= farmersViewUrl %>" value="Show all farmers"/>
    </aui:button-row>
</aui:form>


<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= resultList%>"/>

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

