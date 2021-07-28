package dio.samples.ocp.solution;

public class ChildrenBookDiscount implements BookDiscount {

    @Override
    public double discountValue() { return 0.5 ; }

}
