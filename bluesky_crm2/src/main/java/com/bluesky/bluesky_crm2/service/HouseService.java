package com.bluesky.bluesky_crm2.service; 

import com.bluesky.bluesky_crm2.model.House;

/**
 * ��Դ��������
 * @author ������ 
 * @date 2016��7��2��
 */
public interface HouseService {

	/**
	 * ¼�뷿Դ
	 * @param house
	 */
	public void addHouse(House house);
	
	/**
	 * �༭��Դ
	 * @param house
	 */ 
	public void editHouse(House house);
	
	/**
	 * ��ѯ���з�Դ
	 */ 
	public void selectAllHouse();
	
	/**
	 * ��ѯָ����Դ
	 */
	public void selectByXX();
	
	/**
	 * �ղط�Դ
	 */
	public void collectHouse();
	
}
