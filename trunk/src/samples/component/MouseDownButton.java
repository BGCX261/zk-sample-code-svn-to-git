/* MouseDownButton.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Aug 31, 2010 8:24:50 PM , Created by simon
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.component;

import org.zkoss.zul.Button;

/**
 * @author simon
 *
 */
public class MouseDownButton extends Button {
	
	static {
		addClientEvent(MouseDownButton.class, "onMyEvent", 0);
	}
	
}
