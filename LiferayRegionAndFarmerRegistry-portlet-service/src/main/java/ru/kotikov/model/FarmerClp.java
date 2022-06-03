package ru.kotikov.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.kotikov.service.ClpSerializer;
import ru.kotikov.service.FarmerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class FarmerClp extends BaseModelImpl<Farmer> implements Farmer {
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
    private BaseModel<?> _farmerRemoteModel;
    private Class<?> _clpSerializerClass = ru.kotikov.service.ClpSerializer.class;

    public FarmerClp() {
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
    public long getPrimaryKey() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFarmerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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
        attributes.put("farmerRegistrationRegionId",
            getFarmerRegistrationRegionId());
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

        Long farmerRegistrationRegionId = (Long) attributes.get(
                "farmerRegistrationRegionId");

        if (farmerRegistrationRegionId != null) {
            setFarmerRegistrationRegionId(farmerRegistrationRegionId);
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_farmerRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerId", long.class);

                method.invoke(_farmerRemoteModel, farmerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFarmerName() {
        return _farmerName;
    }

    @Override
    public void setFarmerName(String farmerName) {
        _farmerName = farmerName;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerName", String.class);

                method.invoke(_farmerRemoteModel, farmerName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFarmerLegalForm() {
        return _farmerLegalForm;
    }

    @Override
    public void setFarmerLegalForm(String farmerLegalForm) {
        _farmerLegalForm = farmerLegalForm;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerLegalForm",
                        String.class);

                method.invoke(_farmerRemoteModel, farmerLegalForm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFarmerInn() {
        return _farmerInn;
    }

    @Override
    public void setFarmerInn(long farmerInn) {
        _farmerInn = farmerInn;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerInn", long.class);

                method.invoke(_farmerRemoteModel, farmerInn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFarmerKpp() {
        return _farmerKpp;
    }

    @Override
    public void setFarmerKpp(long farmerKpp) {
        _farmerKpp = farmerKpp;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerKpp", long.class);

                method.invoke(_farmerRemoteModel, farmerKpp);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFarmerOgrn() {
        return _farmerOgrn;
    }

    @Override
    public void setFarmerOgrn(long farmerOgrn) {
        _farmerOgrn = farmerOgrn;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerOgrn", long.class);

                method.invoke(_farmerRemoteModel, farmerOgrn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getFarmerRegistrationRegionId() {
        return _farmerRegistrationRegionId;
    }

    @Override
    public void setFarmerRegistrationRegionId(Long farmerRegistrationRegionId) {
        _farmerRegistrationRegionId = farmerRegistrationRegionId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerRegistrationRegionId",
                        Long.class);

                method.invoke(_farmerRemoteModel, farmerRegistrationRegionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFarmerRegistrationDate() {
        return _farmerRegistrationDate;
    }

    @Override
    public void setFarmerRegistrationDate(Date farmerRegistrationDate) {
        _farmerRegistrationDate = farmerRegistrationDate;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerRegistrationDate",
                        Date.class);

                method.invoke(_farmerRemoteModel, farmerRegistrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getFarmerArchiveStatus() {
        return _farmerArchiveStatus;
    }

    @Override
    public boolean isFarmerArchiveStatus() {
        return _farmerArchiveStatus;
    }

    @Override
    public void setFarmerArchiveStatus(boolean farmerArchiveStatus) {
        _farmerArchiveStatus = farmerArchiveStatus;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerArchiveStatus",
                        boolean.class);

                method.invoke(_farmerRemoteModel, farmerArchiveStatus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFarmerRemoteModel() {
        return _farmerRemoteModel;
    }

    public void setFarmerRemoteModel(BaseModel<?> farmerRemoteModel) {
        _farmerRemoteModel = farmerRemoteModel;
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

        Class<?> remoteModelClass = _farmerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_farmerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FarmerLocalServiceUtil.addFarmer(this);
        } else {
            FarmerLocalServiceUtil.updateFarmer(this);
        }
    }

    @Override
    public Farmer toEscapedModel() {
        return (Farmer) ProxyUtil.newProxyInstance(Farmer.class.getClassLoader(),
            new Class[] { Farmer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FarmerClp clone = new FarmerClp();

        clone.setUuid(getUuid());
        clone.setFarmerId(getFarmerId());
        clone.setFarmerName(getFarmerName());
        clone.setFarmerLegalForm(getFarmerLegalForm());
        clone.setFarmerInn(getFarmerInn());
        clone.setFarmerKpp(getFarmerKpp());
        clone.setFarmerOgrn(getFarmerOgrn());
        clone.setFarmerRegistrationRegionId(getFarmerRegistrationRegionId());
        clone.setFarmerRegistrationDate(getFarmerRegistrationDate());
        clone.setFarmerArchiveStatus(getFarmerArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(Farmer farmer) {
        int value = 0;

        value = getFarmerName().compareTo(farmer.getFarmerName());

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

        if (!(obj instanceof FarmerClp)) {
            return false;
        }

        FarmerClp farmer = (FarmerClp) obj;

        long primaryKey = farmer.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", farmerId=");
        sb.append(getFarmerId());
        sb.append(", farmerName=");
        sb.append(getFarmerName());
        sb.append(", farmerLegalForm=");
        sb.append(getFarmerLegalForm());
        sb.append(", farmerInn=");
        sb.append(getFarmerInn());
        sb.append(", farmerKpp=");
        sb.append(getFarmerKpp());
        sb.append(", farmerOgrn=");
        sb.append(getFarmerOgrn());
        sb.append(", farmerRegistrationRegionId=");
        sb.append(getFarmerRegistrationRegionId());
        sb.append(", farmerRegistrationDate=");
        sb.append(getFarmerRegistrationDate());
        sb.append(", farmerArchiveStatus=");
        sb.append(getFarmerArchiveStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("ru.kotikov.model.Farmer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerId</column-name><column-value><![CDATA[");
        sb.append(getFarmerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerName</column-name><column-value><![CDATA[");
        sb.append(getFarmerName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerLegalForm</column-name><column-value><![CDATA[");
        sb.append(getFarmerLegalForm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerInn</column-name><column-value><![CDATA[");
        sb.append(getFarmerInn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerKpp</column-name><column-value><![CDATA[");
        sb.append(getFarmerKpp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerOgrn</column-name><column-value><![CDATA[");
        sb.append(getFarmerOgrn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerRegistrationRegionId</column-name><column-value><![CDATA[");
        sb.append(getFarmerRegistrationRegionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerRegistrationDate</column-name><column-value><![CDATA[");
        sb.append(getFarmerRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerArchiveStatus</column-name><column-value><![CDATA[");
        sb.append(getFarmerArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
