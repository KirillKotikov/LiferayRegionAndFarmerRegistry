package ru.kotikov.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.kotikov.model.Region;

import ru.kotikov.service.RegionLocalServiceUtil;

/**
 * @author Kirill_Kotikov
 * @generated
 */
public abstract class RegionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RegionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RegionLocalServiceUtil.getService());
        setClass(Region.class);

        setClassLoader(ru.kotikov.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("regionId");
    }
}
