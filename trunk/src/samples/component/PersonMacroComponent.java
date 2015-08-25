/* PersonMacroComponent.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Sep 24, 2010 12:13:49 PM , Created by Sam
}}IS_NOTE

Copyright (C) 2009 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package samples.component;

import org.zkoss.zk.ui.HtmlMacroComponent;
import org.zkoss.zul.Textbox;

/**
 * @author Sam
 *
 */
public class PersonMacroComponent extends HtmlMacroComponent  {
	
	public void setFirstName(String firstName) {
		setDynamicProperty("firstName", firstName);
		final Textbox tb = (Textbox)getFellow("mc_firstName");
		tb.setValue(firstName);
	}
}
