package com.zyh.gulimall.member.dao;

import com.zyh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangyh
 * @email h254234211@gmail.com
 * @date 2023-11-15 19:54:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
