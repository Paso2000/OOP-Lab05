package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl implements Warehouse  {

	
	
	Set<Product> allProduct(){
		return new TreeSet <>(super.allProducts());
		 
		 
		 
	}

}
