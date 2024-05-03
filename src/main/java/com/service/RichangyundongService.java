package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichangyundongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichangyundongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichangyundongView;


/**
 * 日常运动
 *
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
public interface RichangyundongService extends IService<RichangyundongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichangyundongVO> selectListVO(Wrapper<RichangyundongEntity> wrapper);
   	
   	RichangyundongVO selectVO(@Param("ew") Wrapper<RichangyundongEntity> wrapper);
   	
   	List<RichangyundongView> selectListView(Wrapper<RichangyundongEntity> wrapper);
   	
   	RichangyundongView selectView(@Param("ew") Wrapper<RichangyundongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichangyundongEntity> wrapper);
   	
}

