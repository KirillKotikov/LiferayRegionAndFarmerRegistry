package ru.kotikov.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Kirill_Kotikov
 * @generated
 */
public class RegionSoap implements Serializable {
    private String _uuid;
    private long _regionId;
    private String _regionName;
    private long _regionCode;
    private boolean _regionArchiveStatus;

    public RegionSoap() {
    }

    public static RegionSoap toSoapModel(Region model) {
        RegionSoap soapModel = new RegionSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setRegionId(model.getRegionId());
        soapModel.setRegionName(model.getRegionName());
        soapModel.setRegionCode(model.getRegionCode());
        soapModel.setRegionArchiveStatus(model.getRegionArchiveStatus());

        return soapModel;
    }

    public static RegionSoap[] toSoapModels(Region[] models) {
        RegionSoap[] soapModels = new RegionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RegionSoap[][] toSoapModels(Region[][] models) {
        RegionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RegionSoap[models.length][models[0].length];
        } else {
            soapModels = new RegionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RegionSoap[] toSoapModels(List<Region> models) {
        List<RegionSoap> soapModels = new ArrayList<RegionSoap>(models.size());

        for (Region model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RegionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _regionId;
    }

    public void setPrimaryKey(long pk) {
        setRegionId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getRegionId() {
        return _regionId;
    }

    public void setRegionId(long regionId) {
        _regionId = regionId;
    }

    public String getRegionName() {
        return _regionName;
    }

    public void setRegionName(String regionName) {
        _regionName = regionName;
    }

    public long getRegionCode() {
        return _regionCode;
    }

    public void setRegionCode(long regionCode) {
        _regionCode = regionCode;
    }

    public boolean getRegionArchiveStatus() {
        return _regionArchiveStatus;
    }

    public boolean isRegionArchiveStatus() {
        return _regionArchiveStatus;
    }

    public void setRegionArchiveStatus(boolean regionArchiveStatus) {
        _regionArchiveStatus = regionArchiveStatus;
    }
}
