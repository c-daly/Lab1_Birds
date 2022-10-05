package birds.base;

import enums.FoodType;
import interfaces.IWaterBird;

import java.util.List;

public abstract class WaterBird extends GenericBird implements IWaterBird {
    private final String waterBodyName;

    public String getWaterBodyName() {
        return waterBodyName;
    }

    public WaterBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, String bodyOfWater) {
       super(birdType, favoriteFoods, definingCharacteristic);
       this.waterBodyName = bodyOfWater;
    }
}
