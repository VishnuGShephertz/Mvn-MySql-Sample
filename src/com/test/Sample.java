/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vishnu
 *
 */
public class Sample {
	 private List<Integer> integers = null;

	public Sample() {
		this.integers = new ArrayList<Integer>();
	}
	public void addInteger(int value){
		integers.add(value);
	}
	
	public int getSize(){
		return integers.size();
	}
	
	public int getLastValue(){
		return integers.get(integers.size()-1);
	}
}
