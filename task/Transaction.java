package task;

import java.time.LocalDate;

public class Transaction {
    private User user;
    private double amount;
    private String type;
    private LocalDate date;
    
    // Конструктор класса
    public Transaction(User user, double amount, String type) {
        this.user = user;
        this.amount = amount;
        this.type = type;
        this.date = LocalDate.now();
    }
    
    // Геттеры для полей класса
    public User getUser() {
        return user;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getType() {
        return type;
    }
    
    public LocalDate getDate() {
        return date;
    }
}