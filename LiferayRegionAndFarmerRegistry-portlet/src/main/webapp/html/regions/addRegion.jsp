<%@include file="/html/init.jsp" %>

<portlet:actionURL name="addRegion" var="addRegionUrl"/>

<aui:form action="<%= addRegionUrl %>" name="<portlet:namespace />fm">
  <aui:fieldset>
    <aui:input name="regionName" value="" label="Region name">
      <aui:validator name="required" errorMessage="Region name cannot be empty!"/>
    </aui:input>
    <aui:input name="regionCode" value="" label="Region code">
      <aui:validator name="number" errorMessage="Сode consists of numbers only!"/>
    </aui:input>
    <aui:input name="regionArchiveStatus" value="true" type="hidden"/>
  </aui:fieldset>

  <aui:button-row>
    <aui:button type="submit" name="Save"/>
    <portlet:renderURL var="returnURL">
      <portlet:param name="mvcPath" value="/regionsView.jsp"/>
    </portlet:renderURL>
    <aui:button type="cancel" value="Return"
                onClick="<%= returnURL %>"/>
  </aui:button-row>
</aui:form>