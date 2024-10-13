// Дан LinkedList с несколькими элементами. В методе
// removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
// которых нечетная. Используйте LinkedList и стандартные методы.





package Homework4;

import java.util.LinkedList;


public class task1 {

    
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("is");
        list.add("fun");

        

        System.out.println(list); // Output: [Hello, World, Java, Programming, is, fun]

        
        
        removeOddLengthStrings(list);
                           
       

    }

    // public static void removeOddLengthStrings(LinkedList<String> list) {

    //     list.removeIf(s -> s.length() % 2!= 0);

    //     System.out.println(list);

    // }

    public static void removeOddLengthStrings(LinkedList<String> list) {

        LinkedList <String> result = new LinkedList<String>();
        for (String s : list) {
            if (s.length() % 2 != 0) {
                result.add(s);
            }
            
            
        }
        list.removeAll(result);
        
        System.out.println(list); 
    

    }     
}
    

