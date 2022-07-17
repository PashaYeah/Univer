package WorkTask10.util;

@FunctionalInterface
public interface Converter<T, N> {

    T convert(N value);











//    static Boolean isCheck(String str) {
//        if(!"".equals(str)) {
//            return str.contains("hello");
//        }
//        return false;
//    }
//
//    default void writeHelloWorld() {
//        System.out.println("Hello World");
//    }
//
//    boolean equals(Object aa);
}
