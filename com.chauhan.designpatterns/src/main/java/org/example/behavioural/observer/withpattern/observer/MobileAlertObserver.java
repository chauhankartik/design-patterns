package org.example.behavioural.observer.withpattern.observer;

import org.example.behavioural.observer.withpattern.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    private StocksObservable stocksObservable;
    private String mobileNumber;

    public MobileAlertObserver(String mobileNumber, StocksObservable stocksObservable) {
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending SMS to " + this.mobileNumber);
    }
}
