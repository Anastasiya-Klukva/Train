package wagons;

import type.PassengerWagonTypes;

public class Passengers extends Wagon{
    private PassengerWagonTypes type;

    public Passengers(int quantity, String name, PassengerWagonTypes type) {
        super(quantity, name);
        this.type = type;
    }

    public PassengerWagonTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Passengers " + "quantity = " + quantity + ", name='" + name + '\'' + " ";
    }
}
