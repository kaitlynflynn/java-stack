package com.lambdaschool;

public class Main
{

    public static void main(String[] args)
    {
	    Stack myStack = new Stack(); // make new stack
	    myStack.numOfItems(); // # of items on stack
        myStack.push("'first'"); // Push 1st item
        myStack.push("'second'"); // Push 2nd item
        myStack.push("'third'"); // Push 3rd item
        myStack.numOfItems(); // # of items on stack
        myStack.print(); // Print stack
        myStack.pop(); // Pop last item from stack
        myStack.print(); // Print stack
        myStack.pop(); // Pop last item from stack
        myStack.print(); // Print stack
        myStack.pop(); // Pop last item from stack
        myStack.print(); // Print stack
        myStack.numOfItems(); // # of items on stack
    }
}
