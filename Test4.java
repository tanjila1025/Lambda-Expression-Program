
import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        int [] list={24,45,67,80,34,58,90,40};

        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=i->i>50;

        for(int e:list){

            if(p1.test(e) && p2.test(e)){
            System.out.println(e);
        }
    }

    for(int n:list){
        if(p1.and(p2).test(n)){
            System.out.println(n);
        }
    }

   System.out.println("*****************************");

   for(int n:list){
    if(p1.or(p2).test(n)){
        System.out.println(n);
    }
}
System.out.println("*****************************");

for(int n:list){
    if(p2.negate().test(n)){
        System.out.println(n);
    }
}

System.out.println("*****************************");
for(int n:list){
    if(p1.negate().test(n)){
        System.out.println(n);
    }
}

}
}
