package com.dao;

import com.entity.RichangyundongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichangyundongVO;
import com.entity.view.RichangyundongView;


/**
 * 日常运动
 * 
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
public interface RichangyundongDao extends BaseMapper<RichangyundongEntity> {
	
	List<RichangyundongVO> selectListVO(@Param("ew") Wrapper<RichangyundongEntity> wrapper);
	
	RichangyundongVO selectVO(@Param("ew") Wrapper<RichangyundongEntity> wrapper);
	
	List<RichangyundongView> selectListView(@Param("ew") Wrapper<RichangyundongEntity> wrapper);

	List<RichangyundongView> selectListView(Pagination page,@Param("ew") Wrapper<RichangyundongEntity> wrapper);
	
	RichangyundongView selectView(@Param("ew") Wrapper<RichangyundongEntity> wrapper);
	
}
