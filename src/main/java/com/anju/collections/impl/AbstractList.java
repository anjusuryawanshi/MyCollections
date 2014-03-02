package com.anju.collections.impl;

import com.anju.collections.List;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created with IntelliJ IDEA.
 * Author: Anju Suryawanshi
 * Date: 2/26/14
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractList<T> implements List<T>, Iterable<T> {

    private class ListIterator<T> implements Iterator<T>{
        int previousPosition = -1;
        int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < size();
        }

        @Override
        public T next() {
            try{
                T item = (T) get(currentPosition);
                previousPosition = currentPosition;
                currentPosition++;
                return item;
            }
            catch (IndexOutOfBoundsException e){
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove() {
            if(previousPosition<0){
                throw new IllegalStateException();
            }

        }
    }

    public void validateIndex(int index){
        if(index < 0 || index > size()-1){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public void add(T item) {


    }

    @Override
    public void add(int index, T item) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addAll(List items) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int remove(T item) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T remove(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAll(List items) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public int size() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T get(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List subList(int index, int length) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ListIterator iterator() {
        return new ListIterator();
    }
}
