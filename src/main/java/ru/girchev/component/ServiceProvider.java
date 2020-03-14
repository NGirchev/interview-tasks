package ru.girchev.component;

import org.reflections.Reflections;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Girchev N.A.
 * Date: 14.03.2020
 */
public class ServiceProvider {

    public static <T> Set<T> createServiceInstances(Class<T> tClass) {
        Reflections reflections = new Reflections("ru.girchev");
        return reflections.getSubTypesOf(tClass).stream()
                .map(ServiceProvider::createInstance)
                .collect(Collectors.toSet());
    }

    private static <T> T createInstance(Class<T> aClass) {
        try {
            return aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
