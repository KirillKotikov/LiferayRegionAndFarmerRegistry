package ru.kotikov.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Farmer}.
 * </p>
 *
 * @author Kirill_Kotikov
 * @see Farmer
 * @generated
 */
public class FarmerWrapper implements Farmer, ModelWrapper<Farmer> {
    private Farmer _farmer;

    public FarmerWrapper(Farmer farmer) {
        _farmer = farmer;
    }

    @Override
    public Class<?> getModelClass() {
        return Farmer.class;
    }

    @Override
    public String getModelClassName() {
        return Farmer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("farmerId", getFarmerId());
        attributes.put("farmerName", getFarmerName());
        attributes.put("farmerLegalForm", getFarmerLegalForm());
        attributes.put("farmerInn", getFarmerInn());
        attributes.put("farmerKpp", getFarmerKpp());
        attributes.put("farmerOgrn", getFarmerOgrn());
        attributes.put("farmerRegistrationRegionName",
            getFarmerRegistrationRegionName());
        attributes.put("farmerRegistrationDate", getFarmerRegistrationDate());
        attributes.put("farmerArchiveStatus", getFarmerArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
        }

        String farmerName = (String) attributes.get("farmerName");

        if (farmerName != null) {
            setFarmerName(farmerName);
        }

        String farmerLegalForm = (String) attributes.get("farmerLegalForm");

        if (farmerLegalForm != null) {
            setFarmerLegalForm(farmerLegalForm);
        }

        Long farmerInn = (Long) attributes.get("farmerInn");

        if (farmerInn != null) {
            setFarmerInn(farmerInn);
        }

        Long farmerKpp = (Long) attributes.get("farmerKpp");

        if (farmerKpp != null) {
            setFarmerKpp(farmerKpp);
        }

        Long farmerOgrn = (Long) attributes.get("farmerOgrn");

        if (farmerOgrn != null) {
            setFarmerOgrn(farmerOgrn);
        }

        String farmerRegistrationRegionName = (String) attributes.get(
                "farmerRegistrationRegionName");

        if (farmerRegistrationRegionName != null) {
            setFarmerRegistrationRegionName(farmerRegistrationRegionName);
        }

        Date farmerRegistrationDate = (Date) attributes.get(
                "farmerRegistrationDate");

        if (farmerRegistrationDate != null) {
            setFarmerRegistrationDate(farmerRegistrationDate);
        }

        Boolean farmerArchiveStatus = (Boolean) attributes.get(
                "farmerArchiveStatus");

        if (farmerArchiveStatus != null) {
            setFarmerArchiveStatus(farmerArchiveStatus);
        }
    }

