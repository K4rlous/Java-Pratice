package Moderate;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Base salary: $" + baseSalary + ", Bonus: $" + bonus + ", Total Salary: $" + calculateSalary();
    }


}

