package data;

import java.util.*;

public class Power {
	String Name;
	String Warframe;
	int Number; //Order of the unlocked powers
	String PowerType;
	String Description;
	ArrayList<String> Tags=new ArrayList<String>(); //Tags for fast classification 
	
	String Augment;
	String AugmentDescription;
	ArrayList<String> AugmentTags=new ArrayList<String>();
	
	public Power(String Name, String Warframe, int Number, String Type, String Description) {
		this.Name=Name;
		this.PowerType=Type;
		this.Warframe=Warframe;
		this.Number=Number;
		this.Description=Description;
	}
	
	void AddAugment(String Name, String Description){
		this.Augment=Name;
		this.AugmentDescription=Description;
	}
	
	void PrintPower(){ //Power Number, Power Name, Power Cast Type
		System.out.print("("+this.Number+") "+this.Name+" ["+this.PowerType+"]");
		System.out.println(" "+this.Tags);
		System.out.println(this.Description);
	}
	
	void PrintAugment(){
		System.out.println("   "+this.Augment+" "+this.AugmentTags);
		System.out.println("   "+this.AugmentDescription);
	}
	
	void PowerAddTags(String Tag){  //add more if necessary
		this.Tags.add(Tag);
	}
	void PowerAddTags(String T1, String T2){
		this.Tags.add(T1);
		this.Tags.add(T2);
	}
	void PowerAddTags(String T1, String T2, String T3){
		this.Tags.add(T1);
		this.Tags.add(T2);
		this.Tags.add(T3);
	}
	void PowerAddTags(String T1, String T2, String T3, String T4){
		this.Tags.add(T1);
		this.Tags.add(T2);
		this.Tags.add(T3);
		this.Tags.add(T4);
	}

	void PowerAddTags(String T1, String T2, String T3, String T4, String T5){
		this.Tags.add(T1);
		this.Tags.add(T2);
		this.Tags.add(T3);
		this.Tags.add(T4);
		this.Tags.add(T5);
	}
	
	void PowerAddTags(String T1, String T2, String T3, String T4, String T5, String T6){
		this.Tags.add(T1);
		this.Tags.add(T2);
		this.Tags.add(T3);
		this.Tags.add(T4);
		this.Tags.add(T5);
		this.Tags.add(T6);
	}
	
	void AugmentAddTags(String Tag){  //add more if necessary
		this.AugmentTags.add(Tag);
	}
	void AugmentAddTags(String T1, String T2){
		this.AugmentTags.add(T1);
		this.AugmentTags.add(T2);
	}
	void AugmentAddTags(String T1, String T2, String T3){
		this.AugmentTags.add(T1);
		this.AugmentTags.add(T2);
		this.AugmentTags.add(T3);
	}
	void AugmentAddTags(String T1, String T2, String T3, String T4){
		this.AugmentTags.add(T1);
		this.AugmentTags.add(T2);
		this.AugmentTags.add(T3);
		this.AugmentTags.add(T4);
	}
	
	void AugmentAddTags(String T1, String T2, String T3, String T4, String T5){
		this.AugmentTags.add(T1);
		this.AugmentTags.add(T2);
		this.AugmentTags.add(T3);
		this.AugmentTags.add(T4);
		this.AugmentTags.add(T5);
	}
}
