package org.designpatterns;


import org.designpatterns.observable.TemperatureObservableImpl;
import org.designpatterns.observable.WeatherObservable;
import org.designpatterns.observer.NotificationObserver;
import org.designpatterns.observer.SMSAlertObserverImpl;

public class App
{
    public static void main( String[] args )
    {
        WeatherObservable weatherObservable = new TemperatureObservableImpl();
        NotificationObserver notificationObserver = new SMSAlertObserverImpl("9034567891",weatherObservable);

        weatherObservable.add(notificationObserver);
        weatherObservable.setData(10);


    }
}
