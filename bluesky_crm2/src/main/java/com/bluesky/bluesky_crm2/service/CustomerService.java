package com.bluesky.bluesky_crm2.service;

import com.bluesky.bluesky_crm2.model.Customer;

/**
 * �ͻ���������
 * @author ������ 
 * @date 2016��7��2��
 */
public interface CustomerService {
	
	/**
	 * ����û�
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	
	/**
	 * �༭�û�
	 * @param customer
	 */
	public void editCustomer(Customer customer);
	
	/**
	 * ����
	 */
	public void blackList(); 
}
