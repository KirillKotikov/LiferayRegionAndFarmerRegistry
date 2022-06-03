package ru.kotikov.service.impl;

import ru.kotikov.service.base.FarmerLocalServiceBaseImpl;

/**
 * The implementation of the farmer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.kotikov.service.FarmerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Kirill_Kotikov
 * @see ru.kotikov.service.base.FarmerLocalServiceBaseImpl
 * @see ru.kotikov.service.FarmerLocalServiceUtil
 */
public class FarmerLocalServiceImpl extends FarmerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.kotikov.service.FarmerLocalServiceUtil} to access the farmer local service.
     */
}
