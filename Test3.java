
import java.util.ArrayList;
import java.util.function.Predicate;

 class Employee{
    
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal, int exp){
      ename=name;
      salary=sal;
      experience=exp;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Employee emp=new Employee("Rani", 40000, 4);
        Predicate <Employee> pr=ep->(ep.salary>20000 && ep.experience>2);
        System.out.println(pr.test(emp));

        ArrayList<Employee> al=new ArrayList <Employee>();
        al.add(new Employee("riya",80000,3));
        al.add(new Employee("rani",80000,1));
        al.add(new Employee("riyana",80000,5));
        al.add(new Employee("ikra",80000,9));

        for(Employee e:al){
          if(pr.test(e)){
            System.out.println(e.ename+ " " +e.salary);
          }
        }
    }
}
