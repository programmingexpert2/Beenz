package beenz;

import xml.*;

public class Book extends Transaction{
	
	public Book(int point){
		super(point);
    }
	
	
	public void xml(XMLOutput out) {
		out.openElement("Book");
		out.addAttribute("Point", getPoint());
		out.closeElement();
	    }

}