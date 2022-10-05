package birds;

import birds.base.WaterBird;
import enums.FoodType;

import java.util.List;

public class Waterfowl extends WaterBird {
    public Waterfowl(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        super(birdType, favoriteFoods, definingCharacteristic, "DEFAULT BODY OF WATER");
    }
}
