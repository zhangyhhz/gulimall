package com.zyh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ÍË»õÔ­Òò
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:55:48
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

