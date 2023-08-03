package org.designpatterns.observer;

import org.designpatterns.observable.WeatherObservable;

public class SMSAlertObserverImpl implements NotificationObserver{

    private String phoneNumber;
    private WeatherObservable weatherObservable;

    public SMSAlertObserverImpl(String phoneNumber, WeatherObservable weatherObservable) {
        this.phoneNumber = phoneNumber;
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void update() {

        sendSMS(phoneNumber);
    }

    private void sendSMS(String phoneNumber) {
        System.out.println(phoneNumber + " message sent for high temperature");
    }
}
