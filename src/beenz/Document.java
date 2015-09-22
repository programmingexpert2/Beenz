package beenz;

import xml.*;

public class Document extends CollectPoint{
	
			
		public Document(int points) {
			super(points);
		}

		public void xml(XMLOutput out) {
			out.openElement("Document");
			out.addAttribute("Point", getpoint());
			out.closeElement();
		}
}