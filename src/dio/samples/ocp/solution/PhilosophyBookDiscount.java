package dio.samples.ocp.solution;

public class PhilosophyBookDiscount implements BookDiscount {

    @Override
    public double discountValue() { return 0.2; }
}
