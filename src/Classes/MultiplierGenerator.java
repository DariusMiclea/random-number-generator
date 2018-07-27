package Classes;

public class MultiplierGenerator extends IntGenerator
{
    private double m;
    @Override
    public double generate()
    {
        return (int)(start + Math.random() * (finish - start))*m;
    }
    public MultiplierGenerator()
    {

    }
    public MultiplierGenerator(double start, double finish,double m) {
        super(start,finish);
        this.m = m;
    }

    public double getM() {
        return m;
    }

    public double getStart() {
        return start;
    }

    public double getFinish() {
        return finish;
    }
    
}
