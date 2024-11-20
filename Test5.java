import java.util.function.Function;

public class Test5 {
    public static void main(String[] args) {
        Function <Integer,Integer> p=n->n*n;
        System.out.println(p.apply(8));
        System.out.println(p.apply(4));
        System.out.println(p.apply(9));

        Function <String,Integer> fn=s->s.length();
        System.out.println(fn.apply("riya"));
        System.out.println(fn.apply("riya is smart"));
    }
}
