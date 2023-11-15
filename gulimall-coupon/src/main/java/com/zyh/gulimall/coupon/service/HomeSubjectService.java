package com.zyh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyh.common.utils.PageUtils;
import com.zyh.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ��ҳר���jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 *
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:49:36
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

