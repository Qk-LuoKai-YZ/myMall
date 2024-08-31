package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 7ink
 * @email luokai.qk@gmail.com
 * @date 2024-08-30 16:18:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
