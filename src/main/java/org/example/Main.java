package org.example;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();


        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        int sizeOfList = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValueOfList = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> source = random.ints(0, maxValueOfList + 1)
                .distinct()     // уникальные значения (дубликаты исключены)
                .limit(sizeOfList)
                .boxed()
                .collect(toList());

        System.out.println("Вот случайный список: "
                + source.toString()
        );

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        Filter filter = new Filter(scanner.nextInt());

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: "
                + filter.filterOut(source).toString()
        );
        logger.log("Завершаем программу");


    }
}