package com.zyh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * �Ż�ȯ��Ϣ
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:49:36
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

