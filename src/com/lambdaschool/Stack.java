package com.lambdaschool;

import java.util.ArrayList;

// Make a class called "Stack"
public class Stack
{
    private ArrayList<String> storage;

    public Stack()
    {
        // Stack class's storage will be an Array with max of 1000 elements of type String.
        this.storage = new ArrayList<String>(1000);
    }

    // Methods ---------------------------------------------------

    // PRINT METHOD
    // This will print out storage.
    // Print the items in the order they were added to the stack.
    // Should be in the form of ['item1', 'item2'].
    public void print()
    {
        System.out.println(this.storage);
    }

    // POP METHOD
    // This will remove the last String from ArrayList Storage.
    // Remove the last item from the stack and return the item.
    public void pop()
    {
        this.storage.remove(this.storage.size() -1);
    }

    // PUSH METHOD
    // This will add the String to the end of ArrayList Storage.
    // Put the item on top of the stack
    public void push(String element)
    {
        this.storage.add(this.storage.size(), element);
    }

    // numOfItems METHOD
    // This will get the number of items in the ArrayList.
    // If no items are found, it will call emptyList Method.
    public void numOfItems()
    {
    if (this.storage.size() == 0)
    {
        emptyList();
    }
    else
    {
        System.out.println(this.storage.size());
        this.storage.size();
    }
    }

    // emptyList METHOD
    // No items in on the stack, return the mssg 'There are no items
    // in your Stack'
    public String emptyList()
    {
        System.out.println("*** There are no items in your Stack! ***");
        return "There are no items in your Stack!";
    }
}
