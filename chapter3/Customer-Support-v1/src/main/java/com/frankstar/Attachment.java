package com.frankstar;

/**
 * Created by frankstar on 16/6/21.
 */
public class Attachment {
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    private byte[] contents;

    public String getName() {
        return name;
    }
}
