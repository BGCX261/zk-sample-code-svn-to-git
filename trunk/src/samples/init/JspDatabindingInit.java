/* DatabindingInit.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Jul 15, 2010 9:43:46 AM , Created by Sam
}}IS_NOTE

Copyright (C) 2009 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package samples.init;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.Initiator;

/**
 * @author Sam
 *
 */
public class JspDatabindingInit implements Initiator{


	public void doAfterCompose(Page page) throws Exception {
		Object a = page.getAttribute("current_date");
		System.out.println("MyInit::doAfterCompose(): current_date= "+a);
	}


	public boolean doCatch(Throwable ex) {
		// TODO Auto-generated method stub
		return false;

	}


	public void doFinally() {
		// TODO Auto-generated method stub

	}
	private SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

	
	public void doInit(Page page, Map args) throws Exception {
		ArrayList list = new ArrayList();
		page.getAttribute("current_date");
		for(int i=0;i<10;i++)
		{
			final String ref = "index: "+i;
			list.add(new MyValue(){
				public String getDate() {
					return form.format(new Date());
				}
				public String getValue() {
					return ref;
				}
			});
		}
		page.setAttribute("my_list", list);
	}

	public interface MyValue {
		String getValue();
		String getDate();
	}
}
