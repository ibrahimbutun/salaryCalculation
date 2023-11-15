public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("ahmet", 10000, 45, 2000);
        e1.taxCalculation();
        e1.bonusCalculation();
        e1.raiseSalary();
        e1.printInfo();
    }

}
