/**
 * 
 */
package cr.ac.itcr.structures;

/**
 * @author Jonathan Garcia
 *
 */
public class NodeSplayTrees <T extends Comparable<T>> {
  
		NodeSplayTrees<T>  left, right, parent;
	    T element;
	 
	     /** Constructor **/
	     public NodeSplayTrees(){
	         this(null , null, null, null);
	     }          
	     /** Constructor **/
	     public NodeSplayTrees(T ele)
	     {
	         this(ele, null, null, null);
	     } 
	     /** Constructor **/
	     public NodeSplayTrees(T ele,NodeSplayTrees<T>  left, NodeSplayTrees<T>  right, NodeSplayTrees<T>  parent)
	     {
	         this.left = left;
	         this.right = right;
	         this.parent = parent;
	         this.element = ele;         
	     }    
	 
	
}//

