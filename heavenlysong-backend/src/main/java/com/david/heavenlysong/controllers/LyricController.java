package com.david.heavenlysong.controllers;

import com.david.heavenlysong.entities.Lyric;
import com.david.heavenlysong.payloads.LyricDto;
import com.david.heavenlysong.services.LyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lyrics")

public class LyricController {

    @Autowired
    private LyricService lyricService;


    @PostMapping("/user/{userId}/category/{categoryId}/lyrics")
    public ResponseEntity<LyricDto> createLyric(@RequestBody LyricDto lyricDto, @PathVariable Integer userId, @PathVariable Integer categoryId){
        LyricDto newLyricDto = this.lyricService.createLyric(lyricDto, userId, categoryId);
        return new ResponseEntity<>(newLyricDto, HttpStatus.CREATED);
    }

    @GetMapping("/category/{categoryId}/lyrics")
    public ResponseEntity<List<LyricDto>> getAllPostByCategory(@PathVariable Integer categoryId){
        List<LyricDto> lyricsByCategory = this.lyricService.getLyricsByCategory(categoryId);
        return new ResponseEntity<>(lyricsByCategory, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}/lyrics")
    public ResponseEntity<List<LyricDto>> getAllPostByUser(@PathVariable Integer userId){
        List<LyricDto> lyricsByUser = this.lyricService.getLyricsByUser(userId);
        return new ResponseEntity<>(lyricsByUser, HttpStatus.OK);
    }



}
