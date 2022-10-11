package facilities;

import interfaces.IBird;

import java.util.*;

public class Aviary {
    private final int ID;
    private final String location;

    private List<IBird> birds;

    public Aviary(int ID, String location) {
        this.ID = ID;
        this.location = location;
    }
    public boolean assignBird(IBird bird) {
        // still have to check for wrong types
        if (bird.getExtinctionStatus() ||
            birds.size() > 4 ||
            !getBirdCompatibility(bird)) {
            return false;
        }
        birds.add(bird);
        return true;
    }

    public String printSign() { return "SIGN";}
    public boolean lookupBird(IBird bird) {
        // Is a given bird in this aviary?
        return true;
    }
    public String print() {
        return "AVIARY";
    }

    public int getID() {
        return ID;
    }

    public String getLocation() {
        return location;
    }

    public List<IBird> getBirds() {
        return birds;
    }
    /**
     * Right now this just returns true, but it will ultimately
     * check to see if this bird can be in an aviary with the
     * current population.
     * @return
     */
    private boolean getBirdCompatibility(IBird bird) {
        return true;
    }

}
