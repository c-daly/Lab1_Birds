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
    private static final String DEFAULT_NAME = "UNNAMED BIRD";
    private static final int DEFAULT_ID = 0;
    private final String definingCharacteristic;
    private final String birdType;
    private final List<FoodType> favoriteFoods;
    private final boolean isExtinct;
    private final int numWings;
    private final String foodDescription;
    private final String name;
    private final int ID;

    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, int numWings, boolean isExtinct, String name, int ID){
        this.birdType = birdType;
        this.favoriteFoods = favoriteFoods;
        this.definingCharacteristic = definingCharacteristic;
        this.numWings = numWings;
        this.isExtinct = isExtinct;
        this.foodDescription = "DEFAULT FOOD DESCRIPTION";
        this.name = name;
        this.ID = ID;
    }

    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic) {
        this(birdType, favoriteFoods, definingCharacteristic, DEFAULT_NUM_WINGS, DEFAULT_EXTINCTION_STATUS, DEFAULT_NAME, DEFAULT_ID);
    }
    public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, int numWings, boolean isExtinct){
        this(birdType, favoriteFoods, definingCharacteristic, numWings, isExtinct, DEFAULT_NAME, DEFAULT_ID);
    }
    //public GenericBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, boolean isExtinct) {
    //    this(birdType, favoriteFoods, definingCharacteristic, DEFAULT_NUM_WINGS, isExtinct, DEFAULT_NAME, DEFAULT_ID);
    //}

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

    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(IBird other) {
        return name.compareTo(other.getName());
    }

}
