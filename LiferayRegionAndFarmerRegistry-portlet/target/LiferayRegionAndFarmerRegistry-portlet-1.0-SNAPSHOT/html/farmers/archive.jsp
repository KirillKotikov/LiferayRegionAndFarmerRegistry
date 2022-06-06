<%@include file="/html/init.jsp" %>

<liferay-ui:search-container>
  <liferay-ui:search-container-results
          results="<%= FarmerLocalServiceUtil.getByFarmerArchiveStatus(true) %>"/>

  <aui:fieldset label="Farmers archive"/>
  <liferay-ui:search-container-row
          className="ru.kotikov.model.Farmer" modelVar="farmer">
    <liferay-ui:search-container-column-jsp path="/html/farmers/buttons/farmerUpdate.jsp" align="left"/>
    <liferay-ui:search-container-column-text property="farmerName" name="Farmer name"/>
    <liferay-ui:search-container-column-text property="farmerLegalForm" name="Legal form"/>
    <liferay-ui:search-container-column-text property="farmerInn" name="INN"/>
    <liferay-ui:search-container-column-text property="farmerKpp" name="KPP"/>
    <liferay-ui:search-container-column-text property="farmerOgrn" name="OGRN"/>
    <liferay-ui:search-container-column-text property="farmerRegistrationRegionName" name="Registration region name"/>
    <liferay-ui:search-container-column-text property="farmerRegistrationDate" name="Registration date"/>
    <liferay-ui:search-container-column-text property="farmerArchiveStatus" name="Farmer archive status"/>
    <liferay-ui:search-container-column-jsp path="/html/farmers/buttons/changeArchiveStatus.jsp" align="right"/>
  </liferay-ui:search-container-row>
  <liferay-ui:search-iterator/>
</liferay-ui:search-container>

<aui:button-row>
  <portlet:renderURL var="farmersViewUrl">
    <portlet:param name="mvcPath" value="/farmersView.jsp"/>
  </portlet:renderURL>
  <aui:button onClick="<%= farmersViewUrl %>" value="Return"/>
</aui:button-row>