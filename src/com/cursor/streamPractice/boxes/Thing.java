package com.cursor.streamPractice.boxes;

public class Thing {
    private boolean isFragile;

    Thing(boolean isFragile) {
        this.isFragile = isFragile;
    }

    boolean isFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "This thing is " + (isFragile ? "fragile" : "nonfragile");
    }
}
