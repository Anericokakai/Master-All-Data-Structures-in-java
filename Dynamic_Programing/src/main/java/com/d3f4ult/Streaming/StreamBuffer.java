package com.d3f4ult.Streaming;

import java.util.Queue;
import java.util.LinkedList;

class StreamBuffer {
    private Queue<Integer> buffer;

    public StreamBuffer() {
        this.buffer = new LinkedList<>();
    }

    public void enqueueSong(int songId) {
        buffer.add(songId);
    }

    public int dequeueSong() {
        return buffer.poll();
    }

    public boolean isEmpty() {
        return buffer.isEmpty();
    }
}