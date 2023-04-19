package com.david.heavenlysong.controllers;

import com.david.heavenlysong.payloads.LyricDto;
import com.david.heavenlysong.services.LyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lyrics")

public class PostController {

    @Autowired
    private LyricService lyricService;


    @PostMapping("/user/{userId}/category/{categoryId}/posts")
    public ResponseEntity<LyricDto> createLyric(@RequestBody LyricDto lyricDto, @PathVariable Integer userId, @PathVariable Integer categoryId){
        LyricDto newLyricDto = this.lyricService.createLyric(lyricDto, userId, categoryId);
        return new ResponseEntity<>(newLyricDto, HttpStatus.CREATED);
    }
}
