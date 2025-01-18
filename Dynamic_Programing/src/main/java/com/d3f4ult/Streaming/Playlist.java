package com.d3f4ult.Streaming;



class Playlist {
    private PlaylistNode head;

    public Playlist() {
        this.head = null;
    }

    public void addSongToPlaylist(int songId) {
        PlaylistNode newNode = new PlaylistNode(songId);
        if (head == null) {
            head = newNode;
        } else {
            PlaylistNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Other playlist management methods
}
