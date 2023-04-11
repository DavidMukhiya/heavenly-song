package com.david.blogapplication.entities;

import com.david.heavenlysong.entities.Lyric;
import com.david.heavenlysong.entities.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="comments")
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Lyric lyric;
    @ManyToOne
    private User user;
}
