package com.david.heavenlysong.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    private int user_id;
    private String name;
    private String email;
    private String password;
    private String about;
}
