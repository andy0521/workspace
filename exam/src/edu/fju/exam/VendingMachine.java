package edu.fju.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
	boolean power=true;
	
VMLink[] drink = new VMLink[8];
drink[0]=VMLink("a",10);
drink[1]=VMLink("b",15);
drink[2]=VMLink("c",10);
drink[3]=VMLink("d",18);
drink[4]=VMLink("e",10);
drink[5]=VMLink("f",20);
drink[6]=VMLink("g",15);
drink[7]=VMLink("h",18);

	while(power=true){
		int cash = VMLink.cash;
		System.out.println("目前餘額:"+cash);
		Scanner sc1=new Scanner(System.in);
		String input=sc1.nextLine();
	
		
		switch(input){
		case "1":
			cash=cash+1;
			break;
		case "5":
			cash=cash+5;
			break;
		case "10":
			cash=cash+10;
			break;
		case "a":
			drink[0].print();
			break;	
		case "b":
			drink[1].print();
			break;	
		case "c":
			drink[2].print();
			break;	
		case "d":
			drink[3].print();
			break;	
		case "e":
			drink[4].print();
			break;	
		case "f":
			drink[5].print();
			break;	
		case "g":
			drink[6].print();
			break;
		case "h":
			drink[7].print();
			break;	
			}
			
				
		}
	}
	

	private static VMLink VMLink(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
