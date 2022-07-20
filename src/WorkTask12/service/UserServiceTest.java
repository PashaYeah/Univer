package WorkTask12.service;


import WorkTask12.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        User user1 = new User("Sasha", 101, "men");
        User user2 = new User("Dasha", 50, "woman");
        User user3 = new User("Glasha", 40, "woman");

        userService = new UserService();

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

    }

    @Test
    public void addUser() {
        Assert.assertNotNull(userService.getUserMap());
        Assert.assertTrue(userService.getUserMap().size() == 2);

    }

    @Test
    public void getYoungUserMap() {

        Assert.assertNotNull(userService.getUserMap());
        Assert.assertEquals(2, userService.getUserMap().size());
    }

}