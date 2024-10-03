// Задача 4. Логирование операций с массивом во время поиска
// минимального и максимального элементов
// Реализуйте метод поиска минимального и максимального элементов массива.
// После нахождения каждого элемента (минимального и максимального),
// сделайте запись в лог-файл log.txt в формате год-месяц-день
// час:минуты {минимальный элемент}, {максимальный элемент}




package Homework2;

import java.io.File;
import java.io.FileWriter;

public class task4 {

    public static void main(String[] args) {

        // int[] arr = {5, 10, -3, 8, 2, 22, 1, 4, 9, 6};
        
        int[] arr = new int[100];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] = (int) (Math.random() * 15);
           

        }

        try {
                File file = new File("log.txt");
                if (file.createNewFile()) {
                    System.out.println("Log file created successfully");
                }
                else {
                    System .out.println("File already exists");
                }
                
            } catch (Exception e) {
                System.out.println("Error creating log file");
                e.printStackTrace();
            }
            try {
                     FileWriter writer = new FileWriter("log.txt", true); 
                     writer.write(new java.util.Date().toString() + "\n" );
                     writer.write("Min: " + searchForMin(arr) + ", Max: " + searchForMax(arr) + "\n");
                     writer.close();
            
        } catch (Exception e) {
            System.out.println("Error writing to log file");
            e.printStackTrace();
        }    
  

    }

    public static int searchForMax (int[] arr) {

        int max = arr[0];
         
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }    
    }
    return max;
}    
        public static int searchForMin (int[] arr) {
            
            int min = arr[0];
            
            for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
                
            }
                      
        }
            return min;

    }
       
    

}