    /**
    * Returns the primary key of this farmer.
    *
    * @return the primary key of this farmer
    */
    @Override
    public long getPrimaryKey() {
        return _farmer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this farmer.
    *
    * @param primaryKey the primary key of this farmer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _farmer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this farmer.
    *
    * @return the uuid of this farmer
    */
    @Override
    public java.lang.String getUuid() {
        return _farmer.getUuid();
    }

    /**
    * Sets the uuid of this farmer.
    *
    * @param uuid the uuid of this farmer
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _farmer.setUuid(uuid);
    }

    /**
    * Returns the farmer ID of this farmer.
    *
    * @return the farmer ID of this farmer
    */
    @Override
    public long getFarmerId() {
        return _farmer.getFarmerId();
    }

    /**
    * Sets the farmer ID of this farmer.
    *
    * @param farmerId the farmer ID of this farmer
    */
    @Override
    public void setFarmerId(long farmerId) {
        _farmer.setFarmerId(farmerId);
    }

    /**
    * Returns the farmer name of this farmer.
    *
    * @return the farmer name of this farmer
    */
    @Override
    public java.lang.String getFarmerName() {
        return _farmer.getFarmerName();
    }

    /**
    * Sets the farmer name of this farmer.
    *
    * @param farmerName the farmer name of this farmer
    */
    @Override
    public void setFarmerName(java.lang.String farmerName) {
        _farmer.setFarmerName(farmerName);
    }

    /**
    * Returns the farmer legal form of this farmer.
    *
    * @return the farmer legal form of this farmer
    */
    @Override
    public java.lang.String getFarmerLegalForm() {
        return _farmer.getFarmerLegalForm();
    }

    /**
    * Sets the farmer legal form of this farmer.
    *
    * @param farmerLegalForm the farmer legal form of this farmer
    */
    @Override
    public void setFarmerLegalForm(java.lang.String farmerLegalForm) {
        _farmer.setFarmerLegalForm(farmerLegalForm);
    }

    /**
    * Returns the farmer inn of this farmer.
    *
    * @return the farmer inn of this farmer
    */
    @Override
    public long getFarmerInn() {
        return _farmer.getFarmerInn();
    }

    /**
    * Sets the farmer inn of this farmer.
    *
    * @param farmerInn the farmer inn of this farmer
    */
    @Override
    public void setFarmerInn(long farmerInn) {
        _farmer.setFarmerInn(farmerInn);
    }

    /**
    * Returns the farmer kpp of this farmer.
    *
    * @return the farmer kpp of this farmer
    */
    @Override
    public long getFarmerKpp() {
        return _farmer.getFarmerKpp();
    }

    /**
    * Sets the farmer kpp of this farmer.
    *
    * @param farmerKpp the farmer kpp of this farmer
    */
    @Override
    public void setFarmerKpp(long farmerKpp) {
        _farmer.setFarmerKpp(farmerKpp);
    }

    /**
    * Returns the farmer ogrn of this farmer.
    *
    * @return the farmer ogrn of this farmer
    */
    @Override
    public long getFarmerOgrn() {
        return _farmer.getFarmerOgrn();
    }

    /**
    * Sets the farmer ogrn of this farmer.
    *
    * @param farmerOgrn the farmer ogrn of this farmer
    */
    @Override
    public void setFarmerOgrn(long farmerOgrn) {
        _farmer.setFarmerOgrn(farmerOgrn);
    }

    /**
    * Returns the farmer registration region name of this farmer.
    *
    * @return the farmer registration region name of this farmer
    */
    @Override
    public java.lang.String getFarmerRegistrationRegionName() {
        return _farmer.getFarmerRegistrationRegionName();
    }

    /**
    * Sets the farmer registration region name of this farmer.
    *
    * @param farmerRegistrationRegionName the farmer registration region name of this farmer
    */
    @Override
    public void setFarmerRegistrationRegionName(
        java.lang.String farmerRegistrationRegionName) {
        _farmer.setFarmerRegistrationRegionName(farmerRegistrationRegionName);
    }

    /**
    * Returns the farmer registration date of this farmer.
    *
    * @return the farmer registration date of this farmer
    */
    @Override
    public java.util.Date getFarmerRegistrationDate() {
        return _farmer.getFarmerRegistrationDate();
    }

    /**
    * Sets the farmer registration date of this farmer.
    *
    * @param farmerRegistrationDate the farmer registration date of this farmer
    */
    @Override
    public void setFarmerRegistrationDate(java.util.Date farmerRegistrationDate) {
        _farmer.setFarmerRegistrationDate(farmerRegistrationDate);
    }

    /**
    * Returns the farmer archive status of this farmer.
    *
    * @return the farmer archive status of this farmer
    */
    @Override
    public boolean getFarmerArchiveStatus() {
        return _farmer.getFarmerArchiveStatus();
    }

    /**
    * Returns <code>true</code> if this farmer is farmer archive status.
    *
    * @return <code>true</code> if this farmer is farmer archive status; <code>false</code> otherwise
    */
    @Override
    public boolean isFarmerArchiveStatus() {
        return _farmer.isFarmerArchiveStatus();
    }

    /**
    * Sets whether this farmer is farmer archive status.
    *
    * @param farmerArchiveStatus the farmer archive status of this farmer
    */
    @Override
    public void setFarmerArchiveStatus(boolean farmerArchiveStatus) {
        _farmer.setFarmerArchiveStatus(farmerArchiveStatus);
    }

    @Override
    public boolean isNew() {
        return _farmer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _farmer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _farmer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _farmer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _farmer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _farmer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _farmer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _farmer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _farmer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _farmer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _farmer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FarmerWrapper((Farmer) _farmer.clone());
    }

    @Override
    public int compareTo(ru.kotikov.model.Farmer farmer) {
        return _farmer.compareTo(farmer);
    }

    @Override
    public int hashCode() {
        return _farmer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.kotikov.model.Farmer> toCacheModel() {
        return _farmer.toCacheModel();
    }

    @Override
    public ru.kotikov.model.Farmer toEscapedModel() {
        return new FarmerWrapper(_farmer.toEscapedModel());
    }

    @Override
    public ru.kotikov.model.Farmer toUnescapedModel() {
        return new FarmerWrapper(_farmer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _farmer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _farmer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerWrapper)) {
            return false;
        }

        FarmerWrapper farmerWrapper = (FarmerWrapper) obj;

        if (Validator.equals(_farmer, farmerWrapper._farmer)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Farmer getWrappedFarmer() {
        return _farmer;
    }

    @Override
    public Farmer getWrappedModel() {
        return _farmer;
    }

    @Override
    public void resetOriginalValues() {
        _farmer.resetOriginalValues();
    }
}
