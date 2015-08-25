/* MapPinGenerator.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Sep 20, 2010 10:47:21 AM , Created by Sam
}}IS_NOTE

Copyright (C) 2009 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.dummy;

import org.zkoss.json.JSONArray;
import org.zkoss.json.JSONObject;

/**
 * @author Sam
 *
 */
public class MapPinGenerator {
	public static String getLongitudesJson () {

		JSONArray ary = new JSONArray();
		
		JSONObject loc = new JSONObject();
		loc.put("Lat", "51.547108");
		loc.put("Long", "-0.055404");
		loc.put("Title", "Title 1");
		loc.put("Dsp", "Description 1");
		
		ary.add(loc);
		
		loc = new JSONObject();
		loc.put("Lat", "51.559108");
		loc.put("Long", "-0.086404");
		loc.put("Title", "Title 2");
		loc.put("Dsp", "Description 2");
		
		ary.add(loc);
		
		return ary.toJSONString();
	}
}
