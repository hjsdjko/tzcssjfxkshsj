package com.dao;

import com.entity.YundongfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundongfenxiVO;
import com.entity.view.YundongfenxiView;


/**
 * 运动分析
 * 
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
public interface YundongfenxiDao extends BaseMapper<YundongfenxiEntity> {
	
	List<YundongfenxiVO> selectListVO(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
	
	YundongfenxiVO selectVO(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
	
	List<YundongfenxiView> selectListView(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);

	List<YundongfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
	
	YundongfenxiView selectView(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
	
}
