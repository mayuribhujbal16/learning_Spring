package com.model;

import java.util.Iterator;
import java.util.List;



public class Question {
	private int id;
	private String qname;
	private List<String> answer;

	/*
	 // by using constructor injection
	 ///
	public Question() {

	}

	public Question(int id, String qname, List<String> answer) {
		super();
		this.id = id;
		this.qname = qname;
		this.answer = answer;
	}
*/
	//by using setter injection 
	
	//this part only used in setter injection (getter setter method)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<String> getAnswer() {
		return answer;
	}

	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	//this part also used in constructor injection
	public void display()
	{
		System.out.println(id +" Question: "+qname);
		System.out.println("Answer are: ");
		
		
		Iterator<String> itr = answer.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	

}
