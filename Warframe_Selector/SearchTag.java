package data;

import java.util.ArrayList;

//The searching functions are here
//perhaps it can be merged with class Warframe

public class SearchTag {
	ArrayList<Warframe> WarfTab=new ArrayList<Warframe>();
	String Tag;
	
	public SearchTag(String Tag){
		this.Tag=Tag;
	}
	
	void AddWarframe(Warframe Warframe){ //repeat as much as needed, perhaps unneeded
		this.WarfTab.add(Warframe);
	}

	boolean TagTest(ArrayList<String> TagList, String Tag){//tests if the selected Tag is within the Array list
		return TagList.contains(Tag);
	}
	
	void TagSearchAndTrimingWarframeList(String Tag){
		for (int i=0; i<WarfTab.size(); i++) {
			//WarfTab.get(i);
		}
	}
	
	void TagSearchAndTrimingWarframeAndPrint(Warframe W, String Tag){
		System.out.println("    =="+W.Name+"==");
		if(TagTest(W.Tags,Tag)){
			W.PrintPassive();
		}
		if(TagTest(W.p1.Tags,Tag)){
			W.p1.PrintPower();
		}
		if(TagTest(W.p2.Tags,Tag)){
			W.p2.PrintPower();
		}
		if(TagTest(W.p3.Tags,Tag)){
			W.p3.PrintPower();
		}
		if(TagTest(W.p4.Tags,Tag)){
			W.p4.PrintPower();
		}
		System.out.println();
		System.out.println();
	}
	
	void TagSearchAndTrimingWarframeWithAugmentsAndPrint(Warframe W, String Tag){
		System.out.println("    =="+W.Name+"==");
		if(TagTest(W.Tags,Tag)){
			W.PrintPassive();
		}
		
		if(TagTest(W.p1.AugmentTags,Tag)){
			W.p1.PrintPower();
			W.p1.PrintAugment();
		}else if(TagTest(W.p1.Tags,Tag)){
			W.p1.PrintPower();
		}
		
		if(TagTest(W.p2.AugmentTags,Tag)){
			W.p2.PrintPower();
			W.p2.PrintAugment();
		}else if(TagTest(W.p2.Tags,Tag)){
			W.p2.PrintPower();
		}
		
		if(TagTest(W.p3.AugmentTags,Tag)){
			W.p3.PrintPower();
			W.p3.PrintAugment();
		}else if(TagTest(W.p3.Tags,Tag)){
			W.p3.PrintPower();
		}
		
		
		if(TagTest(W.p4.AugmentTags,Tag)){
			W.p4.PrintPower();
			W.p4.PrintAugment();
		}else if(TagTest(W.p4.Tags,Tag)){
			W.p4.PrintPower();
		}
		System.out.println();
		System.out.println();
	}
	
	void PrintResult(){
		System.out.println("Search results for "+Tag);
		System.out.println();
		for (int i=0; i<WarfTab.size(); i++) {
			TagSearchAndTrimingWarframeAndPrint(WarfTab.get(i),Tag);
		}
	}
	
	void PrintResultWithAugments(){
		System.out.println("Search results with Augments for "+Tag);
		System.out.println();
		for (int i=0; i<WarfTab.size(); i++) {
			TagSearchAndTrimingWarframeWithAugmentsAndPrint(WarfTab.get(i),Tag);
		}
	}
}
