package utils;

import com.liferay.portal.kernel.dao.orm.Conjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import ru.kotikov.model.Farmer;
import ru.kotikov.service.FarmerLocalServiceUtil;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FarmerFinderUtil {
    public static List<Farmer> getFarmersWithFilters(String farmerName, Long farmerInn, String registrationRegionName,
                                                     Date afterRegistrationDate, Date beforeRegistrationDate, String archiveStatus) {

        List<Farmer> farmers = Collections.emptyList();

        try {
            Conjunction conjunction = RestrictionsFactoryUtil.conjunction();

            if (!farmerName.equalsIgnoreCase("")) {
                conjunction.add(RestrictionsFactoryUtil.eq("farmerName", farmerName));
            }

            if (farmerInn != 0) {
                conjunction.add(RestrictionsFactoryUtil.eq("farmerInn", farmerInn));
            }

            if (!registrationRegionName.equals("")) {
                conjunction.add(RestrictionsFactoryUtil.eq("farmerRegistrationRegionName", registrationRegionName));
            }

            if (afterRegistrationDate != null) {
                conjunction.add(RestrictionsFactoryUtil.ge("farmerRegistrationDate", afterRegistrationDate));
            }

            if (beforeRegistrationDate != null) {
                conjunction.add(RestrictionsFactoryUtil.lt("farmerRegistrationDate", beforeRegistrationDate));
            }

            if (!archiveStatus.equals("any")) {
                boolean aS = Boolean.parseBoolean(archiveStatus);
                conjunction.add(RestrictionsFactoryUtil.eq("farmerArchiveStatus", aS));
            }

            DynamicQuery dynamicQuery = FarmerLocalServiceUtil.dynamicQuery();
            dynamicQuery.add(conjunction);

            return FarmerLocalServiceUtil.dynamicQuery(dynamicQuery, -1, -1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return farmers;
    }
}
