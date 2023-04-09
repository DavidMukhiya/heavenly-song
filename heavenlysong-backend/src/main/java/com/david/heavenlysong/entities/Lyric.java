package com.david.heavenlysong.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lyric {
    private int lyric_ID;
    private String songTitle;
    private String singer;
    private String scale;
    private String lyric;
    private String lyricist;
    private String composer;
}
