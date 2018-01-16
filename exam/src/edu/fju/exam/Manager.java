package edu.fju.exam;

public class Manager extends Employee {
	public Manager (String name,int amount) {
	super(name, amount);
		
	}
@Override
public void print(){
	int m = amount+5000;
	System.out.println(name+"\t"+amount+"\t");
	
}
}
