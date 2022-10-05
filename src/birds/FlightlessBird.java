package birds;

import birds.base.GenericBird;
import enums.FoodType;

import java.util.List;

public class FlightlessBird extends GenericBird {
    public FlightlessBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, int numWings, boolean isExtinct) {
        super(birdType, favoriteFoods, definingCharacteristic, numWings, isExtinct);
    }
}
