package beenz;

import xml.*;

public class CD extends Transaction{


	public CD(int point){
		super(point);
    }
	
	public void xml(XMLOutput out) {
		out.openElement("CD");
		out.addAttribute("Point", getPoint());
		out.closeElement();
	    }


}