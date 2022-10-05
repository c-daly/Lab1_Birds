package birds;

import birds.base.GenericBird;
import enums.FoodType;

import java.util.List;

public class BirdOfPrey extends GenericBird {
    public BirdOfPrey(String birdType, List<FoodType> favoriteFoods) {
        super("Hawk", favoriteFoods, "Defining Characteristic");
    }
}
