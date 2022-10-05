package birds;

import birds.base.WaterBird;
import enums.FoodType;

import java.util.List;

public class Shorebird extends WaterBird {
    public Shorebird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        super(birdType, favoriteFoods, definingCharacteristic, "DEFAULT BODY OF WATER");
    }
}
