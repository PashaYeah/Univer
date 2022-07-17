package Diplom;
@FunctionalInterface
public interface Converter<T, N> {
    T convert(N t);
}
