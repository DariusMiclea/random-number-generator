package Classes;

public class IntGenerator extends Generators
{
    @Override
    public double generate()
    {
        return (int)(start + Math.random() * (finish - start));
    }
    public IntGenerator()
    {

    }
    public IntGenerator(double start, double finish)
    {
        this.start=start;
        this.finish=finish;
    }

    public double getStart() {
        return start;
    }

    public double getFinish() {
        return finish;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setFinish(double finish) {
        this.finish = finish;
    }
    
    
}