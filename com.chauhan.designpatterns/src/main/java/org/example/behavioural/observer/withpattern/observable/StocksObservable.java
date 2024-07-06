package org.example.behavioural.observer.withpattern.observable;

import org.example.behavioural.observer.withpattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStock();
}
