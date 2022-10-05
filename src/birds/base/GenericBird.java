package birds.base;

import enums.FoodType;
import interfaces.IBird;

import java.util.List;

// We will be testing each constructor for the concrete classes.
// Given that all classes correctly instantiate given constructor args,
// we can test each of these methods once with an arbitrary concrete class.
public abstract class GenericBird implements IBird {
    private static final int DEFAULT_NUM_WINGS = 2;
    private static final boolean DEFAULT_EXTINCTION_STATUS = false;
    private final String definingCharacteristic;
    private final String birdType;
    private final List<FoodType> favoriteFoods;
    private final boolean isExtinct;
    private final int numWings;
    private final String foodDescription;

    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, int numWings, boolean isExtinct){
        this.birdType = birdType;
        this.favoriteFoods = favoriteFoods;
        this.definingCharacteristic = definingCharacteristic;
        this.numWings = numWings;
        this.isExtinct = isExtinct;
        this.foodDescription = "DEFAULT FOOD DESCRIPTION";
    }

    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        this(birdType, favoriteFoods, definingCharacteristic, DEFAULT_NUM_WINGS, DEFAULT_EXTINCTION_STATUS);
    }
    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, int numWings){
        this(birdType, favoriteFoods, definingCharacteristic, numWings, DEFAULT_EXTINCTION_STATUS);
    }
    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, boolean isExtinct) {
        this(birdType, favoriteFoods, definingCharacteristic, DEFAULT_NUM_WINGS, isExtinct);
    }

    public String getDefiningCharacteristic() {
        return definingCharacteristic;
    }

    public String getBirdType() {
        return birdType;
    }

    public boolean getExtinctionStatus() {
        return isExtinct;
    }

    public int getNumberOfWings() {
        return numWings;
    }

    public List<FoodType> getFavoriteFoods() {
        return favoriteFoods;
    }

    public String getFoodDescription() {
        return foodDescription;
    }


    public String getName() { return "Birdy McBirdson";}
    public int getID() { return 42; }
}
