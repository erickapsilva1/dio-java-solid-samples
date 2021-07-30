package dio.samples.isp.problem;

public class Penguin implements Bird{
    @Override
    public void peck() {
        // can peck
    }

    @Override
    public void lay() {
        // can lay
    }

    @Override
    public void fly() {
        // can't fly
    }
}
