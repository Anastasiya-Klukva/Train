package wagons;

import type.BaggageWagonTypes;
import type.PassengerWagonTypes;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Wagon> wagons = Arrays.asList(
            new Baggage(1, "backpack", BaggageWagonTypes.SMALL_BAG),
            new Baggage(2, "suitcase and  little bag", BaggageWagonTypes.BIG_BAG),
            new Passengers(1, "Maria", PassengerWagonTypes.ADULTS),
            new Passengers(2, "Aleksey and Vania ", PassengerWagonTypes.CHILDREN)
    );
    private static Object WagonTrain;

    public static void main(String[] args) {
        Train train = new Train(wagons);
        List<Baggage> baggageTrain = train.getBaggageList();
        List <Passengers> passengersTrain = train.getPassengersList();
        train.sortByQuantity();
        List<Wagon> wagons1 = train.getWagons();
        for (Wagon wagon : wagons1) {
            System.out.println(wagon.toString());
        }
        System.out.println(" Total quantity of baggage and passengers: " + train.countTotalQuantity());
    }
}
