package org.nautilusmim.hibernate.test;

import org.nautilusmim.hibernate.dao.SysUserDAO;
import org.nautilusmim.hibernate.dao.impl.SysUserDAOImpl;
import org.nautilusmim.hibernate.pojo.SysUser;

public class TestCase {

	public static void main(String[] args) throws Exception {
//		System.out.println(System.getProperty("sun.boot.class.path"));
//		System.out.println(System.getProperty("java.ext.dirs"));
//		System.out.println(System.getProperty("java.class.path"));
		
		SysUserDAO dao = new SysUserDAOImpl();
		
//		SysUser user = new SysUser();	
//		user.setName("测试5");
//		user.setPassword("0");
//		user.setType((short)0);
//		
//		dao.create(user);
		
//		user.setId(4L);
//		user.setName("更改1");
//		user.setPassword("0");
//		user.setType((short) 0);
//		dao.upadte(user);
		
//		dao.delete(5L);
		SysUser user = dao.retrieveById(51L);
		// 延迟加载，对象属性并未取出时会报错
		System.out.println(user.getName()); 
	}

}
