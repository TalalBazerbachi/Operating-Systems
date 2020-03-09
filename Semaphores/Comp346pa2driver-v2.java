package comp346pa2w2020;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Comp346pa2driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	//Create Network Thread:
    	Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();
        
        //Create Server Threads:
        Server objServer1 = new Server("sThread1");                        /* Start the server */ 
        objServer1.start();
        Server objServer2 = new Server("sThread2");                        /* Start the server */ 
        objServer2.start();
        
        //Create Client Threads:
        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();
        
      /*..............................................................................................................................................................*/
       
    }
    
 }
