package com.interviews.copart;

public class PersonTypeEnum {
	public static void main(String[] args) {
		PersonType male = PersonType.MALE;
		male.setName("Santhosh");
		System.out.println(male.getDesc());
		System.out.println(male.getName());
	}
}


enum PersonType {
	MALE("The person is male"), FEMALE("The person is female");
	
	private final String desc;
	private String name;
	
	PersonType(String desc){	//only private constructor
		this.desc = desc;
	}
	
	public String getName() {
		return this.name;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}