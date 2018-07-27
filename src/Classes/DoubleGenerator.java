package Classes;

public class DoubleGenerator extends Generators
{
    @Override
    public double generate()
    {
        return (start + Math.random() * (finish - start));
    }

    public DoubleGenerator()
    {

    }
    public DoubleGenerator(double start, double finish)
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
