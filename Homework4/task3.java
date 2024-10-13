/**
Задача 3. Количество вхождений слова
Реализуйте метод countOccurrences в классе ListUtils, который
принимает LinkedList<String> и строку, и возвращает количество
вхождений строки в список.
**/



package Homework4;

import java.util.LinkedList;

public class task3 {
    
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("example");
        list.add("Java");
        list.add("example");

        countOccurrences(list);
        System.out.println("The word 'example' appears " + countOccurrences(list) + " times in the list.");
        
        
        
    }
    
    private static int countOccurrences(LinkedList<String> list){
        
        int count = 0;
        
        
        
        if(list.size()==0){
            return count = 0;
            
        }
        
        for (String word : list) {
            
            
            if (word.equals("example")) {
                count++;
            }
        }
        return count;
    }    

}
