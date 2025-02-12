package yesithv.collections.map;

import yesithv.collections.User;

import java.util.HashMap;
import java.util.Map;


public class ObjectsAsAKey {

    public static void main(String[] args) {
        Map<User,String> map = new HashMap<>();
        User user1 = new User("Jhon", 1);
        User user2 = new User("Max", 2);
        User user3 = new User("Jhon", 3);
        User user4 = new User("Maxi", 2);

        map.put(user1,"Jhon Uno");
        map.put(user2, "Max Dos 1");
        map.put(user3,"Jhon Tres");
        map.put(user4,"Max Dos 2");


        var result = map.get(new User("Max", 2));
        System.out.println("result = " + result);

        System.out.println("Comparing = " + (user2.equals(user4)));

    }
}

