package ru.girchev;

/**
 * @author Girchev N.A.
 * Date: 14.03.2020
 */
public interface TestTaskAnalyzer<T> {

    T analyze(String testString);
}
