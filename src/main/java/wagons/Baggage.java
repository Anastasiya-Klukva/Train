package wagons;

import type.BaggageWagonTypes;

public class Baggage  extends Wagon {
    private BaggageWagonTypes type;

    public Baggage(int quantity, String name, BaggageWagonTypes type) {
        super(quantity, name);
        this.type = type;
    }

    public BaggageWagonTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Baggage" + "quantity = " + quantity + ", name = '" + name + '\'' + " ";
    }
}
