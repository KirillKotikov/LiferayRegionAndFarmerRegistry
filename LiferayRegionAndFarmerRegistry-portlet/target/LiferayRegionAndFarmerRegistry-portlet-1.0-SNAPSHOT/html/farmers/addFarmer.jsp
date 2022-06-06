<%@ page import="java.util.List" %>
<%@include file="/html/init.jsp" %>

<%
    List<Region> regionList = RegionLocalServiceUtil.getAllRegions();
%>

<portlet:actionURL name="addFarmer" var="addFarmerUrl"/>

<aui:form name="addFarmerForm" action="<%= addFarmerUrl %>" method="post">
    <aui:fieldset>
        <aui:input name="farmerName" value="" label="Farmer name">
            <aui:validator name="required" errorMessage="Farmer name cannot be empty!"/>
        </aui:input>
        <aui:input name="farmerLegalForm" label="Legal form"/>
        <aui:input name="farmerInn" value="" label="INN">
            <aui:validator name="required" errorMessage="INN cannot be empty!"/>
            <aui:validator name="digits" errorMessage="INN consists of 12 digits!"/>
            <aui:validator name="rangeLength" errorMessage="INN consists of 12 digits!">[12,12]</aui:validator>
        </aui:input>
        <aui:input name="farmerKpp" label="KPP">
            <aui:validator name="digits" errorMessage="KPP consists of 9 digits!"/>
            <aui:validator name="rangeLength" errorMessage="KPP consists of 9 digits!">[9,9]</aui:validator>
        </aui:input>
        <aui:input name="farmerOgrn" label="OGRN">
            <aui:validator name="digits" errorMessage="OGRN consists of 13 digits!"/>
            <aui:validator name="rangeLength" errorMessage="OGRN consists of 13 digits!">[13,13]</aui:validator>
        </aui:input>
        <aui:select name="farmerRegistrationRegionName" label="Registration region name">
            <%
                for (Region region : regionList) {
            %>
            <aui:option label="<%=region.getRegionName()%>" value="<%=region.getRegionName()%>"/>
            <%}%>
        </aui:select>
        <aui:select name="farmerFieldsRegions" label="Fields regions" multiple="true">
            <%
                for (Region region : regionList) {
            %>
            <aui:option label="<%=region.getRegionName()%>" value="<%=region.getRegionName()%>"/>
            <%}%>
        </aui:select>
        <div id="date">
            <aui:input readonly="true" name="farmerRegistrationDate" label="Registration date"
                       placeholder="dd.mm.yyyy"/>
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
        <aui:input name="farmerArchiveStatus" value="false" type="hidden"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" name="Save"/>
        <portlet:renderURL var="returnURL">
            <portlet:param name="mvcPath" value="/farmersView.jsp"/>
        </portlet:renderURL>
        <aui:button type="cancel" value="Return"
                    onClick="<%= returnURL %>"/>
    </aui:button-row>
</aui:form>