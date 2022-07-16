package WorkTask9.Util;

import WorkTask9.Exceptions.TooOldException;
import WorkTask9.Exceptions.TooYoungException;

public class AgeUtil {
    public static void checkAge(int age) {

        try {
        checkAgeYoung(age);
        checkOldYoung(age);

            System.out.println("Возраст введен корректный. Готов к работе!");

        } catch (TooYoungException | TooOldException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void checkAgeYoung(int age) throws TooYoungException {
        if (age < 20) {
            throw new TooYoungException("Возраст меньше двадцати лет!");
        }
    }
    private static void checkOldYoung(int age) throws TooOldException {
        if (age > 120) {
            throw new TooOldException("Возраст больше ста двадцати лет!");
        }
    }
}
