/**
Задача 4. Сдвиг очереди
Реализуйте метод rotateDeque в классе DequeTasks, который принимает
Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
позиций. Если n отрицательное, повернуть влево.
*/



package Homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n: ");
            int n = scanner.nextInt();

        Deque<Integer> deque = new LinkedList<Integer>();

        // Добавляем элементы в очередь
        for (int i = 0; i < 4; i++) {
            deque.add(i);
        }

        System.out.println("Original deque: " + deque);
        rotateDeque(deque, n);
        System.out.println("Rotated deque: " + deque);
        
       
    }

    public static void rotateDeque(Deque<Integer> deque, int n) {

        if(deque.isEmpty()) return;
        int size = deque.size();

        n = n % size;

        for(int i = 0; i < n; i++) {

            deque.addLast(deque.removeFirst());

        } 
        if (n < 0) {
            n += size;
            
        }
    }
    
}
