package com.entity.view;

import com.entity.RichangyundongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 日常运动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
@TableName("richangyundong")
public class RichangyundongView  extends RichangyundongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RichangyundongView(){
	}
 
 	public RichangyundongView(RichangyundongEntity richangyundongEntity){
 	try {
			BeanUtils.copyProperties(this, richangyundongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
