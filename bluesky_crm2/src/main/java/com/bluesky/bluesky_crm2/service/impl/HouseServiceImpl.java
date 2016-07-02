package com.bluesky.bluesky_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bluesky.bluesky_crm2.model.House;
import com.bluesky.bluesky_crm2.service.HouseService;
import com.bluesky.bluesky_crm2.mapper.HouseMapper;
/**
 * ��Դ���������ʵ����
 * @author ������ 
 * @date 2016��7��2��
 */
public class HouseServiceImpl implements HouseService{
	
	@Autowired
	private HouseMapper houseMapper;
	
	public void setHouseMapper(HouseMapper houseMapper) {
		this.houseMapper = houseMapper;
	}

	
	@Override
	public void addHouse(House house) {
		
		houseMapper.addHouse(house);
		
	}

	@Override
	public void editHouse(House house) {

		houseMapper.editHouse(house);
		
	}

	@Override
	public void selectAllHouse() {
		houseMapper.selectAllHouse();
		
	}

	@Override
	public void selectByXX() {
		houseMapper.selectByXX(); 
	}

	@Override
	public void collectHouse() {
		houseMapper.collectHouse();
		
	}
 


}