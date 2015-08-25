/* Composer2.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Jun 17, 2010 9:09:18 AM , Created by simon
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.eventqueue;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;

/**
 * @author simon
 *
 */
public class Composer2 extends GenericForwardComposer {
	
	private Label label2;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		EventQueues.lookup("myEventQueue", EventQueues.DESKTOP, true)
			.subscribe(new EventListener(){
				
			public void onEvent(Event event) throws Exception {
				String msg = "Hello, "+(String) event.getData()+"!";
				label2.setValue(msg);
			}
		});
	}
}
