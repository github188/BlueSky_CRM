package com.bluesky.bluesky_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bluesky.bluesky_crm2.model.Customer;
import com.bluesky.bluesky_crm2.mapper.CustomerMapper;

/**
 * �ͻ���������ʵ����
 * 
 * @author ������
 * @date 2016��7��2��
 */
public class CustomerServiceImpl implements CustomerMapper {

	@Autowired
	private CustomerMapper customerMapper;

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);

	}

	@Override
	public void editCustomer(Customer customer) {
		customerMapper.editCustomer(customer);

	}

	@Override
	public void blackList() {
		customerMapper.blackList();

	}

}
