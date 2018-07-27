package Classes;

public class ParityGenerator extends IntGenerator {
    public boolean even;

    @Override
    public double generate() {
        if (even == true) {
            int r = (int) (start + Math.random() * (finish - start));
            while (r % 2 != 0)
                r = (int) (start + Math.random() * (finish - start));
            return r;
        } else
        {
            int r = (int) (start + Math.random() * (finish - start));
            while (r % 2 == 0)
                r = (int) (start + Math.random() * (finish - start));
            return r;
        }


    }
    public ParityGenerator()
    {

    }
    public ParityGenerator(double start, double finish,boolean even) {
        super(start,finish);
        this.even = even;
    }

    public boolean isEven() {
        return even;
    }

    public double getStart() {
        return start;
    }

    public double getFinish() {
        return finish;
    }

    public void setEven(boolean even) {
        this.even = even;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setFinish(double finish) {
        this.finish = finish;
    }
    
    
}
