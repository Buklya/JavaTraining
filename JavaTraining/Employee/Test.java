/**
 * Created by odsptc3 on 12/20/2016.
 */
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        Employee [] employees = generate(5);        
        print(employees);
        System.out.println(calculateSalary(employees));
        setFixedBugs(employees);
        System.out.println(calculateSalary(employees));
    }

    static Employee[] generate (int size){
        String [] names = {"Kolya", "Vasya", "Sasha", "Sveta", "Olya", "Ann"};
        String [] secondNames = {"Ivashenko", "Koval", "Medved"};
        Employee[] employees = new Employee[size];
        for(int i = 0; i < size; i++){            
            Random random = new Random();
            employees[i] = new Employee();
            employees[i].firstName = new String(names[random.nextInt(names.length)]);
            employees[i].lastName = new String(secondNames[random.nextInt(secondNames.length)]);
            employees[i].salary = 100 + random.nextInt(100);
            employees[i].age = 18 + random.nextInt(50);
            employees[i].married = random.nextBoolean();                       
        }
        return employees;
    }

    static void setFixedBugs(Employee [] employees){
        for(int i = 0; i < employees.length; i++){
            Random random = new Random();
            employees[i].fixedBugs = random.nextInt(20);
        }
    }

    static double calculateSalary(Employee[] employees){
        double finalSalary = 0;
        for(Employee person: employees){
            finalSalary += person.calculateSalary(10);
        }
        return finalSalary;
    }

    static void print(Employee[] employees){
        for(Employee person: employees){
            person.describe();
        }
    }
}
