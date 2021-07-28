package dio.samples.ocp.problem;

public class DiscountController {

    public void addChildrenBookDiscount(ChildrenBookDiscount childrenBookDiscount){
        childrenBookDiscount.childrenBookDiscountValue();
    }

    public void addFantasyBookDiscount(FantasyBookDiscount fantasyBookDiscount){
        fantasyBookDiscount.fantasyBookDiscountValue();
    }

    public void addPhilosophyBookDiscount(PhilosophyBookDiscount philosophyBookDiscount){
        philosophyBookDiscount.philosophyBookDiscountValue();
    }

}
