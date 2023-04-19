package com.david.heavenlysong.services;

import com.david.heavenlysong.payloads.LyricDto;

import java.util.List;

public interface LyricService {
    LyricDto createLyric(LyricDto lyricDto, Integer userId, Integer categoryId);

    //update
    LyricDto updateLyric(LyricDto lyricDto, Integer lyricId);

    //delete
    void deleteLyric(Integer lyricId);

    //get
    LyricDto getLyricById(Integer lyricId);

    //get all
    List<LyricDto> getAllLyric();

    //get all lyric by category
    List<LyricDto> getLyricsByCategory(Integer categoryId);
}
