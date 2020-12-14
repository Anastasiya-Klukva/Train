package wagons;

import type.PassengerWagonTypes;

public class PassengersWagon extends Wagon{
    private PassengerWagonTypes type;

    public PassengersWagon(int unitQuantity, String unitType, PassengerWagonTypes type) {
        super(unitQuantity, unitType);
        this.type = type;
    }

    public PassengerWagonTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PassengersWagon " + "type = " + type + ", unitQuantity = " + unitQuantity + ", unitType = " + unitType  + " ";
    }
}
