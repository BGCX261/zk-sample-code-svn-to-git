/* TreeController.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Aug 30, 2010 3:58:29 PM , Created by simon
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package samples.eventqueue.tree;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.EventQueues;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.*;

import samples.model.TreeModelA;

/**
 * See samples/simon/eventqueue/tree/display.zul
 * @author simon
 */
public class TreeDisplayController extends GenericForwardComposer {
	
	private Tree tree;
	private TreeModelA model;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		tree.setTreeitemRenderer(new TreeitemRenderer() {
			@Override
			public void render(Treeitem item, Object data) throws Exception {
				Treerow r = new Treerow();
				Treecell c = new Treecell();
				item.appendChild(r);
				r.appendChild(c);
				c.appendChild(new Label(data instanceof List? "[Node]" : data.toString()));
			}
		});
		
		model = prepareTreeModel();
		tree.setModel(model);
		
		// subscribe
		EventQueues.lookup("TreeDisplay", EventQueues.APPLICATION, true)
				.subscribe(new EventListener() {
			public void onEvent(Event event) throws Exception {
				System.out.println("subscribe");
				if("AddNode".equals(event.getName())) {
					ArrayList parent = getRandomNode((ArrayList) model.getRoot());
					int position = (int) (Math.random() * parent.size());
					Object[] newNodes = {event.getData()};
					model.insert(parent, position, position, newNodes);
				}
			}
		});
	}
	
	private TreeModelA prepareTreeModel(){
		ArrayList mother = new ArrayList();
		
		//Create a branch "child1" and assign children to it
		ArrayList child1 = new ArrayList();
		child1.add("Tommy");
		child1.add("Juile");
		
		//Create a branch "child2" and assign children to it
		ArrayList child2 = new ArrayList();
		child2.add("Gray");
		
		//Create a branch "grandchild" and assign children to it
		ArrayList grandChild = new ArrayList();
		grandChild.add("Paul");
		grandChild.add("Eric");
		
		//Assign branch "grandchild" to be branch "child2"'s child
		child2.add(grandChild);
		
		//Assign branch "grand2" to be branch "child1"'s child
		child1.add(child2);
		
		//Assign children to root "mother"
		mother.add("Andy");
		mother.add("Davis");
		mother.add(child1);
		mother.add("Matter");
		mother.add("Kitty");
		
		return new TreeModelA(mother);
	}
	
	private ArrayList getRandomNode(ArrayList parent){
			if(Math.random() > 0.7) return parent;
			ArrayList nodeCache = new ArrayList();
			
			for(Object obj : parent)
				if(obj instanceof ArrayList) 
					nodeCache.add(obj);
			if(nodeCache.size() == 0) return parent;
			
			return getRandomNode((ArrayList)nodeCache.get(
					(int)(nodeCache.size() * Math.random())));
	}
}
