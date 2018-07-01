/**
 * 
 */
package com.conveyor.belt.factory.model;

/**
 * @author ANoop kumar singh
 *
 */
public class Bolt {
	

	int boltSize=0;

	/**
	 * constructor
	 */
	public Bolt() {
		
	}

	
	public int getBolt() {
		return this.boltSize;
	}

	
	
	/**
	 * @return check the bolt size
	 */
	public  boolean checkBoldSize(){
	if(this.boltSize==2){
		return true;
		}		
		return false;
		
	}
	
	
	
 public int unuseddBotl(int bolt){
	 
	 int machineBolt=bolt/3;
	 
	return machineBolt;
	 
 }
	
}
