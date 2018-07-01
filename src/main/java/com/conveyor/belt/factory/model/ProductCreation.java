package com.conveyor.belt.factory.model;

/**
 * @author Anoop kumar singh
 *
 */
public class ProductCreation {
	
	public int createdNoOfProduct=0;
	
	public int totatlConsumeTime=0;
	

	public ProductCreation() {
		
	}
	
	
	/**
	 * 
	 * This method is used for creatingf the final product
	 * @param bolt
	 * @param machine
	 * @param seconds
	 * @return 
	 */
	public  int productCreation(int bolt,int machine,int seconds){
		
		if(bolt!=0 && machine!=0 ){
			try {
				
			createdNoOfProduct=createdNoOfProduct+1;
			totatlConsumeTime=totatlConsumeTime+seconds;			
			System.out.println("Creation of the  is product=="+createdNoOfProduct+"** totatla consume tiem for 3 employees**"+totatlConsumeTime);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Invalid prodcut received of bolt "+bolt+" *** no of machine"+machine);
		}
		return seconds;
		
		
		
	}
	
	public int getCreatedNoOfProduct() {
		return this.createdNoOfProduct;
	}


	public int getTotatlConsumeTime() {
		return this.totatlConsumeTime;
	}


	
}
