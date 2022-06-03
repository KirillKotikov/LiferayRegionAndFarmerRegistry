package ru.kotikov.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ru.kotikov.service.ClpSerializer;
import ru.kotikov.service.FarmerLocalServiceUtil;
import ru.kotikov.service.RegionLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            FarmerLocalServiceUtil.clearService();

            RegionLocalServiceUtil.clearService();
        }
    }
}
