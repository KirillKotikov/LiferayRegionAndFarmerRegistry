package ru.kotikov.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.kotikov.model.Farmer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author Kirill_Kotikov
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public String uuid;
    public long farmerId;
    public String farmerName;
    public String farmerLegalForm;
    public long farmerInn;
    public long farmerKpp;
    public long farmerOgrn;
    public Long farmerRegistrationRegionId;
    public String farmerFieldRegionsId;
    public long farmerRegistrationDate;
    public boolean farmerArchiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", farmerId=");
        sb.append(farmerId);
        sb.append(", farmerName=");
        sb.append(farmerName);
        sb.append(", farmerLegalForm=");
        sb.append(farmerLegalForm);
        sb.append(", farmerInn=");
        sb.append(farmerInn);
        sb.append(", farmerKpp=");
        sb.append(farmerKpp);
        sb.append(", farmerOgrn=");
        sb.append(farmerOgrn);
        sb.append(", farmerRegistrationRegionId=");
        sb.append(farmerRegistrationRegionId);
        sb.append(", farmerFieldRegionsId=");
        sb.append(farmerFieldRegionsId);
        sb.append(", farmerRegistrationDate=");
        sb.append(farmerRegistrationDate);
        sb.append(", farmerArchiveStatus=");
        sb.append(farmerArchiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        if (uuid == null) {
            farmerImpl.setUuid(StringPool.BLANK);
        } else {
            farmerImpl.setUuid(uuid);
        }

        farmerImpl.setFarmerId(farmerId);

        if (farmerName == null) {
            farmerImpl.setFarmerName(StringPool.BLANK);
        } else {
            farmerImpl.setFarmerName(farmerName);
        }

        if (farmerLegalForm == null) {
            farmerImpl.setFarmerLegalForm(StringPool.BLANK);
        } else {
            farmerImpl.setFarmerLegalForm(farmerLegalForm);
        }

        farmerImpl.setFarmerInn(farmerInn);
        farmerImpl.setFarmerKpp(farmerKpp);
        farmerImpl.setFarmerOgrn(farmerOgrn);
        farmerImpl.setFarmerRegistrationRegionId(farmerRegistrationRegionId);

        if (farmerFieldRegionsId == null) {
            farmerImpl.setFarmerFieldRegionsId(StringPool.BLANK);
        } else {
            farmerImpl.setFarmerFieldRegionsId(farmerFieldRegionsId);
        }

        if (farmerRegistrationDate == Long.MIN_VALUE) {
            farmerImpl.setFarmerRegistrationDate(null);
        } else {
            farmerImpl.setFarmerRegistrationDate(new Date(
                    farmerRegistrationDate));
        }

        farmerImpl.setFarmerArchiveStatus(farmerArchiveStatus);

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        farmerId = objectInput.readLong();
        farmerName = objectInput.readUTF();
        farmerLegalForm = objectInput.readUTF();
        farmerInn = objectInput.readLong();
        farmerKpp = objectInput.readLong();
        farmerOgrn = objectInput.readLong();
        farmerRegistrationRegionId = objectInput.readLong();
        farmerFieldRegionsId = objectInput.readUTF();
        farmerRegistrationDate = objectInput.readLong();
        farmerArchiveStatus = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(farmerId);

        if (farmerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(farmerName);
        }

        if (farmerLegalForm == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(farmerLegalForm);
        }

        objectOutput.writeLong(farmerInn);
        objectOutput.writeLong(farmerKpp);
        objectOutput.writeLong(farmerOgrn);
        objectOutput.writeLong(farmerRegistrationRegionId);

        if (farmerFieldRegionsId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(farmerFieldRegionsId);
        }

        objectOutput.writeLong(farmerRegistrationDate);
        objectOutput.writeBoolean(farmerArchiveStatus);
    }
}
