package ru.kotikov.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.kotikov.service.ClpSerializer;
import ru.kotikov.service.RegionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RegionClp extends BaseModelImpl<Region> implements Region {
    private String _uuid;
    private long _regionId;
    private String _regionName;
    private long _regionCode;
    private boolean _regionArchiveStatus;
    private BaseModel<?> _regionRemoteModel;
    private Class<?> _clpSerializerClass = ru.kotikov.service.ClpSerializer.class;

    public RegionClp() {
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
    public long getPrimaryKey() {
        return _regionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRegionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _regionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_regionRemoteModel != null) {
            try {
                Class<?> clazz = _regionRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_regionRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRegionId() {
        return _regionId;
    }

    @Override
    public void setRegionId(long regionId) {
        _regionId = regionId;

        if (_regionRemoteModel != null) {
            try {
                Class<?> clazz = _regionRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionId", long.class);

                method.invoke(_regionRemoteModel, regionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRegionName() {
        return _regionName;
    }

    @Override
    public void setRegionName(String regionName) {
        _regionName = regionName;

        if (_regionRemoteModel != null) {
            try {
                Class<?> clazz = _regionRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionName", String.class);

                method.invoke(_regionRemoteModel, regionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRegionCode() {
        return _regionCode;
    }

    @Override
    public void setRegionCode(long regionCode) {
        _regionCode = regionCode;

        if (_regionRemoteModel != null) {
            try {
                Class<?> clazz = _regionRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionCode", long.class);

                method.invoke(_regionRemoteModel, regionCode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getRegionArchiveStatus() {
        return _regionArchiveStatus;
    }

    @Override
    public boolean isRegionArchiveStatus() {
        return _regionArchiveStatus;
    }

    @Override
    public void setRegionArchiveStatus(boolean regionArchiveStatus) {
        _regionArchiveStatus = regionArchiveStatus;

        if (_regionRemoteModel != null) {
            try {
                Class<?> clazz = _regionRemoteModel.getClass();

                Method method = clazz.getMethod("setRegionArchiveStatus",
                        boolean.class);

                method.invoke(_regionRemoteModel, regionArchiveStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRegionRemoteModel() {
        return _regionRemoteModel;
    }

    public void setRegionRemoteModel(BaseModel<?> regionRemoteModel) {
        _regionRemoteModel = regionRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _regionRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_regionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RegionLocalServiceUtil.addRegion(this);
        } else {
            RegionLocalServiceUtil.updateRegion(this);
        }
    }

    @Override
    public Region toEscapedModel() {
        return (Region) ProxyUtil.newProxyInstance(Region.class.getClassLoader(),
            new Class[] { Region.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RegionClp clone = new RegionClp();

        clone.setUuid(getUuid());
        clone.setRegionId(getRegionId());
        clone.setRegionName(getRegionName());
        clone.setRegionCode(getRegionCode());
        clone.setRegionArchiveStatus(getRegionArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(Region region) {
        int value = 0;

        value = getRegionName().compareTo(region.getRegionName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RegionClp)) {
            return false;
        }

        RegionClp region = (RegionClp) obj;

        long primaryKey = region.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", regionId=");
        sb.append(getRegionId());
        sb.append(", regionName=");
        sb.append(getRegionName());
        sb.append(", regionCode=");
        sb.append(getRegionCode());
        sb.append(", regionArchiveStatus=");
        sb.append(getRegionArchiveStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("ru.kotikov.model.Region");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionId</column-name><column-value><![CDATA[");
        sb.append(getRegionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionName</column-name><column-value><![CDATA[");
        sb.append(getRegionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionCode</column-name><column-value><![CDATA[");
        sb.append(getRegionCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>regionArchiveStatus</column-name><column-value><![CDATA[");
        sb.append(getRegionArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
