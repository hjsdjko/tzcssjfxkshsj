package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 成绩信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-07 20:08:00
 */
@TableName("chengjixinxi")
public class ChengjixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChengjixinxiEntity() {
		
	}
	
	public ChengjixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 跳远
	 */
					
	private Integer tiaoyuan;
	
	/**
	 * 跑步
	 */
					
	private Integer paobu;
	
	/**
	 * 仰卧
	 */
					
	private Integer yangwo;
	
	/**
	 * 铅球
	 */
					
	private Integer qianqiu;
	
	/**
	 * 跳绳
	 */
					
	private Integer tiaosheng;
	
	/**
	 * 总成绩
	 */
					
	private Integer zongchengji;
	
	/**
	 * 测试数
	 */
					
	private String ceshishu;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：跳远
	 */
	public void setTiaoyuan(Integer tiaoyuan) {
		this.tiaoyuan = tiaoyuan;
	}
	/**
	 * 获取：跳远
	 */
	public Integer getTiaoyuan() {
		return tiaoyuan;
	}
	/**
	 * 设置：跑步
	 */
	public void setPaobu(Integer paobu) {
		this.paobu = paobu;
	}
	/**
	 * 获取：跑步
	 */
	public Integer getPaobu() {
		return paobu;
	}
	/**
	 * 设置：仰卧
	 */
	public void setYangwo(Integer yangwo) {
		this.yangwo = yangwo;
	}
	/**
	 * 获取：仰卧
	 */
	public Integer getYangwo() {
		return yangwo;
	}
	/**
	 * 设置：铅球
	 */
	public void setQianqiu(Integer qianqiu) {
		this.qianqiu = qianqiu;
	}
	/**
	 * 获取：铅球
	 */
	public Integer getQianqiu() {
		return qianqiu;
	}
	/**
	 * 设置：跳绳
	 */
	public void setTiaosheng(Integer tiaosheng) {
		this.tiaosheng = tiaosheng;
	}
	/**
	 * 获取：跳绳
	 */
	public Integer getTiaosheng() {
		return tiaosheng;
	}
	/**
	 * 设置：总成绩
	 */
	public void setZongchengji(Integer zongchengji) {
		this.zongchengji = zongchengji;
	}
	/**
	 * 获取：总成绩
	 */
	public Integer getZongchengji() {
		return zongchengji;
	}
	/**
	 * 设置：测试数
	 */
	public void setCeshishu(String ceshishu) {
		this.ceshishu = ceshishu;
	}
	/**
	 * 获取：测试数
	 */
	public String getCeshishu() {
		return ceshishu;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}

}
