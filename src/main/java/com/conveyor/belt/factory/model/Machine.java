/**
 * 
 */
package com.conveyor.belt.factory.model;


/**
 * @author anoop kumar singh
 *
 */
public class Machine {

	
	int machine;
	int machineSize=0;
	/**
	 * @return the machine
	 */
	public int setGoods() {
		return this.machineSize;
	}
	/**
	 * @param machine the machine to set
	 */
	public void getGoods(int machine) {
		this.machine = this.machineSize+machine;
	}
	/**
	 * constructor of teh class
	 */
	public Machine() {

	}
	
	
	public int unuseddMachine(int bolt){
		 
		 int unuseddMachine=bolt/3;
		 
		return unuseddMachine;
		 
	 }
	

}
