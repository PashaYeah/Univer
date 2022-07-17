package WorkTask10;

import WorkTask10.model.ConverterImpl;
import WorkTask10.model.Dog;
import WorkTask10.model.Raccoon;
import WorkTask10.util.Converter;

public class Main {
    public static void main(String[] args) {


        //Преобразовать собаку в енота
        Converter<Raccoon, Dog> dogConverter = (dog) -> new Raccoon(dog.getName(), dog.getAge(), "gray");

        //Преобразовать из инт в стринг
        Converter<String,Integer> intToString = (i) -> i.toString();


        Dog dog = new Dog("George", 25, 40);
        Raccoon raccoon = dogConverter.convert(dog);
        System.out.println(raccoon);

        Integer b = 150;
        String str5 = intToString.convert(b);
        System.out.println(str5);
        System.out.println(str5.getClass());



//        String str1 = "Hello World";
//        System.out.println(Converter.isCheck(str1.toLowerCase()));
//
//        Converter converter = new ConverterImpl();
//        converter.convert(8,"");
//
    }
}
