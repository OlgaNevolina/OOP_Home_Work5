package task;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Создаем банк и несколько пользователей
        Bank bank = new Bank();
        User user1 = new User("John", "Doe", "johndoe@gmail.com", "password123", 500.0);
        User user2 = new User("Jane", "Doe", "janedoe@gmail.com", "password456", 1000.0);
        
        // Добавляем пользователей в банк
        bank.addUser(user1);
        bank.addUser(user2);
        
        // Выводим список пользователей
        ArrayList<User> users = bank.getUsers();
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " - " + user.getBalance());
        }
        
        // Пополнение баланса первого пользователя
        user1.addFunds(100.0);
        
        // Снятие средств со счета второго пользователя
        user2.withdrawFunds(700.0);
        
        // Создаем транзакции
        Transaction transaction1 = new Transaction(user1, 100.0, "deposit");
        Transaction transaction2 = new Transaction(user2, 700.0, "withdrawal");
        
        // Выводим информацию о транзакциях
        System.out.println("Transaction 1: " + transaction1.getAmount() + " " + transaction1.getType() + " on " +transaction1.getDate());
        System.out.println("Transaction 2: " + transaction2.getAmount() + " " + transaction2.getType() + " on " + transaction2.getDate());
    }
}