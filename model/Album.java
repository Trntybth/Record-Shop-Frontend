package com.northcoders.record_shop_application.model;

public class Album {
    private String id;
    private String title;
    private String artist;
    private String releaseYear;
    private String genre;
    private String stockTracker;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStockTracker() {
        return stockTracker;
    }

    public void setStockTracker(String stockTracker) {
        this.stockTracker = stockTracker;
    }

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
