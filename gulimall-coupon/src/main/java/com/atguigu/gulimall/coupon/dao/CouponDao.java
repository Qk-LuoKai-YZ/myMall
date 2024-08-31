package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 7ink
 * @email luokai.qk@gmail.com
 * @date 2024-08-30 19:46:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
