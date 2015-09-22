package beenz;

import java.util.Vector;
import xml.*;


public class Beenz {
		  
	    private int BeenzID;
	    public Beenz(int UserID, int BeenzID) {
		super();
		this.BeenzID = BeenzID;
	    }

	    public int getBeenzID() {
		return BeenzID;
	    }

	    public void setBeenzID(int BeenzID) {
		this.BeenzID = BeenzID;
	    }
	    
	    public int getUserID() {
		return UserID();
	    }

		private int UserID() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setUserID(int UserID) {
	    }


	    private Vector<CollectPoint> point = new Vector<CollectPoint>();
	    private int collect() {

		// Calculate points collection
		int collectPoint = 0;
		for (CollectPoint item : point)
		    collectPoint = collectPoint + item.getpoint();
		return collectPoint;
	    }

	    public void Document(int points) {
		point.add(new Document(points));
	    }

	    public void ContributeInfo(int points) {
		point.add(new ContributeInfo(points));
	    }

	    public Vector<CollectPoint> getPoint() {
		return point;
	    }
	    
	    private Vector<Transaction> rpoint = new Vector<Transaction>();
	    private int redeem(){
	        // Calculate redeem of points
	        int redeemPoint = 0;
		for (Transaction item : rpoint)
		    redeemPoint = redeemPoint + item.getPoint();
		return redeemPoint;
	    }

	    public void CD(int point) {
		rpoint.add(new CD(point));
	    }

	    public void Vacation(int point) {
		rpoint.add(new Vacation(point));
	    }

	    public void Book(int point) {
		rpoint.add(new Book(point));
	    }

	    public Vector<Transaction> getpoint() {
		return rpoint;
	    }
	 


	    public int remainPoint() {
		// The total remaining points
	        return collect() - redeem();
	    }

	    public void setPoint(Vector<CollectPoint> point) {
		this.point = point;
	    }
	       
	    public void setpoint(Vector<Transaction> point) {
		this.rpoint = point;
	    }
	      



	    public void xml(XMLOutput out) {
		out.openElement("Beenz");
		out.addAttribute("Beenz ID", getBeenzID());
	        out.addAttribute("User ID", getUserID());
	        for (CollectPoint points : point)
		    points.xml(out);
	        out.addAttribute("Total Collecting Points", collect()+"");
	        for (Transaction points : rpoint)
		    points.xml(out);
	        out.addAttribute("Total Redeeming Points", redeem()+"");
	        
	        out.addAttribute("Remaining points", remainPoint() + "");
		out.closeElement();
	    }

}
