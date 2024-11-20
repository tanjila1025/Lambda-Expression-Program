import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String ename;
    int sal;

    Employee(String ename, int sal) {
        this.ename=ename;
        this.sal=sal;
    }
    
}

public class Test6{
    public static void main(String[] args) {
        
        ArrayList<Employee> emplist=new ArrayList <Employee>();
        emplist.add(new Employee("jon",50000));
        emplist.add(new Employee("jonia",50000));
        emplist.add(new Employee("joshna",50000));
        emplist.add(new Employee("jasmin",50000));


        Function<String, Integer> fn=e->e{
            
        }
    }

    }

