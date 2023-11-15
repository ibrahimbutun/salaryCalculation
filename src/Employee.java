public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void taxCalculation() {
        if (this.salary >= 1000) {
            this.salary -= (this.salary * 3) / 100;
            // System.out.println("Maaş fazla olduğu için vergi uygulandı ! yrni maaş : " +
            // this.salary);
        } else {
            // System.out.println("vergi dilimine girmedi");
        }
    }

    void bonusCalculation() {
        if (workHours >= 40) {
            this.salary += (workHours - 40) * 30;
            // System.out.println("Fazla mesai ücreti eklendi ! Mesai eklenmiş maaş : " +
            // this.salary);
        } else {
            // System.out.println("mesai yok");
        }
    }

    void raiseSalary() {
        // START YEAR 2021
        int hYear = 2021 - this.hireYear;

        if (hYear < 10) {
            this.salary += this.salary * 0.05;
            // System.out.println("10 ve altı maaş ikramiyesi : " + this.salary);
        } else if (hYear > 9 && hYear < 20) {
            this.salary += this.salary * 0.10;
            // System.out.println("10-20 yıl arası ikramiye : " + this.salary);
        } else if (hYear > 19) {
            this.salary += this.salary * 0.15;
            // System.out.println("20 yıl ve fazlası ikramiye : " + this.salary);
        }

    }

    void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);

    }

}
