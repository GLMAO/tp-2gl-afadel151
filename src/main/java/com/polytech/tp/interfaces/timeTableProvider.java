package com.polytech.tp.interfaces;

public interface timeTableProvider {
    public void addTimeTableObserver(Observer observer);
    public void removeTimeTableObserver(Observer observer);
}
