package com.epam.customcollection;
import java.util.Arrays;
public class DataList<E> {
	private int size = 0;
    
    //Default capacity of list is 10
    private static final int DEFAULT_CAPACITY = 10;
     
    //This array will store all elements added to list
    private Object elements[];
 
    //Default constructor
    public DataList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
 
    //Add method
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
     
    //Get method
    @SuppressWarnings("unchecked")
    public E get(int i) {
    	try {
        return (E) elements[i];
    	}catch(IndexOutOfBoundsException e) {
    		return (E) elements;
    	}
    }
     
    //Remove method
    @SuppressWarnings("unchecked")
    public E remove(int i) {
    	try {
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (E) item;
    	}catch(IndexOutOfBoundsException e) {
    		return (E) elements;
    	}
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    //Print method
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
