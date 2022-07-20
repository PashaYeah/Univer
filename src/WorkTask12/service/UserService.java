package WorkTask12.service;

import WorkTask12.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<Integer, User> userMap;
    private Integer count = 0;

    public UserService() {
        userMap = new HashMap<>();
    }

    public void addUser(User user) {
        if (user.getAge() < 100) {
            user.setId(++count);
            userMap.put(count, user);    ////написали метод счётчика для упрощения
        }
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }
}
