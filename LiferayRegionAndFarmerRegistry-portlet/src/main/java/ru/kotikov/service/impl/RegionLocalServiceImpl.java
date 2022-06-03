package ru.kotikov.service.impl;

import ru.kotikov.service.base.RegionLocalServiceBaseImpl;

/**
 * The implementation of the region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.kotikov.service.RegionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Kirill_Kotikov
 * @see ru.kotikov.service.base.RegionLocalServiceBaseImpl
 * @see ru.kotikov.service.RegionLocalServiceUtil
 */
public class RegionLocalServiceImpl extends RegionLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.kotikov.service.RegionLocalServiceUtil} to access the region local service.
     */
}
