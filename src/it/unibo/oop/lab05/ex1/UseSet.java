package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	
    	final Set<String> set = new TreeSet<>();
    	
    	for( int i=1;i<=20;i++) {
    		set.add(""+i);
    	}
    	
    		System.out.println(set);
    	
    	for ( int h=0;h<=20;h++) {
    		if((Integer.parseInt(("")+h))%3==0) {
    		set.remove(new String(""+h));
    		}
    	}
    	for(final String d : set) {
    		System.out.println(d);
    	}
    	
    			
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each construct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    }
    }

	
	
