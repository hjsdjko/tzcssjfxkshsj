package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YundongfenxiDao;
import com.entity.YundongfenxiEntity;
import com.service.YundongfenxiService;
import com.entity.vo.YundongfenxiVO;
import com.entity.view.YundongfenxiView;

@Service("yundongfenxiService")
public class YundongfenxiServiceImpl extends ServiceImpl<YundongfenxiDao, YundongfenxiEntity> implements YundongfenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundongfenxiEntity> page = this.selectPage(
                new Query<YundongfenxiEntity>(params).getPage(),
                new EntityWrapper<YundongfenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundongfenxiEntity> wrapper) {
		  Page<YundongfenxiView> page =new Query<YundongfenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundongfenxiVO> selectListVO(Wrapper<YundongfenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundongfenxiVO selectVO(Wrapper<YundongfenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundongfenxiView> selectListView(Wrapper<YundongfenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundongfenxiView selectView(Wrapper<YundongfenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
