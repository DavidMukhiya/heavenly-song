package com.david.heavenlysong.repositories;

import com.david.heavenlysong.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
