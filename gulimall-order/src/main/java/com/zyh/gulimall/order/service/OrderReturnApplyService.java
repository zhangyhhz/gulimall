package com.zyh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * ¶©µ¥ÍË»õÉêÇë
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:55:48
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

