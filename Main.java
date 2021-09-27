package com.company;

public class Main {
    public static void main(String[] args) {
        Spotify spring = new Spotify();
        spring.addAlbum("Twenty ine pilots");
        spring.addAlbum("Ninety one pilots");
        spring.addAlbum("Venom");

        User john = new User("maldik");
        User alibek = new User("machine");
        spring.registerObserver(john);
        spring.registerObserver(alibek);

        spring.removeAlbum("Venom");
        spring.notifyAllObserver();

    }
}
