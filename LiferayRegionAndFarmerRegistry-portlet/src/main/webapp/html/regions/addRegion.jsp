<%@include file="/html/init.jsp" %>
<portlet:defineObjects />

<portlet:actionURL name="addRegion" var="addRegionUrl"/>

<aui:form name="addRegionForm" action="<%= addRegionUrl %>" method="post">
  <aui:fieldset>
    <aui:input name="regionName" value="" label="Region name">
      <aui:validator name="required"
                     errorMessage="Region name cannot be empty!"/>
    </aui:input>
    <aui:input name="regionCode" label="Region code">
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