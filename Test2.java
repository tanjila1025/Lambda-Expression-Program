import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {
        
        Predicate <Integer> pr=i->(i>10);
        System.out.println(pr.test(20));
        System.out.println(pr.test(10));

       Predicate <String> st=s->(s.length()>4);
       System.out.println(st.test("welcome Home"));
       System.out.println(st.test("Rani"));

       // print Array elements whoes size is greater than 4

       String [] names={"riyaa","RaniRaza","irfan","Tanjila","sharuk"};

       for(String name:names){
        if(st.test(name)){
            System.out.println(name);
        }
       }

    }
    
}
