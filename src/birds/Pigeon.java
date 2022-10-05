package birds;

import birds.base.GenericBird;
import enums.FoodType;

import java.util.List;

public class Pigeon extends GenericBird {
    public Pigeon(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        super(birdType, favoriteFoods, definingCharacteristic);
    }
}
