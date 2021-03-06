package com.bit.day09.model.entity;

import java.util.Date;

public class Day09Vo {
	private int num;
	private String name;
	private Date nalja;
	
	public Day09Vo() {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "Day09Vo [num=" + num + ", name=" + name + "]";
	}

	public Day09Vo(int num, String name, Date nalja) { //using field : 전부선택
		super();
		this.num = num;
		this.name = name;
		this.nalja = nalja;
	}

	@Override
	public int hashCode() { //hashCode 같을 수 없는 nalja는 제외하고 선택
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Day09Vo other = (Day09Vo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
}
