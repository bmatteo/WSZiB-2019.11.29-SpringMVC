package pl.edu.wszib.repository;

import org.springframework.stereotype.Component;
import pl.edu.wszib.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersRepository {
    private List<User> userList = new ArrayList<>();

    public UsersRepository() {
        User user1 = new User();
        user1.setLogin("abc");
        user1.setPass("abc");

        User user2 = new User();
        user2.setLogin("bcd");
        user2.setPass("bcd");

        User user3 = new User();
        user3.setLogin("cde");
        user3.setPass("cde");

        User user4 = new User();
        user4.setLogin("def");
        user4.setPass("def");

        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        this.userList.add(user4);
    }

    public List<User> getUserList() {
        return userList;
    }
}
