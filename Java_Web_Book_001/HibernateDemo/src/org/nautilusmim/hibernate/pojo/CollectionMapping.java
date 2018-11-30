package org.nautilusmim.hibernate.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class CollectionMapping implements Serializable {

	private static final long serialVersionUID = -2145501251786058538L;
	
	private Long id;
	
	private Long name;
	
	private List lists;
	
	private Set sets;
	
	private Map maps;
	
	private String[] arrays;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	public Set getSets() {
		return sets;
	}

	public void setSets(Set sets) {
		this.sets = sets;
	}

	public Map getMaps() {
		return maps;
	}

	public void setMaps(Map maps) {
		this.maps = maps;
	}

	public String[] getArrays() {
		return arrays;
	}

	public void setArrays(String[] arrays) {
		this.arrays = arrays;
	}

	@Override
	public String toString() {
		return "CollectionMapping [id=" + id + ", name=" + name + ", lists="
				+ lists + ", sets=" + sets + ", maps=" + maps + ", arrays="
				+ Arrays.toString(arrays) + "]";
	}

}
