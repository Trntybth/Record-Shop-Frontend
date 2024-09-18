package com.northcoders.record_shop_application.model;

public class Album {
    private String id;
    private String title;
    private String artist;
    private String releaseYear;
    private String genre;
    private String stockTracker;


    public Album() {
    }


    public Album(String id, String title, String artist, String releaseYear, String genre, String stockTracker) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.stockTracker = stockTracker;
    }
}
