import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> valToIndx;
    private List<Integer> vals;
    private Random rand;

    public RandomizedSet() {
        valToIndx = new HashMap<>();
        vals = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndx.containsKey(val)) return false;
        vals.add(val);
        valToIndx.put(val, vals.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndx.containsKey(val)) return false;
        int index = valToIndx.get(val);
        int lastElement = vals.get(vals.size() - 1);

        // Swap val with last element
        vals.set(index, lastElement);
        valToIndx.put(lastElement, index);

        // Remove the last element
        vals.remove(vals.size() - 1);
        valToIndx.remove(val);
        return true;
    }

    public int getRandom() {
        int index = rand.nextInt(vals.size());
        return vals.get(index);
    }
}
