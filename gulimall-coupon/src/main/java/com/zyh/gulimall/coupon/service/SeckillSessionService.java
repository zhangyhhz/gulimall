package com.zyh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * ��ɱ�����
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:49:36
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

