package com.zyh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-13 22:10:58
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

