package com.david.heavenlysong.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Song {
    private int songID;
    private String composer;
    private String scale;
    private String lyrics;
    private String title;
}
