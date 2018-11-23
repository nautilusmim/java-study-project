package org.nautilusmim.hibernate.pojo;

import java.io.Serializable;

public class SysUser implements Serializable {

	private static final long serialVersionUID = -6141302157947296472L;
	
	private Long id;
	
	private String name;
	
	private String password;
	
	private Short type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

}
