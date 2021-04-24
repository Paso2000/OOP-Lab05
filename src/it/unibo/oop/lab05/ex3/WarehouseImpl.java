package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse{
	
	private final Set<Product> set = new HashSet<>();
	
	
	
	
	public void addProduct(Product p) {
		set.add(p);
		
	}
	public Set<String> allNames(){
		final Set <String> newset = new HashSet <>();
		 for ( final Product p: set) {
		 newset.add (p.getName ());
		 }
		 return newset ;
		 }
	
	public Set<Product> allProducts(){
		final Set <Product> allProducts = new TreeSet <>();
		 for ( final Product p:set ) {
		 allProducts.add(p);
		 }
		 return allProducts;
		 }
	
	public boolean containsProduct(Product p) {
		for(Product g : set) {
			if(g.equals(p)) {
				return true;
			}
		}
		return false;
	}
	public double getQuantity(String name) {
		for (final Product g : set) {
			if(g.getName().equals(name)) {
				return g.getQuantity();
			}
				
		}
		return -1;
	}
	
	
}