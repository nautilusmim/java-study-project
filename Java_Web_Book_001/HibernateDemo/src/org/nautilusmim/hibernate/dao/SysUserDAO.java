package org.nautilusmim.hibernate.dao;

import java.util.List;
import java.util.Map;

import org.nautilusmim.hibernate.common.Page;
import org.nautilusmim.hibernate.pojo.SysUser;

// crud + page
public interface SysUserDAO {
	
	public boolean create(SysUser user) throws Exception;
	
	public boolean upadte(SysUser user) throws Exception;
	
	public boolean delete(Long id) throws Exception;
	
	// 查询 - 全取
	public List<SysUser> retrieveAll() throws Exception;
	
	// 查询 - 依据主键取单个
	public SysUser retrieveById(Long id) throws Exception;
	
	// 查询 - 依据参数取值
	public List<SysUser> retrieveByParams(Map<String, Object> params) throws Exception;
	
	// 查询 - 依据参数按页取
	public Page<SysUser> retrieveByPage(int pageNo, int pageSize) throws Exception;

}
