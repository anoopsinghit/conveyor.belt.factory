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
	 * 
	 */
	public Machine() {
		// TODO Auto-generated constructor stub
	}
	public void initillizetMachinet(int bolt) {
		this.machineSize=0;
	}
	
	public int unuseddMachine(int bolt){
		 
		 int unuseddMachine=bolt/3;
		 
		return unuseddMachine;
		 
	 }
	

}
