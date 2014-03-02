package com.anju.collections;

import com.anju.collections.impl.LinkedList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

    @Test
    public void ListSizeTest() {
        LinkedList<String> babyNames = new LinkedList<>();
        babyNames.add("gudiya");
        babyNames.add("doll");
        babyNames.add("love");

        for(String babyName : babyNames){
            System.out.println(babyName);
        }

//        String deleted = babyNames.remove(1);
//        System.out.println("Removed item::"+deleted);

//        int deleted = babyNames.remove("gudiya");
//        System.out.println("deleted index::"+deleted);
//        for(String babyName : babyNames){
//            System.out.println(babyName);
//        }
//        int index = babyNames.indexOf("bachcha");
//
//        System.out.println("IndexOf::"+index);
//        babyNames.clear();
        Iterator<String> it = babyNames.iterator();

        babyNames.add(2,"anshul");
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        for(String babyName : babyNames){
//            System.out.println(babyName);
//        }
//        System.out.println(babyNames.size());
       LinkedList<String> animals = new LinkedList<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("dog");
        animals.add("bat");
        babyNames.addAll(animals);

        for(String babyName : babyNames){
            System.out.println(babyName);
        }

        List<String> sublist = babyNames.subList(1, 7);
        System.out.println("Sublist::");
        for(String str : sublist){
            System.out.println(str);

        }




    }

}