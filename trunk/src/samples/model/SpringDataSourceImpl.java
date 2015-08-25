/* SpringDataSourceImpl.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Sep 21, 2010 12:45:05 PM , Created by Sam
}}IS_NOTE

Copyright (C) 2009 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 3.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package samples.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam
 *
 */
public class SpringDataSourceImpl implements SpringDataSource {

	@Override
	public List getElementsList() {
		List list = new ArrayList();
        list.add("Tom");
        list.add("Henri");
        list.add("Jim");

        return list;
	}
}