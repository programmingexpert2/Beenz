package beenz;

import xml.XMLOutput;

public abstract class CollectPoint {
    private int point ;

    public CollectPoint(int point) {
	super();
        this.point = point;
   }

    public int getpoint() {
	return point;
    }

    public void setpoint(int point) {
	this.point = point;
    }

    public abstract void xml(XMLOutput out);

}