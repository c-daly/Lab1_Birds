package birds.base;

import enums.FoodType;
import interfaces.ISpeakingBird;

import java.util.List;

public abstract class SpeakingBird extends GenericBird implements ISpeakingBird {
    private final List<String> vocabulary;
    private final String favoritePhrase;

    public List<String> getVocabulary() {
        return vocabulary;
    }

    public String getFavoritePhrase() {
        return favoritePhrase;
    }

    public SpeakingBird(String birdType, List<FoodType> favoriteFoods, String definingCharacteristic, List<String> vocabulary, String favoritePhrase) {
        super(birdType, favoriteFoods, definingCharacteristic);
        this.vocabulary = vocabulary;
        this.favoritePhrase = favoritePhrase;
    }
}
