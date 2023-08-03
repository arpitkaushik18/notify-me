package org.designpatterns.observable;

import org.designpatterns.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservableImpl implements WeatherObservable{

    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    int temp = 35;
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    public void remove(NotificationObserver notificationObserver) {
            notificationObserverList.remove(notificationObserver);
    }

    public void notifySubscriber() {
        notificationObserverList.forEach(NotificationObserver::update);
    }

    public void setData(int count) {
        temp += count;
        if(temp > 40){
            notifySubscriber();
        }
    }

    public int getData() {
        return temp;
    }
}
