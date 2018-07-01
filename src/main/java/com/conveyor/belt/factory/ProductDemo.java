package com.conveyor.belt.factory;

import java.util.HashMap;

import com.conveyor.belt.factory.model.ProductCreation;

class ProductDemo implements Runnable {
	
	public int createdNoOfProduct=0;	
	public int totatlConsumeTime=0;
	ProductCreation productgot;
	   private Thread t;
	   private String threadName;
	   private HashMap<String,Integer> hashmap;
	   
	   ProductDemo( String name,HashMap<String,Integer> hashmap,ProductCreation product) {
	      threadName = name;
	      this.hashmap=hashmap;
	      this.productgot=product;
	      
	   }
	   
	   public void run() {	     
	      try {	    	  
	   
	        
	    	  for(int i = 0; i <hashmap.get("totalNoBolt") ; i++) {	        
	          
	            this.productgot.productCreation(hashmap.get("totalNoBolt"), hashmap.get("totalNomachne"), hashmap.get("totalNoseconds"));
	            Thread.sleep(hashmap.get("totalNoseconds"));
	         }
	      
	        
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      
	      System.out.println("Thread " +  threadName + " exiting.");
	     
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	