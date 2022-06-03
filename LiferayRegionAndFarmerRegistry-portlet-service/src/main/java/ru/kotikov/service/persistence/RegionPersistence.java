package ru.kotikov.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.kotikov.model.Region;

/**
 * The persistence interface for the region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kirill_Kotikov
 * @see RegionPersistenceImpl
 * @see RegionUtil
 * @generated
 */
public interface RegionPersistence extends BasePersistence<Region> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegionUtil} to access the region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the regions where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the first region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByUuid_First(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the last region in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByUuid_Last(java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.kotikov.model.Region[] findByUuid_PrevAndNext(long regionId,
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Removes all the regions where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where regionName = &#63;.
    *
    * @param regionName the region name
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByRegionName(
        java.lang.String regionName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByRegionName_First(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the first region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByRegionName_First(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByRegionName_Last(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the last region in the ordered set where regionName = &#63;.
    *
    * @param regionName the region name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByRegionName_Last(
        java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.kotikov.model.Region[] findByRegionName_PrevAndNext(
        long regionId, java.lang.String regionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Removes all the regions where regionName = &#63; from the database.
    *
    * @param regionName the region name
    * @throws SystemException if a system exception occurred
    */
    public void removeByRegionName(java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where regionName = &#63;.
    *
    * @param regionName the region name
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByRegionName(java.lang.String regionName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @return the matching regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findByRegionArchiveStatus(
        boolean regionArchiveStatus, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByRegionArchiveStatus_First(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the first region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByRegionArchiveStatus_First(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region
    * @throws ru.kotikov.NoSuchRegionException if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByRegionArchiveStatus_Last(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the last region in the ordered set where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching region, or <code>null</code> if a matching region could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByRegionArchiveStatus_Last(
        boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.kotikov.model.Region[] findByRegionArchiveStatus_PrevAndNext(
        long regionId, boolean regionArchiveStatus,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Removes all the regions where regionArchiveStatus = &#63; from the database.
    *
    * @param regionArchiveStatus the region archive status
    * @throws SystemException if a system exception occurred
    */
    public void removeByRegionArchiveStatus(boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions where regionArchiveStatus = &#63;.
    *
    * @param regionArchiveStatus the region archive status
    * @return the number of matching regions
    * @throws SystemException if a system exception occurred
    */
    public int countByRegionArchiveStatus(boolean regionArchiveStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the region in the entity cache if it is enabled.
    *
    * @param region the region
    */
    public void cacheResult(ru.kotikov.model.Region region);

    /**
    * Caches the regions in the entity cache if it is enabled.
    *
    * @param regions the regions
    */
    public void cacheResult(java.util.List<ru.kotikov.model.Region> regions);

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param regionId the primary key for the new region
    * @return the new region
    */
    public ru.kotikov.model.Region create(long regionId);

    /**
    * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param regionId the primary key of the region
    * @return the region that was removed
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region remove(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    public ru.kotikov.model.Region updateImpl(ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the region with the primary key or throws a {@link ru.kotikov.NoSuchRegionException} if it could not be found.
    *
    * @param regionId the primary key of the region
    * @return the region
    * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region findByPrimaryKey(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.NoSuchRegionException;

    /**
    * Returns the region with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param regionId the primary key of the region
    * @return the region, or <code>null</code> if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.model.Region fetchByPrimaryKey(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the regions.
    *
    * @return the regions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Region> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.model.Region> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the regions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers associated with the region.
    *
    * @param pk the primary key of the region
    * @return the farmers associated with the region
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Farmer> getFarmers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers associated with the region.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the region
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @return the range of farmers associated with the region
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Farmer> getFarmers(long pk,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers associated with the region.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the region
    * @param start the lower bound of the range of regions
    * @param end the upper bound of the range of regions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers associated with the region
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.model.Farmer> getFarmers(long pk,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers associated with the region.
    *
    * @param pk the primary key of the region
    * @return the number of farmers associated with the region
    * @throws SystemException if a system exception occurred
    */
    public int getFarmersSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the farmer is associated with the region.
    *
    * @param pk the primary key of the region
    * @param farmerPK the primary key of the farmer
    * @return <code>true</code> if the farmer is associated with the region; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the region has any farmers associated with it.
    *
    * @param pk the primary key of the region to check for associations with farmers
    * @return <code>true</code> if the region has any farmers associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsFarmers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmerPK the primary key of the farmer
    * @throws SystemException if a system exception occurred
    */
    public void addFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmer the farmer
    * @throws SystemException if a system exception occurred
    */
    public void addFarmer(long pk, ru.kotikov.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmerPKs the primary keys of the farmers
    * @throws SystemException if a system exception occurred
    */
    public void addFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmers the farmers
    * @throws SystemException if a system exception occurred
    */
    public void addFarmers(long pk,
        java.util.List<ru.kotikov.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the region and its farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region to clear the associated farmers from
    * @throws SystemException if a system exception occurred
    */
    public void clearFarmers(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmerPK the primary key of the farmer
    * @throws SystemException if a system exception occurred
    */
    public void removeFarmer(long pk, long farmerPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmer the farmer
    * @throws SystemException if a system exception occurred
    */
    public void removeFarmer(long pk, ru.kotikov.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmerPKs the primary keys of the farmers
    * @throws SystemException if a system exception occurred
    */
    public void removeFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmers the farmers
    * @throws SystemException if a system exception occurred
    */
    public void removeFarmers(long pk,
        java.util.List<ru.kotikov.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the farmers associated with the region, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmerPKs the primary keys of the farmers to be associated with the region
    * @throws SystemException if a system exception occurred
    */
    public void setFarmers(long pk, long[] farmerPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the farmers associated with the region, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the region
    * @param farmers the farmers to be associated with the region
    * @throws SystemException if a system exception occurred
    */
    public void setFarmers(long pk,
        java.util.List<ru.kotikov.model.Farmer> farmers)
        throws com.liferay.portal.kernel.exception.SystemException;
}
