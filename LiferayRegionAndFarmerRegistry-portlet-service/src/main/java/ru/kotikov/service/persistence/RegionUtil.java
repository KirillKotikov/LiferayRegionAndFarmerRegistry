package ru.kotikov.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.kotikov.model.Region;

import java.util.List;

/**
 * The persistence utility for the region service. This utility wraps {@link RegionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kirill_Kotikov
 * @see RegionPersistence
 * @see RegionPersistenceImpl
 * @generated
 */
public class RegionUtil {
    private static RegionPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Region region) {
        getPersistence().clearCache(region);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Region> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Region update(Region region) throws SystemException {
        return getPersistence().update(region);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Region update(Region region, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(region, serviceContext);
    }

    /**
    * Returns all the regions where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the regions where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the regions where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the regions before and after the current region in the ordered set where uuid = &#63;.
    *
    * @param regionId the primary key of the current region
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next region
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region[] findByUuid_PrevAndNext(
        long regionId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByUuid_PrevAndNext(regionId, uuid, orderByComparator);
    }

    /**
    * Removes all the regions where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of regions where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns all the regions where regionName = &#63;.
    *
    * @param regionName the region name
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionName(regionName);
    }

    /**
    * Returns a range of all the regions where regionName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionName the region name
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionName(regionName, start, end);
    }

    /**
    * Returns an ordered range of all the regions where regionName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionName the region name
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionName(regionName, start, end, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByRegionName_First(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionName_First(regionName, orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByRegionName_First(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionName_First(regionName, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByRegionName_Last(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionName_Last(regionName, orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByRegionName_Last(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionName_Last(regionName, orderByComparator);
    }

    /**
    * Returns the regions before and after the current region in the ordered set where regionName = &#63;.
    *
    * @param regionId the primary key of the current region
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next region
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region[] findByRegionName_PrevAndNext(
        long regionId, java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionName_PrevAndNext(regionId, regionName,
            orderByComparator);
    }

    /**
    * Removes all the regions where regionName = &#63; from the database.
    *
    * @param regionName the region name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRegionName(java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRegionName(regionName);
    }

    /**
    * Returns the number of regions where regionName = &#63;.
    *
    * @param regionName the region name
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegionName(java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRegionName(regionName);
    }

    /**
    * Returns all the regions where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRegionArchiveStatus(regionArchiveStatus);
    }

    /**
    * Returns a range of all the regions where regionArchiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionArchiveStatus the region archive status
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionArchiveStatus(regionArchiveStatus, start, end);
    }

    /**
    * Returns an ordered range of all the regions where regionArchiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionArchiveStatus the region archive status
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByRegionArchiveStatus(regionArchiveStatus, start, end,
            orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByRegionArchiveStatus_First(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionArchiveStatus_First(regionArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the first region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByRegionArchiveStatus_First(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionArchiveStatus_First(regionArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByRegionArchiveStatus_Last(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionArchiveStatus_Last(regionArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the last region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByRegionArchiveStatus_Last(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByRegionArchiveStatus_Last(regionArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the regions before and after the current region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionId the primary key of the current region
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next region
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region[] findByRegionArchiveStatus_PrevAndNext(
        long regionId, boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence()
                   .findByRegionArchiveStatus_PrevAndNext(regionId,
            regionArchiveStatus, orderByComparator);
    }

    /**
    * Removes all the regions where regionArchiveStatus = &#63; from the database.
    *
    * @param regionArchiveStatus the region archive status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByRegionArchiveStatus(boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByRegionArchiveStatus(regionArchiveStatus);
    }

    /**
    * Returns the number of regions where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public static int countByRegionArchiveStatus(boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRegionArchiveStatus(regionArchiveStatus);
    }

    /**
    * Caches the region in the entity cache if it is enabled.
    *
    * @param region the region
    */
    public static void cacheResult(ru.kotikov.model.Region region) {
        getPersistence().cacheResult(region);
    }

    /**
    * Caches the regions in the entity cache if it is enabled.
    *
    * @param regions the regions
    */
    public static void cacheResult(
        java.util.List<ru.kotikov.model.Region> regions) {
        getPersistence().cacheResult(regions);
    }

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param regionId the primary key for the new region
    * @return the new region
    */
    public static ru.kotikov.model.Region create(long regionId) {
        return getPersistence().create(regionId);
    }

    /**
    * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param regionId the primary key of the region
    * @return the region that was removed
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region remove(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence().remove(regionId);
    }

    public static ru.kotikov.model.Region updateImpl(
        ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(region);
    }

    /**
    * Returns the region with the primary key or throws a {@link ru.kotikov.NoSuchRegionException} if it could not be found.
    *
    * @param regionId the primary key of the region
    * @return the region
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region findByPrimaryKey(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException {
        return getPersistence().findByPrimaryKey(regionId);
    }

    /**
    * Returns the region with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param regionId the primary key of the region
    * @return the region, or <code>null</code> if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Region fetchByPrimaryKey(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(regionId);
    }

    /**
    * Returns all the regions.
    *
    * @return the regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the regions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the regions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of regions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the regions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RegionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RegionPersistence) PortletBeanLocatorUtil.locate(ru.kotikov.service.ClpSerializer.getServletContextName(),
                    RegionPersistence.class.getName());

            ReferenceRegistry.registerReference(RegionUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RegionPersistence persistence) {
    }
}
