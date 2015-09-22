package beenz;

import java.util.*;
import xml.XMLOutput;

public class BeenzApplication implements UserDocument{

	private static Vector<User> users = new Vector<User>();
	
	private static Vector<Document> documents = new Vector<Document>();
	
	private static Vector<Beenz> beenzs = new Vector<Beenz>();
	
	//private Vector<Transaction> TransactionHistory = new Vector<Transaction>();
	
	//private Vector<Document> getDocHistory = new Vector<Document>();
	
	/*public User getUser(String ID) {
		for (User user : User)
		    if (user.getID() == ID)
			return user;
		throw new Error("Cannot find customer: " + ID);
	    }*/
	
	/*public Document getDocument(String ID){
		for (Document document: documents)
			if (Document.getID() == ID)
				return document;
		throw new Error("Cannot find document: " + ID);
	}*/
	
	public void setBeenz(Vector<Beenz> beenzs) {
		BeenzApplication.beenzs = beenzs;
	    }
	
	public static Beenz getBeenz(int BeenzID) {
		for (Beenz beenz : beenzs)
		if (beenz.getBeenzID() == BeenzID)
	           return beenz;
	        throw new Error("Cannot find beenz: " + BeenzID);
	    }
	
	public static void openDocument(int BeenzID, int points) {
        Beenz b = getBeenz(BeenzID);
	b.Document(points);
        }
	
    public static void contributeInfo(int BeenzId, int points) {
        Beenz b = getBeenz(BeenzId);
	b.ContributeInfo(points);
        }
    
    public static void claimCD(int BeenzId, int point) {
        Beenz b = getBeenz(BeenzId);
	b.CD(point);
        }
    public static void claimBook(int BeenzId, int point) {
        Beenz b = getBeenz(BeenzId);
	b.Book(point);
        }
    public static void claimVacation(int BeenzId, int point) {
        Beenz b = getBeenz(BeenzId);
	b.Vacation(point);
        }
	
    public int RegisterUser(String name,int UserID) {
        User user = new User(name, UserID);
        users.addElement(user);
        return user.getUserID();
    	}
    
    public int RegisterBeenzUser(int UserID, int BeenzID) {
            Beenz beenz = new Beenz(UserID, BeenzID);
            beenzs.addElement(beenz);
    	return beenz.getBeenzID();
        }
	
	/*public static String DocCreate(String ID, String title, String description) {
		Document document = new Document (ID, title, description);
		Document.addElement(document);
		return Document.getID();
	    }
	*/
	
	public void xml(XMLOutput out) {
		out.openElement("System");
		
		for (User user : users)
		    user.xml(out);
		
		for (Beenz beenz : beenzs)
		    beenz.xml(out);
		
//		out.openElement("System");
		
		for (Document documnet : documents)
		    documnet.xml(out);
		
		out.closeElement();
	 }


}
