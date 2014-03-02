package com.anju.collections.impl;

import com.anju.collections.List;

/**
 * Author: Anju Suryawanshi
 * Date: 2/22/14
 * Time: 3:22 PM
 */
public class LinkedList<T> extends AbstractList<T> {
    private LinkedNode<T> head = null;
    private int size = 0;

    //Appends an item to the end of the list
    @Override
    public void add(T item) {
        if (size == 0) {
            head = new LinkedNode<>(item, null);
            size++;
            return;
        }
        LinkedNode cursor = head;
        while (cursor.nextNode != null) {
            cursor = cursor.nextNode;
        }
        cursor.nextNode = new LinkedNode<>(item, null);
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        LinkedNode<T> cursor = head;
        while (index > 0) {
            cursor = cursor.nextNode;
            index--;
        }
        return cursor.value;
    }

    @Override
    public List<T> subList(int index, int length) {
        validateIndex(index);
        if(index+length > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        LinkedNode<T> cursor = head;
        while(index>0){
            cursor = cursor.nextNode;
            index--;
        }
        LinkedList<T> subList = new LinkedList<>();
        while(length > 0){
            LinkedNode<T> newNode = new LinkedNode<>(cursor.value, cursor.nextNode);
            subList.add(newNode.value);
            cursor = cursor.nextNode;
            length--;
        }
        return subList;
    }

    @Override
    public T remove(int index) {
        validateIndex(index);
        LinkedNode<T> deleted;
        if (index == 0) {
            deleted = head;
            head = head.nextNode;
        } else {
            LinkedNode<T> cursor = head;
            while (--index > 0) {
                cursor = cursor.nextNode;
            }
            deleted = cursor.nextNode;
            cursor.nextNode = deleted.nextNode;
        }
        deleted.nextNode = null;
        size--;
        return deleted.value;
    }

    @Override
    public boolean removeAll(List<T> items) {
        int removeAll = -1;
        for(T item : items){
            removeAll = remove(item);
        }
        return removeAll < 0;
    }

    @Override
    public int remove(T item) {
        int deleteIndex = indexOf(item);
        int count = 0;
        if (deleteIndex == -1) {
            return -1;
        }
        LinkedNode<T> cursor = head;
        if (deleteIndex == 0) {
            head = head.nextNode;
            size--;
        } else {
            while (count != deleteIndex - 1) {
                cursor = cursor.nextNode;
                count++;
            }
            cursor.nextNode = cursor.nextNode.nextNode;
            size--;
        }
        return deleteIndex;
    }

    public int indexOf(T item) {
        if (head == null || size < 1) {
            throw new IllegalArgumentException();
        }
        int index = 0;
        LinkedNode<T> cursor = head;
        while (index < size) {
            if (cursor.value == item) {
                return index;
            } else {
                cursor = cursor.nextNode;
                index++;
            }
        }
        return -1;
    }

    @Override
    public void clear(){
        if(this.size() == 0){
           return;
        }
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void add(int index, T item){
        validateIndex(index);
        LinkedNode<T> cursor = head;
        LinkedNode<T> newNode = new LinkedNode<T>(item, null);

        if(index == 0){
            this.head = newNode;
            newNode.nextNode = cursor;
            size++;
            return;
        }
        int count = 0;
        while(count != index-1){
            cursor = cursor.nextNode;
            count++;
        }
        LinkedNode<T> nextListNode = cursor.nextNode;
        cursor.nextNode = newNode;
        newNode.nextNode = nextListNode;
        size++;
    }

    @Override
    public void addAll(List<T> items) {
        for(T item : items){
           add(item);
        }
    }

    private static class LinkedNode<T> {
        private T value;
        private LinkedNode<T> nextNode;

        public LinkedNode(T value, LinkedNode<T> nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }
    }

}
