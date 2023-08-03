package org.designpatterns.observable;

import org.designpatterns.observer.NotificationObserver;

public interface WeatherObservable {

    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);

    public void notifySubscriber();
    public void setData(int count);

    public int getData();

}
