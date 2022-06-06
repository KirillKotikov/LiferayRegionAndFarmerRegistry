<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.List" %>
<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentFarmer" type="ru.kotikov.model.Farmer" scope="request"/>

<%
    List<Region> regionList = RegionLocalServiceUtil.getAllRegions();
%>
<% SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");%>

<portlet:actionURL name="updateFarmer" var="updateFarmerUrl"/>
<aui:form action="<%= updateFarmerUrl %>">
    <aui:fieldset label="Editing values">
        <aui:input name="farmerId" value="<%= currentFarmer.getFarmerId() %>" type="hidden"/>
        <aui:input name="farmerName" label="Farmer name" value="<%= currentFarmer.getFarmerName() %>">
            <aui:validator name="required" errorMessage="Farmer name cannot be empty!"/>
        </aui:input>
        <aui:input name="farmerLegalForm" label="Legal form" value="<%= currentFarmer.getFarmerLegalForm() %>"/>
        <aui:input name="farmerInn" label="INN" value="<%= currentFarmer.getFarmerInn() %>">
            <aui:validator name="required" errorMessage="INN cannot be empty!"/>
            <aui:validator name="digits" errorMessage="INN consists of 12 digits!"/>
            <aui:validator name="rangeLength" errorMessage="INN consists of 12 digits!">[11,13]</aui:validator>
        </aui:input>
        <aui:input name="farmerKpp" label="KPP" value="<%= currentFarmer.getFarmerKpp() %>">
            <aui:validator name="digits" errorMessage="KPP consists of 9 digits!"/>
            <aui:validator name="rangeLength" errorMessage="KPP consists of 9 digits!">[8,10]</aui:validator>
        </aui:input>
        <aui:input name="farmerOgrn" label="OGRN" value="<%= currentFarmer.getFarmerOgrn() %>">
            <aui:validator name="digits" errorMessage="OGRN consists of 13 digits!"/>
            <aui:validator name="rangeLength" errorMessage="OGRN consists of 13 digits!">[12,14]</aui:validator>
        </aui:input>
        <%--        <aui:input name="farmerRegistrationRegionId" label="Registration region id"--%>
        <%--                   value="<%= currentFarmer.getFarmerRegistrationRegionId() %>">--%>
        <%--            <aui:validator name="digits" errorMessage="Registration region id consists of digits only!"/>--%>
        <%--        </aui:input>--%>

        <aui:select name="farmerRegistrationRegionId" label="Registration region id">
            <%
                for (Region region : regionList) {
                    boolean selected = false;
                    if (currentFarmer.getFarmerRegistrationRegionId() == region.getRegionId()) {
                        selected = true;
                    }
            %>
            <aui:option label="<%=region.getRegionName()%>" value="<%=region.getRegionId()%>"
                        selected="<%=selected %>"/>
            <%}%>
        </aui:select>
        <%--    РАЙОНЫ ПОСЕВНЫЕ!!!--%>

        <%--    Дата!!!--%>
        <div id="date">
            <aui:input readonly="true" name="farmerRegistrationDate" label="Registration date" placeholder="dd.mm.yyyy"
                       value="<%= format.format(currentFarmer.getFarmerRegistrationDate()) %>"/>
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
        <aui:input name="farmerArchiveStatus" value="true" type="hidden"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
        <portlet:renderURL var="FarmersViewUrl">
            <portlet:param name="mvcPath" value="/farmersView.jsp"/>
        </portlet:renderURL>

        <aui:button onClick="<%= FarmersViewUrl %>" value="Return"/>
    </aui:button-row>
</aui:form>