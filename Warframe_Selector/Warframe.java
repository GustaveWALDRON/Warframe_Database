package data;

import java.util.*;

public class Warframe {
	String Name;
	String PassiveName;
	String PassiveDescription;
	ArrayList<String> Tags=new ArrayList<String>();
	Power p1; //tab possible or not ?
	Power p2;
	Power p3;
	Power p4;
	
	public Warframe(String Name, Power p1, Power p2, Power p3, Power p4,
					String PassiveName, String PassiveDescription){
		this.Name=Name;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.PassiveName=PassiveName;
		this.PassiveDescription=PassiveDescription;
	}
	
	void AddPassiveTags(String Passive){ //add more if necessary
		this.Tags.add(Passive);
	}
	
	void AddPassiveTags(String P1, String P2){
		this.Tags.add(P1);
		this.Tags.add(P2);
	}
	
	void AddPassiveTags(String P1, String P2, String P3){
		this.Tags.add(P1);
		this.Tags.add(P2);
		this.Tags.add(P3);
	}
	
	void PrintWarframe(){ //simple, without augment
		System.out.println("    =="+this.Name+"==");
		System.out.print(this.PassiveName);
		System.out.println(" "+Tags);
		System.out.println(this.PassiveDescription);
		this.p1.PrintPower();
		this.p2.PrintPower();
		this.p3.PrintPower();
		this.p4.PrintPower();
		System.out.println();
	}
	
	void PrintWarframeWithAugment(){
		System.out.println("    =="+this.Name+"==");
		System.out.print(this.PassiveName);
		System.out.println(" "+Tags);
		System.out.println(this.PassiveDescription);
		this.p1.PrintPower();
		if (this.p1.Augment!=null){
			this.p1.PrintAugment();
		}
		this.p2.PrintPower();
		if (this.p2.Augment!=null){
			this.p2.PrintAugment();
		}
		this.p3.PrintPower();
		if (this.p3.Augment!=null){
			this.p3.PrintAugment();
		}
		this.p4.PrintPower();
		if (this.p4.Augment!=null){
			this.p4.PrintAugment();
		}
		System.out.println();
	}
	
	void PrintPassive(){
		System.out.print(this.PassiveName);
		System.out.println(" "+Tags);
		System.out.println(this.PassiveDescription);
	}
}
