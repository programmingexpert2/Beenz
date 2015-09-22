package beenz;

import xml.*;

public class User {

    private String name;
    private Integer UserID;

    public User(String name, Integer UserID) {
	super();
	this.name = name;
	this.UserID = UserID;
    }

    public Integer getUserID() {
	return UserID;
    }

    public String getName() {
	return name;
    }

    public void setuserID(Integer UserID) {
	this.UserID = UserID;
    }

    public void setName(String name) {
	this.name = name;
    }


    public void xml(XMLOutput out) {
	out.openElement("User");
	out.addAttribute("ID", getUserID());
	out.addAttribute("Name", getName());
	out.closeElement();
    }

}

