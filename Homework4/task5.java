/**
 * Задача 5*. Удаление слова из очереди
Реализуйте метод removeAllOccurrences в классе DequeTasks, который
принимает Deque<String> и строку value. Метод должен удалить все
вхождения строки value из очереди.
 */



package Homework4;

import java.util.Deque;
import java.util.LinkedList;

public class task5 {

    public static void main(String[] args) {

        Deque<String> queue = new LinkedList<String>();

        queue.add("Hello");
        queue.add("World");
        queue.add("Hello");
        queue.add("Java");
        queue.add("Hello");

        String value = "Hello";

        removeAllOccurrences(queue, value);
        
        System.out.println(queue); // Output: [World, Java]

    }

    public static void removeAllOccurrences(Deque<String> deque, String value) {
        
        while (deque.contains(value)) {
            deque.remove(value);

        }

    }
    
}
