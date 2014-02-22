package com.anju.collections;

public interface List<T> extends Iterable<T> {

    /**
     * Adds an item to the end of the list
     *
     * @param item Object to be added to the list
     */
    void add(T item);

    /**
     * Adds an <code>item</code> at the specified <code>index</code>
     *
     * @param index <code>index</code> of the list at which object is added
     * @param item  object to be added at the specified <code>index</code>
     * @throws ArrayIndexOutOfBoundsException when passed an invalid <code>index</code>
     */
    void add(int index, T item);

    /**
     * Adds the list of <code>items</code> to the end of the list
     *
     * @param items list of <code>items</code> to be added
     */
    void addAll(List<T> items);

    /**
     * Removes an object from the list
     *
     * @param item object to be removed from the list
     * @return returns the index of the object removed from the list
     */
    int remove(T item);

    /**
     * Removes an object at the <code>index</code> passed
     *
     * @param index <code>index</code> of the object to be removed
     * @return returns the object removed
     * @throws ArrayIndexOutOfBoundsException when passed an invalid <code>index</code>
     */
    T remove(int index);

    /**
     * Removes all the items of the specified from the list
     *
     * @param items list to be cleared
     * @return returns true if all elements of the list are deleted,
     *         returns false if subset of the list/invalid list of items is passed.
     */
    boolean removeAll(List<T> items);

    /**
     * Clears the list
     */
    void clear();

    /**
     * Checks if the list is empty
     *
     * @return returns true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Gives size of the list
     *
     * @return returns the number of objects in the list
     */
    int size();

    /**
     * Gives the element of the list at the specified <code>index</code>
     *
     * @param index <code>index</code> of the element to be retrieved
     * @return returns the element at the specified <code>index</code>
     * @throws ArrayIndexOutOfBoundsException when passed an invalide <code>index</code>
     */
    T get(int index);

    /**
     * Gives sublist of a list
     *
     * @param index  <code>starting index of the list</code>
     * @param length <code>length</code> of the sublist
     * @return sublist
     * @throws ArrayIndexOutOfBoundsException when passed an invalid <code>index</code>
     *                                        or <code>length</code>
     */
    List<T> subList(int index, int length);

}