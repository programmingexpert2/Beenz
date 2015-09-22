package beenz;

import xml.*;

public class Vacation extends Transaction{
	
	public Vacation(int point){
		super(point);
    }
		
	public void xml(XMLOutput out) {
		out.openElement("Vacation");
		out.addAttribute("Point", getPoint());
		out.closeElement();
	    }

}
