package com.ankush.rajabhoj.observer.weatherdata;

import com.ankush.rajabhoj.observer.display.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
