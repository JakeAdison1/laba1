package bsu.rfe.course2.group10.okolot;

public class Eggs extends Food{
    private int number;
    private static final double CALORIES_PER_EGG = 70; // Примерное количество калорий в одном яйце


    public Eggs(String name, int number) {
        super(name);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    // Сеттер для установки значения number
    public void setNumber(int number) {
        this.number = number;
    }

    // Метод для отображения информации о продукте
    public void displayInfo() {
        System.out.println("Number of eggs: " + number);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Eggs eggs = (Eggs) obj;
        return this.number == eggs.number; // Предполагаем, что quantity - это поле класса Eggs
    }

    public double calculateCalories() {
        return number * CALORIES_PER_EGG;
    }
    public void consume() {
        System.out.println("Яиц "+this + " съедено");
    }
}

