
import Classes.MultiplierGenerator;
import Classes.IntGenerator;

public class Main
{
    public static void main(String[] args) {
        MultiplierGenerator G1= new MultiplierGenerator(2,100,7.7);
        System.out.println(G1.generate());
    }
}
