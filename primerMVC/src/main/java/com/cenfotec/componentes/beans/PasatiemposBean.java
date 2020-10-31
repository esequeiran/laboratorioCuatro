package com.cenfotec.componentes.beans;

import java.util.ArrayList;

public class PasatiemposBean {

	private ArrayList<String> list;
	private String stringList;
	
	public PasatiemposBean() {
		this.list = new ArrayList<String>(); 
		this.stringList = "";
	}
	
	public void addToList(String pasatiempo) {
		this.list.add(pasatiempo);
	}
	
	public ArrayList<String> getList(){
		return this.list;
	}
	
	public void setStringList(){
		String res = "";				
		for(String pasatiempo : this.list) {
			res += pasatiempo +", ";			
		}		
		this.stringList = res;		
	}
	
	public String getStringList() {
		
		return this.stringList;
	}
	
}
