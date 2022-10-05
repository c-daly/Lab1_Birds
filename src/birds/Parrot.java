package birds;

import birds.base.SpeakingBird;
import enums.FoodType;

import java.util.List;

public class Parrot extends SpeakingBird {
    public Parrot(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, List<String> vocabulary, String favoritePhrase) {
     super(birdType, favoriteFoods, definingCharacteristic, vocabulary, favoritePhrase);
    }
}
