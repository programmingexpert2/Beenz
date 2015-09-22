package beenz;

import xml.*;

public abstract class Transaction {

	    private int point;

	    public Transaction(int point) {
		super();
		this.point = point;
	     
	    }

	    public int getPoint() {
		return point;
	    }

	    public void setPoint(int point) {
		this.point = point;
	    }

	    public abstract void xml(XMLOutput out);
}
