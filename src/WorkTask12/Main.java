package WorkTask12;

import WorkTask12.model.User;
import WorkTask12.service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        User user1 = new User("Pasha", 28, "men");
        userService.addUser(user1);
        User user2 = new User("Stas", 30, "men");
        userService.addUser(user2);

        userService.getUserMap().forEach((id, user) -> {
            System.out.printf("id = %d, user = %s \n", id, user);
        });
    }
}
