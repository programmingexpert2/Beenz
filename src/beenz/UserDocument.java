package beenz;

import xml.*;

	public interface UserDocument {
        
        public int RegisterUser(String name, int UserID);
        
        public int RegisterBeenzUser(int UserID, int BeenzID);
				
	
	public void xml(XMLOutput out);

}
