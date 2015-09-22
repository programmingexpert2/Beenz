import beenz.BeenzApplication;
import xml.XMLOutput;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XMLOutput xml = new XMLOutput();
		
		BeenzApplication BeenzApplication = new BeenzApplication();
		
		// Showing the empty System...
		
		BeenzApplication.xml(xml);
		System.out.println("Empty System...\n" + xml);
		
		// Register some customers...
        BeenzApplication.RegisterUser("Beccy Wilkinson", 123);
        BeenzApplication.RegisterUser("Asizis Walton", 456);
        BeenzApplication.RegisterUser("Robetson Williams", 789);

		// Show the registered users...

		BeenzApplication.xml(xml);
		System.out.println("\nSome users have registered...\n" + xml);
		
		// Register Beenz with user ID...
        BeenzApplication.RegisterBeenzUser(123,101);
        BeenzApplication.RegisterBeenzUser(456,102);
        BeenzApplication.RegisterBeenzUser(789,103);
        
        BeenzApplication.xml(xml);
        System.out.println("\n\nSome users have registered...\n" + xml);
		
		/*// Create some documents and get their ids...

		String d1 = BeenzApplication.DocCreate("d101", "Project Mayhem", "it has ben long time...");
		String d2 = BeenzApplication.DocCreate("d102", "Software Risk", "Risk refres to...");
		String d3 = BeenzApplication.DocCreate("d103", "Softare Model", "We have not included any...");
		*/
        
        //Points are collected via the Beenz ID ..
        beenz.BeenzApplication.openDocument(101, 50);
        beenz.BeenzApplication.openDocument(102, 30);
        beenz.BeenzApplication.openDocument(103, 20);
        // Show the collection of points...
        BeenzApplication.xml(xml);
        System.out.println("\n\nUsers has collected points...\n" + xml);

		// Show just the documents...

		//BeenzApplication.xml(xml);
		//System.out.println("\n\nSome documnets created...\n" + xml);
        
        //Points are redeemed via the Beenz ID ..
        beenz.BeenzApplication.claimCD(101, 10);
        beenz.BeenzApplication.claimVacation(101, 30);
        beenz.BeenzApplication.claimBook(102, 20);
        beenz.BeenzApplication.claimVacation(103, 40);
        //Show the redemption of points...
        
        BeenzApplication.xml(xml);
        System.out.println("\n\nUsers has used the Transaction...\n" + xml);

	}
	

}
