package ru.kotikov.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Region}.
 * </p>
 *
 * @author Kirill_Kotikov
 * @see Region
 * @generated
 */
public class RegionWrapper implements Region, ModelWrapper<Region> {
    private Region _region;

    public RegionWrapper(Region region) {
        _region = region;
    }

    @Override
    public Class<?> getModelClass() {
        return Region.class;
    }

    @Override
    public String getModelClassName() {
        return Region.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("regionId", getRegionId());
        attributes.put("regionName", getRegionName());
        attributes.put("regionCode", getRegionCode());
        attributes.put("regionArchiveStatus", getRegionArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long regionId = (Long) attributes.get("regionId");

        if (regionId != null) {
            setRegionId(regionId);
        }

        String regionName = (String) attributes.get("regionName");

        if (regionName != null) {
            setRegionName(regionName);
        }

        Long regionCode = (Long) attributes.get("regionCode");

        if (regionCode != null) {
            setRegionCode(regionCode);
        }

        Boolean regionArchiveStatus = (Boolean) attributes.get(
                "regionArchiveStatus");

        if (regionArchiveStatus != null) {
            setRegionArchiveStatus(regionArchiveStatus);
        }
    }

    /**
    * Returns the primary key of this region.
    *
    * @return the primary key of this region
    */
    @Override
    public long getPrimaryKey() {
        return _region.getPrimaryKey();
    }

    /**
    * Sets the primary key of this region.
    *
    * @param primaryKey the primary key of this region
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _region.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this region.
    *
    * @return the uuid of this region
    */
    @Override
    public java.lang.String getUuid() {
        return _region.getUuid();
    }

    /**
    * Sets the uuid of this region.
    *
    * @param uuid the uuid of this region
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _region.setUuid(uuid);
    }

    /**
    * Returns the region ID of this region.
    *
    * @return the region ID of this region
    */
    @Override
    public long getRegionId() {
        return _region.getRegionId();
    }

    /**
    * Sets the region ID of this region.
    *
    * @param regionId the region ID of this region
    */
    @Override
    public void setRegionId(long regionId) {
        _region.setRegionId(regionId);
    }

    /**
    * Returns the region name of this region.
    *
    * @return the region name of this region
    */
    @Override
    public java.lang.String getRegionName() {
        return _region.getRegionName();
    }

    /**
    * Sets the region name of this region.
    *
    * @param regionName the region name of this region
    */
    @Override
    public void setRegionName(java.lang.String regionName) {
        _region.setRegionName(regionName);
    }

    /**
    * Returns the region code of this region.
    *
    * @return the region code of this region
    */
    @Override
    public long getRegionCode() {
        return _region.getRegionCode();
    }

    /**
    * Sets the region code of this region.
    *
    * @param regionCode the region code of this region
    */
    @Override
    public void setRegionCode(long regionCode) {
        _region.setRegionCode(regionCode);
    }

    /**
    * Returns the region archive status of this region.
    *
    * @return the region archive status of this region
    */
    @Override
    public boolean getRegionArchiveStatus() {
        return _region.getRegionArchiveStatus();
    }

    /**
    * Returns <code>true</code> if this region is region archive status.
    *
    * @return <code>true</code> if this region is region archive status; <code>false</code> otherwise
    */
    @Override
    public boolean isRegionArchiveStatus() {
        return _region.isRegionArchiveStatus();
    }

    /**
    * Sets whether this region is region archive status.
    *
    * @param regionArchiveStatus the region archive status of this region
    */
    @Override
    public void setRegionArchiveStatus(boolean regionArchiveStatus) {
        _region.setRegionArchiveStatus(regionArchiveStatus);
    }

    @Override
    public boolean isNew() {
        return _region.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _region.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _region.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _region.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _region.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _region.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _region.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _region.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _region.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _region.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _region.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RegionWrapper((Region) _region.clone());
    }

    @Override
    public int compareTo(ru.kotikov.model.Region region) {
        return _region.compareTo(region);
    }

    @Override
    public int hashCode() {
        return _region.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.kotikov.model.Region> toCacheModel() {
        return _region.toCacheModel();
    }

    @Override
    public ru.kotikov.model.Region toEscapedModel() {
        return new RegionWrapper(_region.toEscapedModel());
    }

    @Override
    public ru.kotikov.model.Region toUnescapedModel() {
        return new RegionWrapper(_region.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _region.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _region.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _region.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegionWrapper)) {
            return false;
        }

        RegionWrapper regionWrapper = (RegionWrapper) obj;

        if (Validator.equals(_region, regionWrapper._region)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Region getWrappedRegion() {
        return _region;
    }

    @Override
    public Region getWrappedModel() {
        return _region;
    }

    @Override
    public void resetOriginalValues() {
        _region.resetOriginalValues();
    }
}
