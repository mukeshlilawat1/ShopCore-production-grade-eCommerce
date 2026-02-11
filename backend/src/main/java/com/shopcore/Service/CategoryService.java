package com.shopcore.Service;


import com.shopcore.Model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    void createCategory(Category category);
}
