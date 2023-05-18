package org.example;

import org.example.models.Auto;
import org.example.models.User;
import org.example.services.UserService;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        UserService userService = new UserService();
        User user1 = new User("Alesha", "Ovsyannik", 22);
        userService.saveUser(user1);
        /*Auto ferrari = new Auto("Ferrari", "Red");
        ferrari.setUserId(user1);
        user1.addAuto(ferrari);*/
        /*Auto ford = new Auto("Ford", "Black");
        ford.setUserId(user1);
        user1.addAuto(ford);*/
    }
}
