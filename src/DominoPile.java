import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class DominoPile {
    // Properties
    ArrayList<Domino> pile = new ArrayList();

    // Constructors
    public DominoPile() {
        pile.clear();
    }

    // Methods
    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        pile.clear();

        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pile);
    }
}
