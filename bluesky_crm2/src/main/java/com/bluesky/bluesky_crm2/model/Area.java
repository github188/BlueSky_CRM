package com.bluesky.bluesky_crm2.model;

/**
 * ����ʵ����
 * 
 * @author ������
 * @date 2016��7��2��
 */
public class Area {

	/**
	 * ��ʶ id
	 */
	private int id;

	/**
	 * ������
	 */
	private String name;

	/**
	 * ������
	 */
	private Users manager;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the manager
	 */
	public Users getManager() {
		return manager;
	}

	/**
	 * @param manager
	 *            the manager to set
	 */
	public void setManager(Users manager) {
		this.manager = manager;
	}

}