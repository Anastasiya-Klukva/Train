package wagons;

public class BaggageWagon extends Wagon {
    public BaggageWagon(int unitQuantity, String unitType) {
        super(unitQuantity, unitType);
    }

    @Override
    public String toString() {
        return "BaggageWagon " + "unitQuantity = " + unitQuantity + ", unitType = " + unitType + " ";
    }
}
