package ru.girchev.analyzer;

/**
 * @author Girchev N.A.
 * Date: 14.03.2020
 */
public interface TestAnalyzer<T> {

    T analyze(String testString);
}
