/* Composer1.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Jun 17, 2010 9:03:00 AM , Created by simon
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.eventqueue;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Textbox;

/**
 * @author simon
 *
 */
public class Composer1 extends GenericForwardComposer {
	
	private Textbox textbox1;
	
	public void onChange$textbox1(Event event){
		EventQueues.lookup("myEventQueue", EventQueues.DESKTOP, true)
			.publish(new Event("onChangeNickname", null, textbox1.getValue()));
	}
}
