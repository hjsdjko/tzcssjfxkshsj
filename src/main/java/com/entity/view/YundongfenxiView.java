package com.entity.view;

import com.entity.YundongfenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 运动分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
@TableName("yundongfenxi")
public class YundongfenxiView  extends YundongfenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YundongfenxiView(){
	}
 
 	public YundongfenxiView(YundongfenxiEntity yundongfenxiEntity){
 	try {
			BeanUtils.copyProperties(this, yundongfenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
