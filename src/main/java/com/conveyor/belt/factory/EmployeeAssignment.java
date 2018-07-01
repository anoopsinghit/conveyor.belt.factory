package com.conveyor.belt.factory;

import com.conveyor.belt.factory.model.ProductCreation;



	

public class EmployeeAssignment implements Runnable {
  
    private int bolt;
    private int machine;
    private int seconds;
    ProductCreation pr=new ProductCreation();
    
    
    public EmployeeAssignment(int bolt,int machine,int seconds){
        this.bolt=bolt;
        this.machine=machine;
        this.seconds=seconds;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+bolt);
        
        processCommand();
       
        
        System.out.println("product number"+pr.createdNoOfProduct+"====time cinsyume"+pr.totatlConsumeTime);
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
        	       	
        	
        	pr.productCreation(bolt, machine, seconds);
        	
        	long timeUsed=seconds*1000;
        	Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return "";
    }
}

