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
public abstract class AbstractList<T> implements List<T>, Iterable<T> {

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
    public Iterator<T> iterator() {
        return new ListIterator<T>();
    }
}
