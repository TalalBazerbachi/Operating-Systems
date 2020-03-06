package comp346Ass1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class comp346Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
        
//    	long startTime = System.currentTimeMillis();
    	Network objNetwork = new Network("network");            /* Activate the network */
    	Thread thobj = new Thread(objNetwork);
        thobj.start();
        
        Server objServer = new Server();                        /* Start the server */ 
        Thread serverThread = new Thread(objServer);
        serverThread.start();
       
        Client objClient1 = new Client("sending");              /* Start the sending client */
        Thread sendThread = new Thread(objClient1);
        sendThread.start();
        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        Thread recThread = new Thread(objClient2);
        recThread.start();
        
        
       
    }
}
