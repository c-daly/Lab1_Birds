package facilities;

import enums.FoodType;
import interfaces.IBird;

import java.util.*;

public class Conservatory {
    private final List<Aviary> aviaries;
    private HashMap<FoodType, Integer> foodReqs;

    public void rescueBird(IBird bird) {
        // Seems like there should be some form of intake, but since
        // that's not specified, just see if we can fit the bird in
        // an aviary.
        if (assignBird(bird)) {
            System.out.println("Bird rescued");
        } else {
            System.out.println("Conservatory has no space to rescue bird");
        }
    }
    /* We're just going to go through all the aviaries and
       try to assign the bird to it.  Pure brute force, start
       at the beginning and keep trying until one can take the
       bird, or we reach the end of the list.
     */
    public boolean assignBird(IBird bird) {
        for (Aviary aviary : aviaries) {
            if (aviary.assignBird(bird)) {
                updateFoodReqs(bird);
                return true;
            }
            // We didn't find an aviary this iteration
        }
        // We didn't find an aviary at all
        if (aviaries.size() < 20) {
            // create new aviary here and assign bird
            String location = String.format("AVIARY LOCATION %d", aviaries.size());
            Aviary new_aviary = new Aviary(aviaries.size(), location);
            aviaries.add(new_aviary);
            new_aviary.assignBird(bird);
        }
        return false;
    }

    /* Just print the calculated food requirements by FoodType units.
       Each FoodType unit equals one meal's worth of that food.
     */
    public String calculateNecessaryFood() {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<FoodType, Integer> entry : foodReqs.entrySet()) {
            FoodType key = entry.getKey();
            int val = entry.getValue();
            String outputLine = String.format("%d meal units of %s are required\n", val, key.name());
            output.append(outputLine);
        }

        return output.toString();
    }
    public int birdLookup(IBird bird) {
        for (Aviary aviary : aviaries) {
            if (aviary.lookupBird(bird)) {
                // should return aviary bird is in
                return 1;
            }
        }
        // bird not found
        return -1;
    }
    public String printMap() {
        StringBuilder sb = new StringBuilder();
        for (Aviary aviary : aviaries) {
           sb.append(String.format("Aviary %d at location %s", aviary.getID(), aviary.getLocation()));
        }

        return sb.toString();
    }
    public String printBirdIndex() {
        List<IBird> birds = new ArrayList<>();
        for (Aviary aviary : aviaries) {
            birds.addAll(aviary.getBirds());

        }
        Collections.sort(birds);
        return birds.toString();
    }

    public Conservatory() {
        aviaries = new ArrayList<>();
    }

    /** Really struggled with how best to keep track of food until
     *  I realized there's no need to keep track of it at the aviary
     *  level, since all birds are assigned through the conservatory.
     *  Each time a bird is assigned, the master food list is updated.
     *  If we were to ever remove birds, we would have to decrement
     *  quantities, but that's not currently in scope.
     * @param bird
     */
    private void updateFoodReqs(IBird bird) {
        for (FoodType food : bird.getFavoriteFoods()) {
            foodReqs.merge(food, 1, Integer::sum);
        }
    }
}
