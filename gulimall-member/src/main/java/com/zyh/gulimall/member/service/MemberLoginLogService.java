package com.zyh.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:54:22
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

