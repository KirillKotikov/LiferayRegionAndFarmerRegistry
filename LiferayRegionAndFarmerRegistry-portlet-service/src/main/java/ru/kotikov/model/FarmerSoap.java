package ru.kotikov.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Kirill_Kotikov
 * @generated
 */
public class FarmerSoap implements Serializable {
    private String _uuid;
    private long _farmerId;
    private String _farmerName;
    private String _farmerLegalForm;
    private long _farmerInn;
    private long _farmerKpp;
    private long _farmerOgrn;
    private Long _farmerRegistrationRegionId;
    private Date _farmerRegistrationDate;
    private boolean _farmerArchiveStatus;

    public FarmerSoap() {
    }

    public static FarmerSoap toSoapModel(Farmer model) {
        FarmerSoap soapModel = new FarmerSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setFarmerName(model.getFarmerName());
        soapModel.setFarmerLegalForm(model.getFarmerLegalForm());
        soapModel.setFarmerInn(model.getFarmerInn());
        soapModel.setFarmerKpp(model.getFarmerKpp());
        soapModel.setFarmerOgrn(model.getFarmerOgrn());
        soapModel.setFarmerRegistrationRegionId(model.getFarmerRegistrationRegionId());
        soapModel.setFarmerRegistrationDate(model.getFarmerRegistrationDate());
        soapModel.setFarmerArchiveStatus(model.getFarmerArchiveStatus());

        return soapModel;
    }

    public static FarmerSoap[] toSoapModels(Farmer[] models) {
        FarmerSoap[] soapModels = new FarmerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[][] toSoapModels(Farmer[][] models) {
        FarmerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FarmerSoap[models.length][models[0].length];
        } else {
            soapModels = new FarmerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[] toSoapModels(List<Farmer> models) {
        List<FarmerSoap> soapModels = new ArrayList<FarmerSoap>(models.size());

        for (Farmer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FarmerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _farmerId;
    }

    public void setPrimaryKey(long pk) {
        setFarmerId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
    }

    public String getFarmerName() {
        return _farmerName;
    }

    public void setFarmerName(String farmerName) {
        _farmerName = farmerName;
    }

    public String getFarmerLegalForm() {
        return _farmerLegalForm;
    }

    public void setFarmerLegalForm(String farmerLegalForm) {
        _farmerLegalForm = farmerLegalForm;
    }

    public long getFarmerInn() {
        return _farmerInn;
    }

    public void setFarmerInn(long farmerInn) {
        _farmerInn = farmerInn;
    }

    public long getFarmerKpp() {
        return _farmerKpp;
    }

    public void setFarmerKpp(long farmerKpp) {
        _farmerKpp = farmerKpp;
    }

    public long getFarmerOgrn() {
        return _farmerOgrn;
    }

    public void setFarmerOgrn(long farmerOgrn) {
        _farmerOgrn = farmerOgrn;
    }

    public Long getFarmerRegistrationRegionId() {
        return _farmerRegistrationRegionId;
    }

    public void setFarmerRegistrationRegionId(Long farmerRegistrationRegionId) {
        _farmerRegistrationRegionId = farmerRegistrationRegionId;
    }

    public Date getFarmerRegistrationDate() {
        return _farmerRegistrationDate;
    }

    public void setFarmerRegistrationDate(Date farmerRegistrationDate) {
        _farmerRegistrationDate = farmerRegistrationDate;
    }

    public boolean getFarmerArchiveStatus() {
        return _farmerArchiveStatus;
    }

    public boolean isFarmerArchiveStatus() {
        return _farmerArchiveStatus;
    }

    public void setFarmerArchiveStatus(boolean farmerArchiveStatus) {
        _farmerArchiveStatus = farmerArchiveStatus;
    }
}
