package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ygx12130
 * @email lfy@atguigu.com
 * @date 2019-09-04 17:51:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
