package com.company;

import java.util.ArrayList;
import java.util.List;

public class Spotify implements Subject{

    private List<String> albums = new ArrayList<>();
    private List<Observer>  observers = new ArrayList<>();


    public void addAlbum(String album){
        this.albums.add(album);
        notifyAllObserver();
    }
    public void removeAlbum(String album){
        this.albums.remove(album);
    }



    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer: observers) {
            observer.update(this.albums);
        }
    }
}
