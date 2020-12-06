package Basis;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {

	ArrayList<Integer> myAL;
	
	public ArrayListExercise()
	{
		myAL = new ArrayList<Integer>();
	}
	
	public void addInt(int value) {
		myAL.add(value);
	}
	
	public void clearList() {
		myAL.clear();
	}
	
	public void removeInt(int value) {
		
		int index = myAL.indexOf(value);
		
		if(index != -1) {
			myAL.remove(index);
		}
		else{
			System.out.println("The value " + value + " was not present.");
		}
	}
	
	public void sortList() {
		Collections.sort(myAL);
	}
	
	public void inverseList() {
		Collections.reverse(myAL);
	}
	public void printList() {
		for(int i : myAL) {
			System.out.println(i);
		}
		System.out.println("------------------------------");
	}
	
}
