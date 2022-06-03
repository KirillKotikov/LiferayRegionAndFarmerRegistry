package ru.kotikov.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.kotikov.model.Farmer;

import java.util.List;

/**
 * The persistence utility for the farmer service. This utility wraps {@link FarmerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kirill_Kotikov
 * @see FarmerPersistence
 * @see FarmerPersistenceImpl
 * @generated
 */
public class FarmerUtil {
    private static FarmerPersistence _persistence;

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
    public static void clearCache(Farmer farmer) {
        getPersistence().clearCache(farmer);
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
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Farmer> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Farmer update(Farmer farmer) throws SystemException {
        return getPersistence().update(farmer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Farmer update(Farmer farmer, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(farmer, serviceContext);
    }

    /**
    * Returns all the farmers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the farmers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where uuid = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws ru.kotikov.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer[] findByUuid_PrevAndNext(
        long farmerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByUuid_PrevAndNext(farmerId, uuid, orderByComparator);
    }

    /**
    * Removes all the farmers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of farmers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns all the farmers where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerName(
        java.lang.String farmerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFarmerName(farmerName);
    }

    /**
    * Returns a range of all the farmers where farmerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerName the farmer name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerName(
        java.lang.String farmerName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFarmerName(farmerName, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where farmerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerName the farmer name
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerName(
        java.lang.String farmerName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFarmerName(farmerName, start, end, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByFarmerName_First(
        java.lang.String farmerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerName_First(farmerName, orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByFarmerName_First(
        java.lang.String farmerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFarmerName_First(farmerName, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByFarmerName_Last(
        java.lang.String farmerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerName_Last(farmerName, orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByFarmerName_Last(
        java.lang.String farmerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFarmerName_Last(farmerName, orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where farmerName = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param farmerName the farmer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws ru.kotikov.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer[] findByFarmerName_PrevAndNext(
        long farmerId, java.lang.String farmerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerName_PrevAndNext(farmerId, farmerName,
            orderByComparator);
    }

    /**
    * Removes all the farmers where farmerName = &#63; from the database.
    *
    * @param farmerName the farmer name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFarmerName(java.lang.String farmerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFarmerName(farmerName);
    }

    /**
    * Returns the number of farmers where farmerName = &#63;.
    *
    * @param farmerName the farmer name
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByFarmerName(java.lang.String farmerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFarmerName(farmerName);
    }

    /**
    * Returns all the farmers where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerArchiveStatus(
        boolean farmerArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFarmerArchiveStatus(farmerArchiveStatus);
    }

    /**
    * Returns a range of all the farmers where farmerArchiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerArchiveStatus(
        boolean farmerArchiveStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFarmerArchiveStatus(farmerArchiveStatus, start, end);
    }

    /**
    * Returns an ordered range of all the farmers where farmerArchiveStatus = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findByFarmerArchiveStatus(
        boolean farmerArchiveStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFarmerArchiveStatus(farmerArchiveStatus, start, end,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByFarmerArchiveStatus_First(
        boolean farmerArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerArchiveStatus_First(farmerArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the first farmer in the ordered set where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByFarmerArchiveStatus_First(
        boolean farmerArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFarmerArchiveStatus_First(farmerArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws ru.kotikov.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByFarmerArchiveStatus_Last(
        boolean farmerArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerArchiveStatus_Last(farmerArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the last farmer in the ordered set where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByFarmerArchiveStatus_Last(
        boolean farmerArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFarmerArchiveStatus_Last(farmerArchiveStatus,
            orderByComparator);
    }

    /**
    * Returns the farmers before and after the current farmer in the ordered set where farmerArchiveStatus = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param farmerArchiveStatus the farmer archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws ru.kotikov.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer[] findByFarmerArchiveStatus_PrevAndNext(
        long farmerId, boolean farmerArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence()
                   .findByFarmerArchiveStatus_PrevAndNext(farmerId,
            farmerArchiveStatus, orderByComparator);
    }

    /**
    * Removes all the farmers where farmerArchiveStatus = &#63; from the database.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFarmerArchiveStatus(boolean farmerArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFarmerArchiveStatus(farmerArchiveStatus);
    }

    /**
    * Returns the number of farmers where farmerArchiveStatus = &#63;.
    *
    * @param farmerArchiveStatus the farmer archive status
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countByFarmerArchiveStatus(boolean farmerArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFarmerArchiveStatus(farmerArchiveStatus);
    }

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public static void cacheResult(ru.kotikov.model.Farmer farmer) {
        getPersistence().cacheResult(farmer);
    }

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public static void cacheResult(
        java.util.List<ru.kotikov.model.Farmer> farmers) {
        getPersistence().cacheResult(farmers);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    public static ru.kotikov.model.Farmer create(long farmerId) {
        return getPersistence().create(farmerId);
    }

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws ru.kotikov.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer remove(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence().remove(farmerId);
    }

    public static ru.kotikov.model.Farmer updateImpl(
        ru.kotikov.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(farmer);
    }

    /**
    * Returns the farmer with the primary key or throws a {@link ru.kotikov.NoSuchFarmerException} if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws ru.kotikov.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer findByPrimaryKey(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchFarmerException {
        return getPersistence().findByPrimaryKey(farmerId);
    }

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.model.Farmer fetchByPrimaryKey(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(farmerId);
    }

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Farmer> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the regions associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the regions associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> getRegions(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRegions(pk);
    }

    /**
    * Returns a range of all the regions associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of regions associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> getRegions(long pk,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRegions(pk, start, end);
    }

    /**
    * Returns an ordered range of all the regions associated with the farmer.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the farmer
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of regions associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.model.Region> getRegions(long pk,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRegions(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of regions associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @return the number of regions associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static int getRegionsSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getRegionsSize(pk);
    }

    /**
    * Returns <code>true</code> if the region is associated with the farmer.
    *
    * @param pk the primary key of the farmer
    * @param regionPK the primary key of the region
    * @return <code>true</code> if the region is associated with the farmer; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsRegion(long pk, long regionPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsRegion(pk, regionPK);
    }

    /**
    * Returns <code>true</code> if the farmer has any regions associated with it.
    *
    * @param pk the primary key of the farmer to check for associations with regions
    * @return <code>true</code> if the farmer has any regions associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsRegions(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsRegions(pk);
    }

    /**
    * Adds an association between the farmer and the region. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regionPK the primary key of the region
    * @throws SystemException if a system exception occurred
    */
    public static void addRegion(long pk, long regionPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRegion(pk, regionPK);
    }

    /**
    * Adds an association between the farmer and the region. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param region the region
    * @throws SystemException if a system exception occurred
    */
    public static void addRegion(long pk, ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRegion(pk, region);
    }

    /**
    * Adds an association between the farmer and the regions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regionPKs the primary keys of the regions
    * @throws SystemException if a system exception occurred
    */
    public static void addRegions(long pk, long[] regionPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRegions(pk, regionPKs);
    }

    /**
    * Adds an association between the farmer and the regions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regions the regions
    * @throws SystemException if a system exception occurred
    */
    public static void addRegions(long pk,
        java.util.List<ru.kotikov.model.Region> regions)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addRegions(pk, regions);
    }

    /**
    * Clears all associations between the farmer and its regions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer to clear the associated regions from
    * @throws SystemException if a system exception occurred
    */
    public static void clearRegions(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearRegions(pk);
    }

    /**
    * Removes the association between the farmer and the region. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regionPK the primary key of the region
    * @throws SystemException if a system exception occurred
    */
    public static void removeRegion(long pk, long regionPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRegion(pk, regionPK);
    }

    /**
    * Removes the association between the farmer and the region. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param region the region
    * @throws SystemException if a system exception occurred
    */
    public static void removeRegion(long pk, ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRegion(pk, region);
    }

    /**
    * Removes the association between the farmer and the regions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regionPKs the primary keys of the regions
    * @throws SystemException if a system exception occurred
    */
    public static void removeRegions(long pk, long[] regionPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRegions(pk, regionPKs);
    }

    /**
    * Removes the association between the farmer and the regions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regions the regions
    * @throws SystemException if a system exception occurred
    */
    public static void removeRegions(long pk,
        java.util.List<ru.kotikov.model.Region> regions)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeRegions(pk, regions);
    }

    /**
    * Sets the regions associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regionPKs the primary keys of the regions to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setRegions(long pk, long[] regionPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setRegions(pk, regionPKs);
    }

    /**
    * Sets the regions associated with the farmer, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the farmer
    * @param regions the regions to be associated with the farmer
    * @throws SystemException if a system exception occurred
    */
    public static void setRegions(long pk,
        java.util.List<ru.kotikov.model.Region> regions)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setRegions(pk, regions);
    }

    public static FarmerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FarmerPersistence) PortletBeanLocatorUtil.locate(ru.kotikov.service.ClpSerializer.getServletContextName(),
                    FarmerPersistence.class.getName());

            ReferenceRegistry.registerReference(FarmerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FarmerPersistence persistence) {
    }
}
