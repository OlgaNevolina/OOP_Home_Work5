package task;

import java.util.ArrayList;

public class Bank {
    private ArrayList<User> users;
    
    // Конструктор класса
    public Bank() {
        users = new ArrayList<User>();
    }
    
    // Методы для работы с пользователями
    public void addUser(User user) {
        users.add(user);
    }
    
    public void deleteUser(User user) {
        users.remove(user);
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }
}