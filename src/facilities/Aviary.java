package facilities;

import interfaces.IBird;

import java.util.*;

public class Aviary {
    private List<IBird> birds;

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
