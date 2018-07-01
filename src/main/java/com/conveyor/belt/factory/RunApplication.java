package com.conveyor.belt.factory;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.conveyor.belt.factory.model.Bolt;
import com.conveyor.belt.factory.model.Constants;
import com.conveyor.belt.factory.model.Machine;
import com.conveyor.belt.factory.model.ProductCreation;

/**
 * @author anoop singh
 *
 */
public class RunApplication { 
	

	public static void main(String[] args) throws IOException {
		
		Bolt bolt=new Bolt();
		Machine machine=new Machine();

		try {
			// Check argument list at this  are already processed
			if(args.length<=3){
				for (String string : args) {
					System.out.println("argument list suplied from CLI .."+string);
			
				}
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
				    	 
				}
			}else{
			
			}
	
		} catch (Exception e) {
			PrintWriter writer = new PrintWriter(Constants.ERROR_LOG, "UTF-8");
			e.printStackTrace(writer);
			writer.close();
			System.out.println("Error while creating processing the factory output error can be sseens in error_result.log:\n\n" + e);
		}

	}
	

	
	
}
