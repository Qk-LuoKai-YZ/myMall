package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 7ink
 * @email luokai.qk@gmail.com
 * @date 2024-08-30 20:02:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
