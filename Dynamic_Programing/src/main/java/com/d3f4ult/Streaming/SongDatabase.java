package com.d3f4ult.Streaming;

import java.util.HashMap;

class SongDatabase {
    private HashMap<Integer, Song> songTable;
    private int nextSongId;

    public SongDatabase() {
        this.songTable = new HashMap<>();
        this.nextSongId = 1;
    }

    public int addSong(String title, String artist) {
        int songId = nextSongId++;
        Song song = new Song(title, artist);
        songTable.put(songId, song);
        return songId;
    }

    public Song getSongById(int songId) {
        return songTable.get(songId);
    }

    // Other methods as needed for song management
}