package com.bluesky.bluesky_crm2.service;

 

import com.bluesky.bluesky_crm2.model.Users;

/**
 * �û�����ӿ�
 * 
 * @author ������
 * @date 2016��7��2��
 */
public interface UserService {
	
	/**
	 * �û���¼
	 * 
	 * @param name
	 *            �û���
	 * @param pwd
	 *            �û�����
	 * @return �û���Ϣ
	 */
	public Users loging( String name, String pwd);

	/**
	 * ����û�
	 * 
	 * @param Ҫ��ӵ��û�
	 */
	public void addUser(Users user);

	/**
	 * �༭�û�
	 * 
	 * @param users
	 *            Ҫ�༭���û�
	 */
	public void editUser(Users users);

	/**
	 * �޸�����
	 * 
	 * @param users
	 *            �޸ĵ��û�
	 */
	public void modifyPwd(Users user);
}
