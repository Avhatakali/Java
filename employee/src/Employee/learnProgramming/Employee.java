
package Employee.learnProgramming;

public class Employee {

    Member member;
    public Employee(Member member) {
        this.member = member;
    }
    // here's our main method
    public static void main(String[] args) {
        Member myMember = new Member("Avhatakali", 2400.00, 25110.00, 2350.00);
        Employee myEmp = new Employee(myMember);
        System.out.println(myEmp.member.getName());
        System.out.println(myEmp.member.getMedical());
        System.out.println(myEmp.member.getLevel());
        System.out.println(myEmp.member.getRank());
        System.out.println("Gross Payment = " + myEmp.member.calcGrossPay());
        System.out.println("Tax Payment = " + myEmp.member.calcTax());
    }
}

class Member {
    private String name;
    private double medical;
    private double salary;
    private double pension;

    public Member(String name, double medical, double salary, double pension) {
        this.name = name;
        this.medical = medical;
        this.salary = salary;
        this.pension = pension;
    }
    /* let's define our getter functions here */
    public String getName() { // what is your name?
        return this.name; // my name is ...
    }
    public double getMedical() { // what is your medical aid ?
        return this.medical;
    }
    public double getLevel() { // what is your level, 1000, 10 000, 20 000 ?
        return this.salary;
    }
    public double getRank() { // what is your pension bracket ?
        return this.pension;
    }

    public double calcGrossPay(){
        return this.pension + this.salary + this.medical;
    }

    public double calcDeductions(){
        return this.pension + this.salary;
    }

    public double calcTax(){
        return 0.08*(this.pension + this.salary + this.medical);
    }
}


