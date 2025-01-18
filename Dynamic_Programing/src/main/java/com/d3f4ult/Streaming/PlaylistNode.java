package com.d3f4ult.Streaming;
class PlaylistNode {
    private int songId;
    private PlaylistNode next;

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public void setNext(PlaylistNode next) {
        this.next = next;
    }

    public PlaylistNode(int songId) {
        this.songId = songId;
        this.next = null;
    }

    // Getters and setters

    public int getSongId() {
        return songId;
    }

    public PlaylistNode getNext() {
        return next;
    }
}
