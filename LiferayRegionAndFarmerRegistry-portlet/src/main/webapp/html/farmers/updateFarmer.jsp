<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentFarmer" type="ru.kotikov.model.Farmer" scope="request"/>

<portlet:actionURL name="updateFarmer" var="updateFarmerUrl"/>
<aui:form action="<%= updateFarmerUrl %>" name="<portlet:namespace />fm">

    <aui:fieldset label="Editing values">
        <aui:input name="farmerName" label="Farmer name">
            <aui:validator name="required" errorMessage="Farmer name cannot be empty!"/>
        </aui:input>
        <aui:input name="farmerLegalForm" label="Legal form"/>
        <aui:input name="farmerInn" label="INN">
            <aui:validator name="required" errorMessage="INN cannot be empty!"/>
            <aui:validator name="range" errorMessage="INN consists of 12 digits!">[11,13]</aui:validator>
        </aui:input>
        <aui:input name="farmerKpp" label="KPP">
            <aui:validator name="range" errorMessage="KPP consists of 9 digits!">[8,10]</aui:validator>
        </aui:input>
        <aui:input name="farmerOgrn" label="OGRN">
            <aui:validator name="range" errorMessage="OGRN consists of 13 digits!">[12,14]</aui:validator>
        </aui:input>
        <aui:input name="farmerRegistrationRegionId" label="Registration region id"/>
        <%--    РАЙОНЫ ПОСЕВНЫЕ!!!--%>

        <%--    Дата!!!--%>
        <label>Registration date:
            <textarea class="form-control" type="text" placeholder="dd.mm.yyyy">01.05.2022 — 01.06.2022</textarea>
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