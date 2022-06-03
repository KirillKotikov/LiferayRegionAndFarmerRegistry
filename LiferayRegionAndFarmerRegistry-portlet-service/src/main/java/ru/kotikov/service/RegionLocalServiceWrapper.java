package ru.kotikov.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegionLocalService}.
 *
 * @author Kirill_Kotikov
 * @see RegionLocalService
 * @generated
 */
public class RegionLocalServiceWrapper implements RegionLocalService,
    ServiceWrapper<RegionLocalService> {
    private RegionLocalService _regionLocalService;

    public RegionLocalServiceWrapper(RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }

    /**
    * Adds the region to the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.kotikov.model.Region addRegion(ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.addRegion(region);
    }

    /**
    * Creates a new region with the primary key. Does not add the region to the database.
    *
    * @param regionId the primary key for the new region
    * @return the new region
    */
    @Override
    public ru.kotikov.model.Region createRegion(long regionId) {
        return _regionLocalService.createRegion(regionId);
    }

    /**
    * Deletes the region with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param regionId the primary key of the region
    * @return the region that was removed
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.kotikov.model.Region deleteRegion(long regionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.deleteRegion(regionId);
    }

    /**
    * Deletes the region from the database. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.kotikov.model.Region deleteRegion(ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.deleteRegion(region);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _regionLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.model.impl.RegionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ru.kotikov.model.Region fetchRegion(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.fetchRegion(regionId);
    }

    /**
    * Returns the region with the primary key.
    *
    * @param regionId the primary key of the region
    * @return the region
    * @throws PortalException if a region with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.kotikov.model.Region getRegion(long regionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegion(regionId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<ru.kotikov.model.Region> getRegions(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegions(start, end);
    }

    /**
    * Returns the number of regions.
    *
    * @return the number of regions
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRegionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getRegionsCount();
    }

    /**
    * Updates the region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param region the region
    * @return the region that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.kotikov.model.Region updateRegion(ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.updateRegion(region);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerRegion(long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.addFarmerRegion(farmerId, regionId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerRegion(long farmerId, ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.addFarmerRegion(farmerId, region);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerRegions(long farmerId, long[] regionIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.addFarmerRegions(farmerId, regionIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void addFarmerRegions(long farmerId,
        java.util.List<ru.kotikov.model.Region> Regions)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.addFarmerRegions(farmerId, Regions);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void clearFarmerRegions(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.clearFarmerRegions(farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerRegion(long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.deleteFarmerRegion(farmerId, regionId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerRegion(long farmerId, ru.kotikov.model.Region region)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.deleteFarmerRegion(farmerId, region);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerRegions(long farmerId, long[] regionIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.deleteFarmerRegions(farmerId, regionIds);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void deleteFarmerRegions(long farmerId,
        java.util.List<ru.kotikov.model.Region> Regions)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.deleteFarmerRegions(farmerId, Regions);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.kotikov.model.Region> getFarmerRegions(
        long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getFarmerRegions(farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.kotikov.model.Region> getFarmerRegions(
        long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getFarmerRegions(farmerId, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.kotikov.model.Region> getFarmerRegions(
        long farmerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getFarmerRegions(farmerId, start, end,
            orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFarmerRegionsCount(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getFarmerRegionsCount(farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFarmerRegion(long farmerId, long regionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.hasFarmerRegion(farmerId, regionId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean hasFarmerRegions(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.hasFarmerRegions(farmerId);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    @Override
    public void setFarmerRegions(long farmerId, long[] regionIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        _regionLocalService.setFarmerRegions(farmerId, regionIds);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _regionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _regionLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _regionLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<ru.kotikov.model.Region> getByRegionName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getByRegionName(name);
    }

    @Override
    public java.util.List<ru.kotikov.model.Region> getByRegionArchiveStatus(
        boolean archive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionLocalService.getByRegionArchiveStatus(archive);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RegionLocalService getWrappedRegionLocalService() {
        return _regionLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRegionLocalService(
        RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }

    @Override
    public RegionLocalService getWrappedService() {
        return _regionLocalService;
    }

    @Override
    public void setWrappedService(RegionLocalService regionLocalService) {
        _regionLocalService = regionLocalService;
    }
}
