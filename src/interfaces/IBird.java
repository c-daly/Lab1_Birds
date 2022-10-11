package interfaces;

import enums.FoodType;

import java.util.List;

public interface IBird extends Comparable<IBird> {
    String getDefiningCharacteristic();
    String getBirdType();
    String getFoodDescription();
    List<FoodType> getFavoriteFoods();
    boolean getExtinctionStatus();
    int getNumberOfWings();

    // Birds that haven't yet been rescued
    // wouldn't normally be thought to have
    // a name or ID, but I'm assuming a given
    // bird has been instantiated because the
    // conservatory is interacting with it in
    // some way, even if it's not yet been rescued.
    // For that reason, it doesn't seem inappropriate
    // to have those fields on this type.
    String getName();
    int getID();
}
