package Moderate;

public class Developer extends Employee {
    private int extraHours;
    private double hourlyRate;

    public Developer(String name, double baseSalary, int extraHours, double hourlyRate) {
        super(name, baseSalary);
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        if(extraHours >= 0){
            this.extraHours = extraHours;
        } else {
            System.out.println("[ERROR] The amount of extra hours must be greater than zero!");
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0){
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("[ERROR] The amount of hourly rates must be greater than zero!");
        }
    }

    @Override
    double calculateSalary() {
        return baseSalary + extraHours * hourlyRate;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Base salary: $" + baseSalary + ", Extra hours done: " + extraHours + ", Hourly rate: " + hourlyRate + ", Total Salary: $" + calculateSalary();
    }

}
