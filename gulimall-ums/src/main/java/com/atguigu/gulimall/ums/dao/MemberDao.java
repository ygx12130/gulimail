package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ygx12130
 * @email lfy@atguigu.com
 * @date 2019-09-04 18:02:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
