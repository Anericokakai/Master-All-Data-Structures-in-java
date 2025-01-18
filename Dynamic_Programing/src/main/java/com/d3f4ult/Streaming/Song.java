package com.d3f4ult.Streaming;

class Song {
    private String title;
    private String artist;
    // Other song metadata fields as needed

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }/

    // Getters and setters for metadata fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}
