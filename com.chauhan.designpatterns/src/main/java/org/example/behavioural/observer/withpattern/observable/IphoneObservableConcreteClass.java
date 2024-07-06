package org.example.behavioural.observer.withpattern.observable;

import org.example.behavioural.observer.withpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableConcreteClass implements StocksObservable {

    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver e: observerList) {
            e.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            this.stockCount = this.stockCount + newStockAdded;
            notifySubscribers();
        } else  {
            this.stockCount = this.stockCount + newStockAdded;
        }
    }

    @Override
    public int getStock() {
        return this.stockCount;
    }
}
