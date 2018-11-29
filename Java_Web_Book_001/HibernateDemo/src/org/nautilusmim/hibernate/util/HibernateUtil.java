package org.nautilusmim.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();
	
	private static SessionFactory sessionFactory = null;
	
	static {
		// 构建数据源
		Configuration cfg = new Configuration().configure();
		if(null == sessionFactory) {
			sessionFactory = cfg.buildSessionFactory();
		}
	}
	
	/**
	 * 重构数据源
	 * 
	 * @return	SessionFactory	数据源对象
	 * @throws	Exception
	 */
	public static SessionFactory rebuildSessionFactory() throws Exception {
		Configuration cfg = new Configuration().configure();
		if(null == sessionFactory) {
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
	
	/**
	 * 获取数据库连接 - 需要手动关闭连接
	 * 
	 * @return	Session	数据库连接对象
	 * @throws	Exception
	 */
	public static Session getSession() throws Exception {
		Session session = threadLocal.get();
		if(null == session || !session.isOpen()) {
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		
		return session;
	}
	
	/**
	 * 获取数据库连接 - 业务处理后自动关闭连接
	 * 
	 * @return	Session	数据库连接对象
	 * @throws	Exception
	 */
	public static Session getCurrentSession() throws Exception {
		Session session = threadLocal.get();
		if(null == session || !session.isOpen()) {
			session = sessionFactory.getCurrentSession();
			threadLocal.set(session);
		}
		
		return session;
	}
	
	/**
	 * 关闭数据库连接
	 * 
	 * @throws Exception
	 */
	public static void closeSession() throws Exception {
		Session session = threadLocal.get();
		if(null != session) {
			threadLocal.set(null);
			session.close();
		}
	}
	
	/**
	 * 关闭数据源
	 * 
	 * @throws Exception
	 */
	public static void shutdown() throws Exception {
		if(null != sessionFactory) {
			sessionFactory.close();
			sessionFactory = null;
		}
	}
	
}
