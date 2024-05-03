package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundongfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundongfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongfenxiView;


/**
 * 运动分析
 *
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
public interface YundongfenxiService extends IService<YundongfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundongfenxiVO> selectListVO(Wrapper<YundongfenxiEntity> wrapper);
   	
   	YundongfenxiVO selectVO(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
   	
   	List<YundongfenxiView> selectListView(Wrapper<YundongfenxiEntity> wrapper);
   	
   	YundongfenxiView selectView(@Param("ew") Wrapper<YundongfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundongfenxiEntity> wrapper);
   	
}

