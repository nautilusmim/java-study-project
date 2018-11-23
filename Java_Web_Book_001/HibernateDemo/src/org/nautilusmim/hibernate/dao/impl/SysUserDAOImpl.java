package org.nautilusmim.hibernate.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.nautilusmim.hibernate.common.Page;
import org.nautilusmim.hibernate.dao.SysUserDAO;
import org.nautilusmim.hibernate.pojo.SysUser;
import org.nautilusmim.hibernate.util.HibernateUtil;

public class SysUserDAOImpl implements SysUserDAO {

	@Override
	public boolean create(SysUser user) throws Exception {
		Session session = null;
		Transaction tx = null;
		Long id = 0L;
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			id = (Long)session.save(user);  // 返回自动生成的主键
			tx.commit();
		} catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			HibernateUtil.closeSession();
		}
		
		return (id > 0);
	}

	@Override
	public boolean upadte(SysUser user) throws Exception {
		boolean opResult = false;
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			opResult = true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			HibernateUtil.closeSession();
		}
		
		return opResult;
	}

	@Override
	public boolean delete(Long id) throws Exception {
		boolean opResult = false;
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			SysUser user = retrieveById(id);
			session.delete(user);
			tx.commit();
			
			opResult = true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			HibernateUtil.closeSession();
		}
		
		return opResult;
	}

	@Override
	public List<SysUser> retrieveAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysUser retrieveById(Long id) throws Exception {
		Session session = null;
		SysUser user = null;
		
		try {
			session = HibernateUtil.getSession();
			user = (SysUser) session.load(SysUser.class, id);
			//user = (SysUser) session.get(SysUser.class, id); 
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
		}
		
		return user;
	}

	@Override
	public List<SysUser> retrieveByParams(Map<String, Object> params)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<SysUser> retrieveByPage(int pageNo, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
