package birds;

import birds.base.GenericBird;
import enums.FoodType;

import java.util.List;

public class Owl extends GenericBird {
    public Owl(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        super(birdType, favoriteFoods, definingCharacteristic);
    }
}
