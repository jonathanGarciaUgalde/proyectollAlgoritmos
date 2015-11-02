	
package cr.ac.itcr.motorDataBase.Logica;
import java.util.*;
	

	// Symbol table matching keys (of type K) with values (of type V).
	public interface ST<K, V> {
	    V get(K key); // Get the value associated with the given key.
	    void put(K key, V value); // Set the value associated with the given key. The key can be in the dictionary already or not.
	    void delete(K key); // Remove the value associated with the given key (this should decrement the size).
	    Set<K> getAll(); // Get all the keys in this symbol table.
	    int size(); // Get the number of elements currently in the symbol table.
	    boolean checkSize(); // For development only. Checks that the stored size and actual size match.
	}


