package com.zyh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-13 22:10:58
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

