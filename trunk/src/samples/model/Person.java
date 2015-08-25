/* Person.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Aug 26, 2010 8:53:37 AM , Created by simon
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.model;

/**
 * Taken from Peter's small talk, served as a simple data model
 * @author simon
 */
public class Person {
	
	private String _firstName = "";
	private String _lastName = "";
	
	public Person(){}
	
	public Person(String firstName, String lastName) {
		_firstName = firstName;
		_lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}
	
	public String getFirstName() {
		return _firstName;
	}
	
	public void setLastName(String lastName) {
		_lastName = lastName;
	}
	
	public String getLastName() {
		return _lastName;
	}
	
	public void setFullName(String f) {
		// do nothing.
	}
	
	public String getFullName() {
		return _firstName + " " + _lastName;
	}
	
}