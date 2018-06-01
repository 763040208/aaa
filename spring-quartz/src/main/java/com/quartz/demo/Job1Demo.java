package com.quartz.demo;

public enum Job1Demo {
	AC("0", "不规范"),
	BC("1", "规范");
	
	private String code = "";
	private String desc = "";
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private Job1Demo(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
}
