package com.avania.expensetrackerapi.Services;

import com.avania.expensetrackerapi.Domain.Category;
import com.avania.expensetrackerapi.Exceptions.EtBadRequestException;
import com.avania.expensetrackerapi.Exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId,Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId,String title,String description) throws EtBadRequestException;
    void updateCategory(Integer userId,Integer categoryId,Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userId,Integer categoryId) throws EtResourceNotFoundException;
}
