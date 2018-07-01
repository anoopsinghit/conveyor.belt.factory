/**
 * 
 */
package com.conveyor.belt.factory.model;

/**
 * @author ANoop kumar singh
 *
 */
public class Bolt {
	
	int bolt=0;
	int boltSize=0;

	public Bolt() {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bolt;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Bolt)) {
			return false;
		}
		Bolt other = (Bolt) obj;
		if (bolt != other.bolt) {
			return false;
		}
		return true;
	}



	public int getBolt() {
		return this.boltSize;
	}

	public void setBolt(int bolt) {
		if(this.boltSize<2){
			this.boltSize=this.boltSize+bolt;
			} else{
				//this.boltSize=0;
				System.out.println("Bolt ia alraedy reday for make the machine");
			}	
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
	
	public void initillizetBolt(int bolt) {
		this.boltSize=0;
	}
	
 public int unuseddBotl(int bolt){
	 
	 int machineBolt=bolt/3;
	 
	return machineBolt;
	 
 }
	
}
