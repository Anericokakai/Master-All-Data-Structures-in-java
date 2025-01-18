package com.d3f4ult.Streaming;



public class MusicStreamingService {
    public static void main(String[] args) {
        SongDatabase songDatabase = new SongDatabase();
        Playlist playlist = new Playlist();
        StreamBuffer streamBuffer = new StreamBuffer();

        // Example usage
        int song1Id = songDatabase.addSong("Song 1", "Artist 1");
        int song2Id = songDatabase.addSong("Song 2", "Artist 2");
        int song3=songDatabase.addSong("Delusional","Chris Brown");

        playlist.addSongToPlaylist(song1Id);
        playlist.addSongToPlaylist(song2Id);
        playlist.addSongToPlaylist(song3);
  
        streamBuffer.enqueueSong(song1Id);
        streamBuffer.enqueueSong(song2Id);
        streamBuffer.enqueueSong(song3);

        // Example: Dequeue and play songs from the buffer
        while (!streamBuffer.isEmpty()) {
            int currentSongId = streamBuffer.dequeueSong();
            Song currentSong = songDatabase.getSongById(currentSongId);
            if (currentSong != null) {
                System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
            }
        }
    }
}
