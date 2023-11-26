package org.example;

public class Employee {
    private String name;
    private double rate;
    private int hour;
    private int salary;
    private static int totalSum = 0;

    public Employee() {
    }
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
         }

    public Employee(String name, double rate, int hour) {
        this.name = name;
        this.rate = rate;
        this.hour = hour;
        calculateSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
        calculateSalary();
    }

    public void setHour(int hour) {
        this.hour = hour;
        calculateSalary();
    }

    public double getHour() {
        return hour;
    }

    public int getSalary() {
        return salary;
    }
    // int salary = (int) (rate*hour);
    //  return (int) (rate*hour);

    public int getTotalSum() {
        return totalSum;
    }

    public int getBonuses() {
        int bonus = (int) (salary * 0.1);
        return bonus;
    }
private void calculateSalary(){
        salary = (int) (rate * hour);
        totalSum += salary;
}

    @Override
    public String toString() {
        return "Employee [name=" + name + ", rate= " + rate + " salary: " + getSalary() + "]";
    }
}
/*
    public static double getAvgRating() {
        return (double) sum / number;
    }

    public boolean betterEmployee(Employee employee) {
        return this.getRating() > employee.getRating();
    }





}
*/
/*public class Employee {
        private String name;
        int rating;
        private static int number = 0;
        private static int sum = 0;

        public Employee() {
            number++;
        }

        public Employee(String name) {
            this.name = name;
            number++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
            sum += rating;
        }

        public static double getAvgRating() {
            return (double) sum / number;
        }

        public boolean betterEmployee(Employee employee) {
            return this.getRating() > employee.getRating();
        }

        @Override
        public String toString() {
            return "Employee [name=" + name + ", rating=" + rating + "]";
        }
    }
*/