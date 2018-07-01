package com.conveyor.belt.factory;

import java.io.IOException;
import java.util.HashMap;

import com.conveyor.belt.factory.model.Bolt;
import com.conveyor.belt.factory.model.Machine;
import com.conveyor.belt.factory.model.ProductCreation;

/**
 * @author anoop sngh
 *
 */
public class RunApplication { 
	static int sCount = 1;

	public static void main(String[] args) throws IOException {

		Bolt bolt=new Bolt();
		Machine machine=new Machine();

		try {
			//Check the input suplied  from the aggumrnt for bolt,machin and time (63seconds)  
			
						
			// Check argument list at this  are already processed
			/*if(args.length<=3){
				for (String string : args) {
					System.out.println("argument list is..."+string);
				}*/
				
				System.out.println("Bolt quantity****="+args[0]+"***machine quantity="+args[1]+"*****buit in time="+args[1]);
					
				HashMap<String,Integer> map = new HashMap<String,Integer>();
				
				  map.put("totalNoBolt",Integer.valueOf(args[0])); 
				   map.put("totalNomachne",Integer.valueOf(args[1]));
				   map.put("totalNoseconds",Integer.valueOf(args[2]));
				   
				   ProductCreation pr=new ProductCreation();
				    
				
				int totalNoBolt=Integer.valueOf(args[0]);
				int totalNomachne=Integer.valueOf(args[1]);
				int totalNoseconds=Integer.valueOf(args[2]);				 
				
				
				//per employee bolt  found
				int unusedBolt=bolt.unuseddBotl(totalNoBolt);
				unusedBolt=unusedBolt/2;
				
				//per employee bolt  found
				int machineUnused=machine.unuseddMachine(totalNoBolt);
				 map.put("totalNoBolt",unusedBolt); 
				   map.put("totalNomachne",machineUnused);
				   map.put("totalNoseconds",totalNoseconds);
				   
				if(totalNoBolt==0 || totalNomachne==0){
				 System.out.println("not possible to make any machine with given arg input");
				}else{	
					
					
					ProductDemo R1 = new ProductDemo( "Employee-1",map,pr);
				      R1.start();
				      
				     /* RunnableDemo R2 = new RunnableDemo( "Employee-2",map,pr);
				      R2.start();
				      RunnableDemo R3 = new RunnableDemo( "Employee-3",map,pr);
				      R3.start();
					*/
				     
				      
		
				  
				    	 System.out.println("RunApplication.main()*******"+pr.getCreatedNoOfProduct()+"***********88888888+++*****"+pr.getTotatlConsumeTime()); 
				
				      
				      
				      
					//System.out.println("RunApplication.main()"+);
					
				}  
				
	
				
				
				
		        
		      
				//Bolt bolt=new Bolt();
				
				
				
				
				/*int[] marks = { 1, 1,1};
		        // for each loop
		        for (int num : marks) 
		        {
				bolt.setBolt(1);
		        }
				System.out.println("bolt size"+bolt.getBolt());
				
			} else {
				System.out.println("Input is not supplied in a proper manner in arg list");
			}*/
			/* 
			if (!isFileExists(path + File.separator + Constants.PROCESSED_FLAG)) {
				// jenkins job will pass follwoing CMD arg if its data needs to
				// be considered for Analytics
				boolean publishData = (args.length > 0) && args[args.length - 1].equalsIgnoreCase("ANALYTICS");

				Map<String, String> configMap = readCmdArguments(args);

				if (isFileExists(path + File.separator + Constants.OUTPUT_XML)) {
					// ROBOT Regression
					new RobotRegressionService().processRobotRegressionResults(publishData, configMap);
				} else {
					// TTCN Regression
					new TTCNRegressionService().processTTCNRegressionResults(path, publishData, configMap);
				}
				if (publishData) {
					createProcessedFile(path);
				}
			} else {
				System.out.println("Results are already processed");
			}*/
		} catch (Exception e) {
			
			System.out.println("Error while creating processing the factory output:\n\n" + e);
		}

	}

	

	/**
	 * Debug Code: Print content of XML file
	 * 
	 * @param suite
	 * @param tab
	 */
	
}
