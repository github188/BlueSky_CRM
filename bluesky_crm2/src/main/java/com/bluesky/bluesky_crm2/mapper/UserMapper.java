package com.bluesky.bluesky_crm2.mapper;
 
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bluesky.bluesky_crm2.model.Users;

/**
 * �û����ݲ�
 * 
 * @author ������
 * @date 2016��7��2��
 */
public interface UserMapper {

	/**
	 * �û���¼
	 * 
	 * @param name
	 *            �û���
	 * @param pwd
	 *            �û�����
	 * @return �û���Ϣ
	 */
	@Select("select * from users where name=#{name} and pwd=#{pwd}")
	public Users loging(@Param("name") String name, @Param("pwd") String pwd);

	/**
	 * ����û�
	 * 
	 * @param Ҫ��ӵ��û�
	 */
	@Insert("insert into users values(#{user.id},#{user.name},#{user.password}"
			+ "#{user.phone},#{user.idcard},#{user.store},#{user.ulevel},#{user.state})")
	public void addUser(Users user);

	/**
	 * �༭�û�
	 * 
	 * @param users
	 *            Ҫ�༭���û�
	 */
	@Update("update users set x")
	public void editUser(Users users);

	/**
	 * �޸�����
	 * 
	 * @param users
	 *            �޸ĵ��û�
	 */
	@Update("update users set password={#password} where name=#{user.name} and password=#{user.password}")
	public void modifyPwd(Users user);

}
