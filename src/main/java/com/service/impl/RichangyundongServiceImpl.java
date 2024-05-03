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


import com.dao.RichangyundongDao;
import com.entity.RichangyundongEntity;
import com.service.RichangyundongService;
import com.entity.vo.RichangyundongVO;
import com.entity.view.RichangyundongView;

@Service("richangyundongService")
public class RichangyundongServiceImpl extends ServiceImpl<RichangyundongDao, RichangyundongEntity> implements RichangyundongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichangyundongEntity> page = this.selectPage(
                new Query<RichangyundongEntity>(params).getPage(),
                new EntityWrapper<RichangyundongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichangyundongEntity> wrapper) {
		  Page<RichangyundongView> page =new Query<RichangyundongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichangyundongVO> selectListVO(Wrapper<RichangyundongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichangyundongVO selectVO(Wrapper<RichangyundongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichangyundongView> selectListView(Wrapper<RichangyundongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichangyundongView selectView(Wrapper<RichangyundongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
