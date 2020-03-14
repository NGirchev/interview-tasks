package ru.girchev;

import ru.girchev.component.DataProvider;
import ru.girchev.component.ServiceProvider;

/**
 * @author Girchev N.A.
 * Date: 14.03.2020
 */
@SuppressWarnings("all")
public class Main {

//    Дано:
//    Текст в SimpleStringDataProvider (ниже).
//    Нужно написать реализацию интерфейса TestTaskAnalyzer, в которой подсчитываются:
//    1. Все слова в тексте.
//    2. Сколько раз повторяется буква "о"
//    3. Сколько всего строк в тексте.
//    4. Написать unit тест для проверки результатов


    public static void main(String[] args) throws Exception {
        ServiceProvider.createServiceInstances(TestTaskAnalyzer.class)
                .stream()
                .map(testTaskAnalyzer -> testTaskAnalyzer.analyze(new SimpleStringDataProvider().getData()))
                .forEach(System.out::println);
    }

    private static class SimpleStringDataProvider implements DataProvider {

        private static final String TEXT = "Объектно-ориентированное программирование (ООП) \n" +
                " — методология программирования, основанная на представлении программы в\n" +
                " виде совокупности объектов, каждый из которых является экземпляром\n" +
                " определённого класса, а классы образуют иерархию наследования\n";

        @Override
        public String getData() {
            return TEXT;
        }
    }
}
