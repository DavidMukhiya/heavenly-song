package com.david.heavenlysong.services.impl;

import com.david.heavenlysong.entities.Category;
import com.david.heavenlysong.entities.Lyric;
import com.david.heavenlysong.entities.User;
import com.david.heavenlysong.exceptions.ResourceNotFoundException;
import com.david.heavenlysong.payloads.LyricDto;
import com.david.heavenlysong.repositories.CategoryRepo;
import com.david.heavenlysong.repositories.LyricRepo;
import com.david.heavenlysong.repositories.UserRepo;
import com.david.heavenlysong.services.LyricService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LyricServiceImpl implements LyricService {
    @Autowired
    private LyricRepo lyricRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public LyricDto createLyric(LyricDto lyricDto, Integer userId, Integer categoryId) {
        User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User ", " User Id ", userId));
        Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category ", " Category Id ", categoryId));

        Lyric lyric = this.modelMapper.map(lyricDto, Lyric.class);

        lyric.setUser(user);
        lyric.setCategory(category);
        this.lyricRepo.save(lyric);
        return this.modelMapper.map(lyric, LyricDto.class);
    }

    @Override
    public LyricDto updateLyric(LyricDto lyricDto, Integer lyricId) {
        return null;
    }

    @Override
    public void deleteLyric(Integer lyricId) {

    }

    @Override
    public LyricDto getLyricById(Integer lyricId) {
        return null;
    }

    @Override
    public List<LyricDto> getAllLyric() {
        return null;
    }

    @Override
    public List<LyricDto> getLyricsByCategory(Integer categoryId) {
        return null;
    }
}
