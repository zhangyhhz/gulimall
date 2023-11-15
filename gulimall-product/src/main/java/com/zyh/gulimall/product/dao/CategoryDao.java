package com.zyh.gulimall.product.dao;

import com.zyh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-13 22:10:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
