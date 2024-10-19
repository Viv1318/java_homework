package Homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        Set<lapTop> laptops = new HashSet<>();
        laptops.add(new lapTop("MSI", 16, 512, "Linux"));
        laptops.add(new lapTop("Apple", 8, 256, "MacOS"));
        laptops.add(new lapTop("Asus", 32, 1024, "Windows"));

        Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерии для фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("0 - Завершить выбор");

        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 0) {
            break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Минимальный объем ОЗУ?");
                    filters.put("ram", scanner.nextInt());
                    continue;
                case 2:
                    System.out.println("Минимальный объем ЖД?");
                    filters.put("hdd", scanner.nextInt());
                    continue;
                case 3:
                    System.out.println("Операционная система?");
                    filters.put("os", scanner.next());
                    continue;
                
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        Set<lapTop> filteredLaptops = laptops.stream()
                .filter(laptop -> filters.getOrDefault("ram", 0) instanceof Integer && laptop.ram >= (int) filters.getOrDefault("ram", 0))
                .filter(laptop -> filters.getOrDefault("hdd", 0) instanceof Integer && laptop.hdd >= (int) filters.getOrDefault("hdd", 0))
                .filter(laptop -> filters.getOrDefault("os", "").equals("") || laptop.os.equalsIgnoreCase((String) filters.getOrDefault("os", "")))
                .filter(laptop -> filters.getOrDefault("color", "").equals("") )
                .collect(Collectors.toSet());

        System.out.println("Отфильтрованные ноутбуки:");
        for (lapTop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
    }
    

