package ru.kotikov.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import ru.kotikov.NoSuchRegionException;

import ru.kotikov.model.Region;
import ru.kotikov.model.impl.RegionImpl;
import ru.kotikov.model.impl.RegionModelImpl;

import ru.kotikov.service.persistence.FarmerPersistence;
import ru.kotikov.service.persistence.RegionPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the region service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kirill_Kotikov
 * @see RegionPersistence
 * @see RegionUtil
 * @generated
 */
public class RegionPersistenceImpl extends BasePersistenceImpl<Region>
    implements RegionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RegionUtil} to access the region persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RegionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            RegionModelImpl.UUID_COLUMN_BITMASK |
            RegionModelImpl.REGIONNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "region.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "region.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(region.uuid IS NULL OR region.uuid = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONNAME =
        new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRegionName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONNAME =
        new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRegionName",
            new String[] { String.class.getName() },
            RegionModelImpl.REGIONNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REGIONNAME = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegionName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_REGIONNAME_REGIONNAME_1 = "region.regionName IS NULL";
    private static final String _FINDER_COLUMN_REGIONNAME_REGIONNAME_2 = "region.regionName = ?";
    private static final String _FINDER_COLUMN_REGIONNAME_REGIONNAME_3 = "(region.regionName IS NULL OR region.regionName = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONARCHIVESTATUS =
        new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByRegionArchiveStatus",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONARCHIVESTATUS =
        new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, RegionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByRegionArchiveStatus",
            new String[] { Boolean.class.getName() },
            RegionModelImpl.REGIONARCHIVESTATUS_COLUMN_BITMASK |
            RegionModelImpl.REGIONNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_REGIONARCHIVESTATUS = new FinderPath(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByRegionArchiveStatus",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_REGIONARCHIVESTATUS_REGIONARCHIVESTATUS_2 =
        "region.regionArchiveStatus = ?";
    private static final String _SQL_SELECT_REGION = "SELECT region FROM Region region";
    private static final String _SQL_SELECT_REGION_WHERE = "SELECT region FROM Region region WHERE ";
    private static final String _SQL_COUNT_REGION = "SELECT COUNT(region) FROM Region region";
    private static final String _SQL_COUNT_REGION_WHERE = "SELECT COUNT(region) FROM Region region WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "region.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Region exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Region exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RegionPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid", "regionId", "regionName", "regionCode",
                "regionArchiveStatus", "regionsFarmers"
            });
    private static Region _nullRegion = new RegionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Region> toCacheModel() {
                return _nullRegionCacheModel;
            }
        };

    private static CacheModel<Region> _nullRegionCacheModel = new CacheModel<Region>() {
            @Override
            public Region toEntityModel() {
                return _nullRegion;
            }
        };

    @BeanReference(type = FarmerPersistence.class)
    protected FarmerPersistence farmerPersistence;
    protected TableMapper<Region, ru.kotikov.model.Farmer> regionToFarmerTableMapper;

    public RegionPersistenceImpl() {
        setModelClass(Region.class);
    }

    /**
     * Returns all the regions where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Region> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Region> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<Region> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Region> list = (List<Region>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Region region : list) {
                if (!Validator.equals(uuid, region.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGION_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Region>(list);
                } else {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Region findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByUuid_First(uuid, orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the first region in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Region> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByUuid_Last(uuid, orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the last region in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Region> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region[] findByUuid_PrevAndNext(long regionId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = findByPrimaryKey(regionId);

        Session session = null;

        try {
            session = openSession();

            Region[] array = new RegionImpl[3];

            array[0] = getByUuid_PrevAndNext(session, region, uuid,
                    orderByComparator, true);

            array[1] = region;

            array[2] = getByUuid_PrevAndNext(session, region, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Region getByUuid_PrevAndNext(Session session, Region region,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGION_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(region);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Region> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the regions where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Region region : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(region);
        }
    }

    /**
     * Returns the number of regions where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGION_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the regions where regionName = &#63;.
     *
     * @param regionName the region name
     * @return the matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Region> findByRegionName(String regionName)
        throws SystemException {
        return findByRegionName(regionName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Region> findByRegionName(String regionName, int start, int end)
        throws SystemException {
        return findByRegionName(regionName, start, end, null);
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
    @Override
    public List<Region> findByRegionName(String regionName, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONNAME;
            finderArgs = new Object[] { regionName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONNAME;
            finderArgs = new Object[] { regionName, start, end, orderByComparator };
        }

        List<Region> list = (List<Region>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Region region : list) {
                if (!Validator.equals(regionName, region.getRegionName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGION_WHERE);

            boolean bindRegionName = false;

            if (regionName == null) {
                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_1);
            } else if (regionName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_3);
            } else {
                bindRegionName = true;

                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegionName) {
                    qPos.add(regionName);
                }

                if (!pagination) {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Region>(list);
                } else {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Region findByRegionName_First(String regionName,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByRegionName_First(regionName, orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionName=");
        msg.append(regionName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the first region in the ordered set where regionName = &#63;.
     *
     * @param regionName the region name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByRegionName_First(String regionName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Region> list = findByRegionName(regionName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region findByRegionName_Last(String regionName,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByRegionName_Last(regionName, orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionName=");
        msg.append(regionName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the last region in the ordered set where regionName = &#63;.
     *
     * @param regionName the region name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByRegionName_Last(String regionName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRegionName(regionName);

        if (count == 0) {
            return null;
        }

        List<Region> list = findByRegionName(regionName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region[] findByRegionName_PrevAndNext(long regionId,
        String regionName, OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = findByPrimaryKey(regionId);

        Session session = null;

        try {
            session = openSession();

            Region[] array = new RegionImpl[3];

            array[0] = getByRegionName_PrevAndNext(session, region, regionName,
                    orderByComparator, true);

            array[1] = region;

            array[2] = getByRegionName_PrevAndNext(session, region, regionName,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Region getByRegionName_PrevAndNext(Session session,
        Region region, String regionName, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGION_WHERE);

        boolean bindRegionName = false;

        if (regionName == null) {
            query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_1);
        } else if (regionName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_3);
        } else {
            bindRegionName = true;

            query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindRegionName) {
            qPos.add(regionName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(region);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Region> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the regions where regionName = &#63; from the database.
     *
     * @param regionName the region name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRegionName(String regionName) throws SystemException {
        for (Region region : findByRegionName(regionName, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(region);
        }
    }

    /**
     * Returns the number of regions where regionName = &#63;.
     *
     * @param regionName the region name
     * @return the number of matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegionName(String regionName) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONNAME;

        Object[] finderArgs = new Object[] { regionName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGION_WHERE);

            boolean bindRegionName = false;

            if (regionName == null) {
                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_1);
            } else if (regionName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_3);
            } else {
                bindRegionName = true;

                query.append(_FINDER_COLUMN_REGIONNAME_REGIONNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindRegionName) {
                    qPos.add(regionName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the regions where regionArchiveStatus = &#63;.
     *
     * @param regionArchiveStatus the region archive status
     * @return the matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Region> findByRegionArchiveStatus(boolean regionArchiveStatus)
        throws SystemException {
        return findByRegionArchiveStatus(regionArchiveStatus,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Region> findByRegionArchiveStatus(boolean regionArchiveStatus,
        int start, int end) throws SystemException {
        return findByRegionArchiveStatus(regionArchiveStatus, start, end, null);
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
    @Override
    public List<Region> findByRegionArchiveStatus(boolean regionArchiveStatus,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONARCHIVESTATUS;
            finderArgs = new Object[] { regionArchiveStatus };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGIONARCHIVESTATUS;
            finderArgs = new Object[] {
                    regionArchiveStatus,
                    
                    start, end, orderByComparator
                };
        }

        List<Region> list = (List<Region>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Region region : list) {
                if ((regionArchiveStatus != region.getRegionArchiveStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_REGION_WHERE);

            query.append(_FINDER_COLUMN_REGIONARCHIVESTATUS_REGIONARCHIVESTATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RegionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionArchiveStatus);

                if (!pagination) {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Region>(list);
                } else {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Region findByRegionArchiveStatus_First(boolean regionArchiveStatus,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByRegionArchiveStatus_First(regionArchiveStatus,
                orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionArchiveStatus=");
        msg.append(regionArchiveStatus);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the first region in the ordered set where regionArchiveStatus = &#63;.
     *
     * @param regionArchiveStatus the region archive status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByRegionArchiveStatus_First(
        boolean regionArchiveStatus, OrderByComparator orderByComparator)
        throws SystemException {
        List<Region> list = findByRegionArchiveStatus(regionArchiveStatus, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region findByRegionArchiveStatus_Last(boolean regionArchiveStatus,
        OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByRegionArchiveStatus_Last(regionArchiveStatus,
                orderByComparator);

        if (region != null) {
            return region;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("regionArchiveStatus=");
        msg.append(regionArchiveStatus);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRegionException(msg.toString());
    }

    /**
     * Returns the last region in the ordered set where regionArchiveStatus = &#63;.
     *
     * @param regionArchiveStatus the region archive status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching region, or <code>null</code> if a matching region could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByRegionArchiveStatus_Last(boolean regionArchiveStatus,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByRegionArchiveStatus(regionArchiveStatus);

        if (count == 0) {
            return null;
        }

        List<Region> list = findByRegionArchiveStatus(regionArchiveStatus,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Region[] findByRegionArchiveStatus_PrevAndNext(long regionId,
        boolean regionArchiveStatus, OrderByComparator orderByComparator)
        throws NoSuchRegionException, SystemException {
        Region region = findByPrimaryKey(regionId);

        Session session = null;

        try {
            session = openSession();

            Region[] array = new RegionImpl[3];

            array[0] = getByRegionArchiveStatus_PrevAndNext(session, region,
                    regionArchiveStatus, orderByComparator, true);

            array[1] = region;

            array[2] = getByRegionArchiveStatus_PrevAndNext(session, region,
                    regionArchiveStatus, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Region getByRegionArchiveStatus_PrevAndNext(Session session,
        Region region, boolean regionArchiveStatus,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_REGION_WHERE);

        query.append(_FINDER_COLUMN_REGIONARCHIVESTATUS_REGIONARCHIVESTATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(RegionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(regionArchiveStatus);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(region);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Region> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the regions where regionArchiveStatus = &#63; from the database.
     *
     * @param regionArchiveStatus the region archive status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByRegionArchiveStatus(boolean regionArchiveStatus)
        throws SystemException {
        for (Region region : findByRegionArchiveStatus(regionArchiveStatus,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(region);
        }
    }

    /**
     * Returns the number of regions where regionArchiveStatus = &#63;.
     *
     * @param regionArchiveStatus the region archive status
     * @return the number of matching regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByRegionArchiveStatus(boolean regionArchiveStatus)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_REGIONARCHIVESTATUS;

        Object[] finderArgs = new Object[] { regionArchiveStatus };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_REGION_WHERE);

            query.append(_FINDER_COLUMN_REGIONARCHIVESTATUS_REGIONARCHIVESTATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(regionArchiveStatus);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the region in the entity cache if it is enabled.
     *
     * @param region the region
     */
    @Override
    public void cacheResult(Region region) {
        EntityCacheUtil.putResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionImpl.class, region.getPrimaryKey(), region);

        region.resetOriginalValues();
    }

    /**
     * Caches the regions in the entity cache if it is enabled.
     *
     * @param regions the regions
     */
    @Override
    public void cacheResult(List<Region> regions) {
        for (Region region : regions) {
            if (EntityCacheUtil.getResult(
                        RegionModelImpl.ENTITY_CACHE_ENABLED, RegionImpl.class,
                        region.getPrimaryKey()) == null) {
                cacheResult(region);
            } else {
                region.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all regions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RegionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RegionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the region.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Region region) {
        EntityCacheUtil.removeResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionImpl.class, region.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Region> regions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Region region : regions) {
            EntityCacheUtil.removeResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
                RegionImpl.class, region.getPrimaryKey());
        }
    }

    /**
     * Creates a new region with the primary key. Does not add the region to the database.
     *
     * @param regionId the primary key for the new region
     * @return the new region
     */
    @Override
    public Region create(long regionId) {
        Region region = new RegionImpl();

        region.setNew(true);
        region.setPrimaryKey(regionId);

        String uuid = PortalUUIDUtil.generate();

        region.setUuid(uuid);

        return region;
    }

    /**
     * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param regionId the primary key of the region
     * @return the region that was removed
     * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region remove(long regionId)
        throws NoSuchRegionException, SystemException {
        return remove((Serializable) regionId);
    }

    /**
     * Removes the region with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the region
     * @return the region that was removed
     * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region remove(Serializable primaryKey)
        throws NoSuchRegionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Region region = (Region) session.get(RegionImpl.class, primaryKey);

            if (region == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(region);
        } catch (NoSuchRegionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Region removeImpl(Region region) throws SystemException {
        region = toUnwrappedModel(region);

        regionToFarmerTableMapper.deleteLeftPrimaryKeyTableMappings(region.getPrimaryKey());

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(region)) {
                region = (Region) session.get(RegionImpl.class,
                        region.getPrimaryKeyObj());
            }

            if (region != null) {
                session.delete(region);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (region != null) {
            clearCache(region);
        }

        return region;
    }

    @Override
    public Region updateImpl(ru.kotikov.model.Region region)
        throws SystemException {
        region = toUnwrappedModel(region);

        boolean isNew = region.isNew();

        RegionModelImpl regionModelImpl = (RegionModelImpl) region;

        if (Validator.isNull(region.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            region.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (region.isNew()) {
                session.save(region);

                region.setNew(false);
            } else {
                session.merge(region);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RegionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((regionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { regionModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { regionModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((regionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        regionModelImpl.getOriginalRegionName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONNAME,
                    args);

                args = new Object[] { regionModelImpl.getRegionName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONNAME,
                    args);
            }

            if ((regionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONARCHIVESTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        regionModelImpl.getOriginalRegionArchiveStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONARCHIVESTATUS,
                    args);

                args = new Object[] { regionModelImpl.getRegionArchiveStatus() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGIONARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGIONARCHIVESTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
            RegionImpl.class, region.getPrimaryKey(), region);

        return region;
    }

    protected Region toUnwrappedModel(Region region) {
        if (region instanceof RegionImpl) {
            return region;
        }

        RegionImpl regionImpl = new RegionImpl();

        regionImpl.setNew(region.isNew());
        regionImpl.setPrimaryKey(region.getPrimaryKey());

        regionImpl.setUuid(region.getUuid());
        regionImpl.setRegionId(region.getRegionId());
        regionImpl.setRegionName(region.getRegionName());
        regionImpl.setRegionCode(region.getRegionCode());
        regionImpl.setRegionArchiveStatus(region.isRegionArchiveStatus());

        return regionImpl;
    }

    /**
     * Returns the region with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the region
     * @return the region
     * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRegionException, SystemException {
        Region region = fetchByPrimaryKey(primaryKey);

        if (region == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRegionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return region;
    }

    /**
     * Returns the region with the primary key or throws a {@link ru.kotikov.NoSuchRegionException} if it could not be found.
     *
     * @param regionId the primary key of the region
     * @return the region
     * @throws ru.kotikov.NoSuchRegionException if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region findByPrimaryKey(long regionId)
        throws NoSuchRegionException, SystemException {
        return findByPrimaryKey((Serializable) regionId);
    }

    /**
     * Returns the region with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the region
     * @return the region, or <code>null</code> if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Region region = (Region) EntityCacheUtil.getResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
                RegionImpl.class, primaryKey);

        if (region == _nullRegion) {
            return null;
        }

        if (region == null) {
            Session session = null;

            try {
                session = openSession();

                region = (Region) session.get(RegionImpl.class, primaryKey);

                if (region != null) {
                    cacheResult(region);
                } else {
                    EntityCacheUtil.putResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
                        RegionImpl.class, primaryKey, _nullRegion);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RegionModelImpl.ENTITY_CACHE_ENABLED,
                    RegionImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return region;
    }

    /**
     * Returns the region with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param regionId the primary key of the region
     * @return the region, or <code>null</code> if a region with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Region fetchByPrimaryKey(long regionId) throws SystemException {
        return fetchByPrimaryKey((Serializable) regionId);
    }

    /**
     * Returns all the regions.
     *
     * @return the regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Region> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Region> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Region> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Region> list = (List<Region>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_REGION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_REGION;

                if (pagination) {
                    sql = sql.concat(RegionModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Region>(list);
                } else {
                    list = (List<Region>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the regions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Region region : findAll()) {
            remove(region);
        }
    }

    /**
     * Returns the number of regions.
     *
     * @return the number of regions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_REGION);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the farmers associated with the region.
     *
     * @param pk the primary key of the region
     * @return the farmers associated with the region
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<ru.kotikov.model.Farmer> getFarmers(long pk)
        throws SystemException {
        return getFarmers(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
    }

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
    @Override
    public List<ru.kotikov.model.Farmer> getFarmers(long pk, int start, int end)
        throws SystemException {
        return getFarmers(pk, start, end, null);
    }

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
    @Override
    public List<ru.kotikov.model.Farmer> getFarmers(long pk, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        return regionToFarmerTableMapper.getRightBaseModels(pk, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of farmers associated with the region.
     *
     * @param pk the primary key of the region
     * @return the number of farmers associated with the region
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getFarmersSize(long pk) throws SystemException {
        long[] pks = regionToFarmerTableMapper.getRightPrimaryKeys(pk);

        return pks.length;
    }

    /**
     * Returns <code>true</code> if the farmer is associated with the region.
     *
     * @param pk the primary key of the region
     * @param farmerPK the primary key of the farmer
     * @return <code>true</code> if the farmer is associated with the region; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsFarmer(long pk, long farmerPK)
        throws SystemException {
        return regionToFarmerTableMapper.containsTableMapping(pk, farmerPK);
    }

    /**
     * Returns <code>true</code> if the region has any farmers associated with it.
     *
     * @param pk the primary key of the region to check for associations with farmers
     * @return <code>true</code> if the region has any farmers associated with it; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsFarmers(long pk) throws SystemException {
        if (getFarmersSize(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmerPK the primary key of the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmer(long pk, long farmerPK) throws SystemException {
        regionToFarmerTableMapper.addTableMapping(pk, farmerPK);
    }

    /**
     * Adds an association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmer the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmer(long pk, ru.kotikov.model.Farmer farmer)
        throws SystemException {
        regionToFarmerTableMapper.addTableMapping(pk, farmer.getPrimaryKey());
    }

    /**
     * Adds an association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmerPKs the primary keys of the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmers(long pk, long[] farmerPKs) throws SystemException {
        for (long farmerPK : farmerPKs) {
            regionToFarmerTableMapper.addTableMapping(pk, farmerPK);
        }
    }

    /**
     * Adds an association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmers the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addFarmers(long pk, List<ru.kotikov.model.Farmer> farmers)
        throws SystemException {
        for (ru.kotikov.model.Farmer farmer : farmers) {
            regionToFarmerTableMapper.addTableMapping(pk, farmer.getPrimaryKey());
        }
    }

    /**
     * Clears all associations between the region and its farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region to clear the associated farmers from
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearFarmers(long pk) throws SystemException {
        regionToFarmerTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
    }

    /**
     * Removes the association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmerPK the primary key of the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeFarmer(long pk, long farmerPK) throws SystemException {
        regionToFarmerTableMapper.deleteTableMapping(pk, farmerPK);
    }

    /**
     * Removes the association between the region and the farmer. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmer the farmer
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeFarmer(long pk, ru.kotikov.model.Farmer farmer)
        throws SystemException {
        regionToFarmerTableMapper.deleteTableMapping(pk, farmer.getPrimaryKey());
    }

    /**
     * Removes the association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmerPKs the primary keys of the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeFarmers(long pk, long[] farmerPKs)
        throws SystemException {
        for (long farmerPK : farmerPKs) {
            regionToFarmerTableMapper.deleteTableMapping(pk, farmerPK);
        }
    }

    /**
     * Removes the association between the region and the farmers. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmers the farmers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeFarmers(long pk, List<ru.kotikov.model.Farmer> farmers)
        throws SystemException {
        for (ru.kotikov.model.Farmer farmer : farmers) {
            regionToFarmerTableMapper.deleteTableMapping(pk,
                farmer.getPrimaryKey());
        }
    }

    /**
     * Sets the farmers associated with the region, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmerPKs the primary keys of the farmers to be associated with the region
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setFarmers(long pk, long[] farmerPKs) throws SystemException {
        Set<Long> newFarmerPKsSet = SetUtil.fromArray(farmerPKs);
        Set<Long> oldFarmerPKsSet = SetUtil.fromArray(regionToFarmerTableMapper.getRightPrimaryKeys(
                    pk));

        Set<Long> removeFarmerPKsSet = new HashSet<Long>(oldFarmerPKsSet);

        removeFarmerPKsSet.removeAll(newFarmerPKsSet);

        for (long removeFarmerPK : removeFarmerPKsSet) {
            regionToFarmerTableMapper.deleteTableMapping(pk, removeFarmerPK);
        }

        newFarmerPKsSet.removeAll(oldFarmerPKsSet);

        for (long newFarmerPK : newFarmerPKsSet) {
            regionToFarmerTableMapper.addTableMapping(pk, newFarmerPK);
        }
    }

    /**
     * Sets the farmers associated with the region, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the region
     * @param farmers the farmers to be associated with the region
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setFarmers(long pk, List<ru.kotikov.model.Farmer> farmers)
        throws SystemException {
        try {
            long[] farmerPKs = new long[farmers.size()];

            for (int i = 0; i < farmers.size(); i++) {
                ru.kotikov.model.Farmer farmer = farmers.get(i);

                farmerPKs[i] = farmer.getPrimaryKey();
            }

            setFarmers(pk, farmerPKs);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            FinderCacheUtil.clearCache(RegionModelImpl.MAPPING_TABLE_ENTITY_REGIONS_FARMERS_NAME);
        }
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the region persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.kotikov.model.Region")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Region>> listenersList = new ArrayList<ModelListener<Region>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Region>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }

        regionToFarmerTableMapper = TableMapperFactory.getTableMapper("entity_regions_farmers",
                "region_id", "farmer_id", this, farmerPersistence);
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RegionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        TableMapperFactory.removeTableMapper("entity_regions_farmers");
    }
}
