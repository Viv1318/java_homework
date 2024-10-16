import java.util.ArrayList;
import java.util.HashMap;

/**
 * Задание 1. Студенческий справочник
Реализуйте программу для работы с простым справочником студентов.
Программа должна иметь следующие функции:
● addStudent(String name, Integer grade): Добавляет или
обновляет запись о студенте с именем name и оценкой grade. Если
студент уже существует, обновляет его оценку.
● findStudent(String name): Находит оценки студента по его имени.
Если студент существует, возвращает список его оценок. Если нет —
пустой список.
● getAllStudents(): Возвращает весь справочник студентов в виде
HashMap, где ключи — имена студентов, а значения — списки их оценок.
● removeStudent(String name): Удаляет запись о студенте по имени
из справочника. Если запись не существует, ничего не происходит
 */


public class task1 {

    public static void main(String[] args) {


        task1 studentBook = new task1();

        studentBook.addStudent("Petrov", 5);
        studentBook.addStudent("Ivanov", 3);
        studentBook.addStudent("Sidorov", 4);

        System.out.println(studentBook.findStudent("Petrov")); 
        System.out.println(studentBook.getAllStudents()); 
        studentBook.removeStudent("Sidorov");
        System.out.println(studentBook.getAllStudents()); 
        studentBook.addStudent("Krilov", 5);
        System.out.println(studentBook.getAllStudents());
        
    }

    private HashMap<String, ArrayList<Integer>> students = new
HashMap<>();

    public void addStudent(String name, Integer grade) {
        students.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);

       

    }

    public ArrayList<Integer> findStudent(String name) {
        return students.getOrDefault(name, new ArrayList<>());
    }

    public HashMap<String, ArrayList<Integer>> getAllStudents() {
        return students;
    }

    public void removeStudent(String name) {
        students.remove(name);

        
    }

   
    }
    

    

