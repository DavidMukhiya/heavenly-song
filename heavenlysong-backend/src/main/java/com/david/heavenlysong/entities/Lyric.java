package com.david.heavenlysong.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "lyrics")
@Getter
@Setter
@NoArgsConstructor
public class Lyric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lyricId;

    private String songTitle;

    private String songNo;

    private String singer;

    private String scale;

    private String lyric;

    private String lyricist;

    private String composer;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    private User user;

}
