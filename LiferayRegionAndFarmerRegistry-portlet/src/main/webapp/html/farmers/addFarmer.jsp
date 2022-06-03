<%@include file="/html/init.jsp" %>
<script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>
<link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet"/>

<portlet:defineObjects />
<portlet:actionURL name="addFarmer" var="addFarmerUrl"/>

<aui:form method="POST" action="<%= addFarmerUrl %>" name="<portlet:namespace />fm">
    <aui:fieldset>
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

<%--        <div id="myDatePicker" class="aui-datepicker aui-datepicker-display aui-helper-clearfix">--%>
<%--        </div>--%>
<%--        <aui:input name="startDateHidden" id="startDateHidden" type="hidden"  value="" ></aui:input>--%>
<%--        <aui:script>--%>
<%--            var startDatePicker;--%>
<%--            AUI().use(--%>
<%--            'aui-datepicker',--%>
<%--            function(A) {--%>
<%--            startDatePicker=new A.DatePickerSelect(--%>
<%--            {--%>
<%--            appendOrder: ['m', 'd', 'y'],--%>
<%--            calendar: {--%>
<%--            dateFormat: '%m/%d/%Y',--%>

<%--            }--%>
<%--            }--%>
<%--            ).render('#myDatePicker');--%>

<%--            function submitForm(){--%>
<%--            var startDate;--%>
<%--            var endDate;--%>
<%--            A.one("#<portlet:namespace/>startDateHidden").--%>
<%--            set('value',startDatePicker.calendar.getFormattedSelectedDates ()[0]);--%>
<%--            document.<portlet:namespace/>date.submit();--%>
<%--            }--%>
<%--        </aui:script>--%>


<%--        <%--        <b>Registration Date:<b>--%>
<%--        <aui:script>--%>
<%--            AUI().use('aui-datepicker', function(A) {--%>
<%--            var simpleDatepicker1 = new A.DatePicker({--%>
<%--            trigger: '#<portlet:namespace />registrationDate',--%>
<%--            }).render('##<portlet:namespace />registrationDatePicker');--%>
<%--            });--%>
<%--        </aui:script>--%>
<%--        <div class="aui-datepicker aui-helper-clearfix" id="#<portlet:namespace />registrationDatePicker">--%>
<%--            <input type="text" name="startDate" id="<portlet:namespace />registrationDate" size="30" />--%>
<%--        </div>--%>


<%--        <button name="registrationDate" id="registrationDate" class="btn btn-primary">--%>
<%--            <i class="icon-calendar icon-white"></i> Select the registration date--%>
<%--        </button>--%>
<%--        <aui:script>--%>
<%--            YUI().use(--%>
<%--            'aui-datepicker',--%>
<%--            function(Y) {--%>
<%--            new Y.DatePicker(--%>
<%--            {--%>
<%--            trigger: 'button',--%>
<%--            popover: {--%>
<%--            zIndex: 1--%>
<%--            },--%>
<%--            on: {--%>
<%--            selectionChange: function(event) {--%>
<%--            console.log(event.newSelection)--%>
<%--            }--%>
<%--            }--%>
<%--            }--%>
<%--            );--%>
<%--            }--%>
<%--            );</aui:script>--%>

        <aui:input name="farmerArchiveStatus" value="true" type="hidden"/>
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