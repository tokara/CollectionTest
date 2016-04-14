/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest {

    public static void main(String[] args) {
    
       String[] colors = {"Blue", "Red", "Orange", "Yellow", "White", "Black"};
       List<String> list = new ArrayList<>();'added'
       
       for(String color : colors){
       list.add(color);    
       }
       String[] removeColors = {"Red", "Orange"};
       List<String> removeList = new ArrayList<>();
       
       for(String color : removeColors){
       removeList.add(color);    
       }
        System.out.println("ArrayList :"); 
        
        for(int count = 0; count < list.size(); count++){
            System.out.printf("%s ", list.get(count));
        }
        removeColors(list, removeList);
        
        System.out.printf("%n%nArrayList after calling remove colors : %n");
        
        for(String color : list){
            System.out.printf("%s ", color);
        }
        
        
    }
    
    public static void removeColors(Collection<String> collection1, Collection<String> collection2){
        
        Iterator<String> it = collection1.iterator();
        
        while(it.hasNext()){
            
            if(collection2.contains(it.next()))
                it.remove();           
        }
        
        
    }
    
    
}
