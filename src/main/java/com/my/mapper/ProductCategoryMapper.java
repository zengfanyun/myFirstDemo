package com.my.mapper;

import com.my.entity.ProductCategory;
import com.my.entity.ProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {

    long countByExample(Integer example);
}