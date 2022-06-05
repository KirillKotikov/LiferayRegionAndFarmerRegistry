package ru.kotikov.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.kotikov.model.Farmer;
import ru.kotikov.model.Region;
import ru.kotikov.service.base.FarmerLocalServiceBaseImpl;

import java.util.List;

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
    public List<Farmer> getByFarmerName(String name) throws SystemException {
        return farmerPersistence.findByFarmerName(name);
    }

    public List<Farmer> getByFarmerArchiveStatus(boolean archive) throws SystemException {
        return farmerPersistence.findByFarmerArchiveStatus(archive);
    }

    public List<Region> getFarmersRegions(long farmerId) throws SystemException {
        return farmerPersistence.getRegions(farmerId);
    }
}
