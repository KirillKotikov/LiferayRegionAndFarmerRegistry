<%@include file="/html/init.jsp" %>

<jsp:useBean id="currentRegion" type="ru.kotikov.model.Region" scope="request"/>

<portlet:actionURL name="updateRegion" var="updateRegionUrl"/>

<aui:form action="<%= updateRegionUrl %>">
    <aui:fieldset label="Editing values">
        <aui:input name="regionId" value="<%= currentRegion.getRegionId() %>" type="hidden"/>
        <aui:input name="regionName" label="Region name" value="<%= currentRegion.getRegionName() %>">
            <aui:validator name="required"/>
        </aui:input>
        <aui:input name="regionCode" label="Region code" value="<%= currentRegion.getRegionCode() %>"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>

        <portlet:renderURL var="RegionsViewUrl">
            <portlet:param name="mvcPath" value="/regionsView.jsp"/>
        </portlet:renderURL>
        <aui:button onClick="<%= RegionsViewUrl %>" value="Return"/>
    </aui:button-row>
</aui:form>