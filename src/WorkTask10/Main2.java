package WorkTask10;

import WorkTask10.model.Dog;
import WorkTask10.model.Raccoon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>(){{
//            add("Nik_o");
//            add("Tom");
//            add("Misha_o");
//        }};
//
//        strings.stream()
//                .filter(d -> d.contains("o"))
//                .sorted()
//                .forEach(d -> System.out.println(d));
//
        List<Dog> dogList = new ArrayList<Dog>(){{
            add(new Dog ("Nik_o", 25, 5));
            add(new Dog ("Tom", 15, 7 ));
            add(new Dog("Misha_o", 17,8));
        }};

//        List<Raccoon> raccoonList =
//                dogList.stream()
//                .map(dog -> new Raccoon(dog.getName(), dog.getAge(), "gray"))
//                .collect(Collectors.toList());
//        raccoonList.stream()
//                .forEach(raccoon -> System.out.println(raccoon));

        boolean check = dogList.stream().allMatch(dog -> dog.getName().contains("o"));
    }

}
