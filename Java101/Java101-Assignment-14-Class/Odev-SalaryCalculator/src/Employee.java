public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String toString() {
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary increase: " + raiseSalary() +
                "\nSalary with the tax and bonuses: " + (this.salary + bonus() - tax()) +
                "\nNet Salary: " + (this.salary + raiseSalary());
    }

    public int tax() {
        if (this.salary > 1000) {
            return this.salary * 3 / 100;
        } else {
            return 0;
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public int raiseSalary() {
        int currentYear = 2023;
        if (currentYear - this.hireYear < 10) {
            return this.salary * 5 / 100;
        } else if (currentYear - this.hireYear < 20 && currentYear - this.hireYear > 9) {
            return this.salary * 10 / 100;
        } else if (currentYear - this.hireYear > 19) {
            return this.salary * 15 / 100;
        }
        return 0;
    }


}
