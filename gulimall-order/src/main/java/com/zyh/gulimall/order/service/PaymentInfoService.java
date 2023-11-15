package com.zyh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * Ö§¸¶ÐÅÏ¢±í
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:55:48
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

