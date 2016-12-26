/**
 * Created by odsptc3 on 12/20/2016.
 */
public class Employee {
    static long id = 0;
    long personalId;
    String firstName;
    String lastName;
    double salary;
    int age;
    boolean married;
    int fixedBugs;

    void describe(){
        System.out.print("Emploee: id: " + personalId);
        System.out.print(", first name: " + firstName);
        System.out.print(", second name: " + lastName);
        System.out.print(", salary: " + salary);
        System.out.print(", age: " + age);
        System.out.println(", married: " + married);
    };
    double calculateSalary(double rate){
        return calculateBonus(rate) + salary;
    };
    double calculateBonus(double rate){
        return fixedBugs * rate;
    }

    Employee(){
        personalId = ++id;
    }
}
