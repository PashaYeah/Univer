package Diplom.util;
@FunctionalInterface
public interface Converter<T, N> {
    T convert(N t);
}
