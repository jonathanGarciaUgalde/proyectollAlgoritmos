/**
 * 
 */
package cr.ac.itcr.structures;

/**
 * @author Jonathan Garcia
 *
 */
public class NodeSplayTrees <T extends Comparable<T>> {
  
	NodeSplayTrees  left, right, parent;
	     T element;
	 
	     /** Constructor **/
	     public NodeSplayTrees<T> ()
	     {
	         this(null , null, null, null);
	     }          
	     /** Constructor **/
	     public NodeSplayTrees <T> (T ele)
	     {
	         this(ele, null, null, null);
	     } 
	     /** Constructor **/
	     public NodeSplayTrees <T> (T ele,NodeSplayTrees  left, NodeSplayTrees  right, NodeSplayTrees  parent)
	     {
	         this.left = left;
	         this.right = right;
	         this.parent = parent;
	         this.element = ele;         
	     }    
	 
	
}//

