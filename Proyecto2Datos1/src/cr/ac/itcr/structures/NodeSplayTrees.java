/**
 * 
 */
package cr.ac.itcr.structures;

/**
 * @author Jonathan Garcia
 *
 */
public class NodeSplayTrees  {
  
	NodeSplayTrees  left, right, parent;
	     int element;
	 
	     /** Constructor **/
	     public NodeSplayTrees ()
	     {
	         this(0, null, null, null);
	     }          
	     /** Constructor **/
	     public NodeSplayTrees (int ele)
	     {
	         this(ele, null, null, null);
	     } 
	     /** Constructor **/
	     public NodeSplayTrees (int ele,NodeSplayTrees  left, NodeSplayTrees  right, NodeSplayTrees  parent)
	     {
	         this.left = left;
	         this.right = right;
	         this.parent = parent;
	         this.element = ele;         
	     }    
	 
	
}//

