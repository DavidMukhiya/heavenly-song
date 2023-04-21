package com.david.heavenlysong.payloads;

import com.david.heavenlysong.entities.Category;
import com.david.heavenlysong.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class LyricDto {
    private String songTitle;

    private String songNo;

    private String singer;

    private String scale;

    private String lyric;

    private String lyricist;

    private String composer;

    private CategoryDto category;

    private UserDto user;

}
