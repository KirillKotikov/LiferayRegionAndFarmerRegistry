package ru.kotikov.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.kotikov.model.Region;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Region in entity cache.
 *
 * @author Kirill_Kotikov
 * @see Region
 * @generated
 */
public class RegionCacheModel implements CacheModel<Region>, Externalizable {
    public String uuid;
    public long regionId;
    public String regionName;
    public long regionCode;
    public boolean regionArchiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", regionId=");
        sb.append(regionId);
        sb.append(", regionName=");
        sb.append(regionName);
        sb.append(", regionCode=");
        sb.append(regionCode);
        sb.append(", regionArchiveStatus=");
        sb.append(regionArchiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Region toEntityModel() {
        RegionImpl regionImpl = new RegionImpl();

        if (uuid == null) {
            regionImpl.setUuid(StringPool.BLANK);
        } else {
            regionImpl.setUuid(uuid);
        }

        regionImpl.setRegionId(regionId);

        if (regionName == null) {
            regionImpl.setRegionName(StringPool.BLANK);
        } else {
            regionImpl.setRegionName(regionName);
        }

        regionImpl.setRegionCode(regionCode);
        regionImpl.setRegionArchiveStatus(regionArchiveStatus);

        regionImpl.resetOriginalValues();

        return regionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        regionId = objectInput.readLong();
        regionName = objectInput.readUTF();
        regionCode = objectInput.readLong();
        regionArchiveStatus = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(regionId);

        if (regionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(regionName);
        }

        objectOutput.writeLong(regionCode);
        objectOutput.writeBoolean(regionArchiveStatus);
    }
}
