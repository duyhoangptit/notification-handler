package vn.tiger.notification.services.notification;

import vn.tiger.notification.constants.enums.NotifyBusinessType;
import vn.tiger.notification.dtos.request.NotificationInput;

public interface NotifyBusinessService {

    boolean isNotifyBusinessType(NotifyBusinessType notifyBusinessType);

    void businessLogic(NotificationInput notification);
}
