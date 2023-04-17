package com.david.heavenlysong.services;

import com.david.heavenlysong.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {
    //create
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    //delete
    void deleteCategory(Integer categoryId);

    //get
    CategoryDto getCategoryById(Integer categoryId);

    //get all
    List<CategoryDto> getAllCategory();
}
