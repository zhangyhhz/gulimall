package com.zyh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * ¶©µ¥²Ù×÷ÀúÊ·¼ÇÂ¼
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:55:48
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

