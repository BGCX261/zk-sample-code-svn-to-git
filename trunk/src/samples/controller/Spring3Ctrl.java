/* Spring3Ctrl.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Sep 21, 2010 2:02:53 PM , Created by Sam
}}IS_NOTE

Copyright (C) 2009 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package samples.controller;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;

import samples.model.SpringDataSource;

/**
 * @author Sam
 *
 */
public class Spring3Ctrl extends GenericForwardComposer {

	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		SpringDataSource dataSource = (SpringDataSource)org.zkoss.zkplus.spring.SpringUtil.getBean("SpringDataSource");
		System.out.println("Spring3Ctrl");
	}
}
