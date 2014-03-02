package com.anju.collections;

import com.anju.collections.impl.LinkedList;
import org.junit.Test;

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

        babyNames.add(2,"anshul");
        for(String babyName : babyNames){
            System.out.println(babyName);
        }
        System.out.println(babyNames.size());


    }

}