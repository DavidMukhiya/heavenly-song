package com.david.heavenlysong.repositories;

import com.david.heavenlysong.entities.Category;
import com.david.heavenlysong.entities.Lyric;
import com.david.heavenlysong.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LyricRepo extends JpaRepository<Lyric, Integer> {
    List<Lyric> findByUser(User user);
    List<Lyric> findByCategory(Category category);
}
