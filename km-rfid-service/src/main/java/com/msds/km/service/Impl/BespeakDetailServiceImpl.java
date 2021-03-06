package com.msds.km.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msds.base.service.impl.BaseServiceImpl;
import com.msds.km.entity.BespeakDetailEntity;
import com.msds.km.mapper.BespeakDetailMapper;
import com.msds.km.service.BespeakDetailService;

/**
 * 
 * <br>
 * <b>功能：</b>BespeakDetailService<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-08-06 18:33:25 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
@Service("bespeakDetailService")
public class BespeakDetailServiceImpl extends
		BaseServiceImpl<BespeakDetailEntity> implements BespeakDetailService {

	@Autowired
	private BespeakDetailMapper bespeakDetailMapper;

	public BespeakDetailMapper baseMapper() {
		return bespeakDetailMapper;
	}

}
