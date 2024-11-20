
interface Cab{
    public void bookCab(String source, String destination);
}

//we can declare & implement the interface using lambda Expression
public class Test {
    public static void main(String[] args) {
        Cab cab=(Source,destination)-> System.out.println("Ola cab booked " +Source+ " To " + destination);
        cab.bookCab("Mumbai", "Solapur");
    }
}
