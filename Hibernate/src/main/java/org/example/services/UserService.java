package org.example.services;
import org.example.models.Auto;
import org.example.userdao.UserDao;
import org.example.models.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public UserService() {
    }

    public User findUser(int id) {
        return userDao.getUserById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> findAllUsers(){
        return userDao.findAll();
    }

    public Auto getAutoById(int id){
        return userDao.getAutoById(id);
    }
}
