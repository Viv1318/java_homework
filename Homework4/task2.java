/** 
Задача 2. Реализация стека
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
**/



package Homework4;

import java.util.LinkedList;

public class task2 {

    private LinkedList<String> stack;
    
    public task2() {
        stack = new LinkedList<>();
    }
    
    public void push(String element) {
        stack.addFirst(element);
    }
    
    public String pop() {
        return stack.removeFirst();
    }
    
    public String peek() {
        return stack.peekFirst();
    }
    
    public String[] getElements() {
        return stack.toArray(new String[stack.size()]);
    }
    
    public static void main(String[] args) {
        task2 myStack = new task2();
        
        myStack.push("Hello");
        myStack.push("World");
        myStack.push("Java");
        
        System.out.println("Elements: " + java.util.Arrays.toString(myStack.getElements()));
        
        System.out.println("Popped element: " + myStack.pop());
        
        System.out.println("Peeked element: " + myStack.peek());
        
        System.out.println("Elements: " + java.util.Arrays.toString(myStack.getElements()));
    }
    
}
