class LFUCache {

    class Node {
        int key, val, freq;
        Node(int k, int v) {
            key = k;
            val = v;
            freq = 1;
        }
    }

    int capacity, minFreq;
    Map<Integer, Node> keyToNode;
    Map<Integer, LinkedHashSet<Integer>> freqToKeys;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyToNode = new HashMap<>();
        this.freqToKeys = new HashMap<>();
    }

    public int get(int key) {
        if (!keyToNode.containsKey(key)) return -1;

        Node node = keyToNode.get(key);
        updateFreq(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.val = value;
            updateFreq(node);
        } else {
            if (keyToNode.size() >= capacity) {
                // Evict LRU from minFreq list
                LinkedHashSet<Integer> minList = freqToKeys.get(minFreq);
                int evictKey = minList.iterator().next();
                minList.remove(evictKey);
                if (minList.isEmpty()) freqToKeys.remove(minFreq);
                keyToNode.remove(evictKey);
            }

            Node newNode = new Node(key, value);
            keyToNode.put(key, newNode);
            freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFreq = 1;
        }
    }

    private void updateFreq(Node node) {
        int oldFreq = node.freq;
        LinkedHashSet<Integer> oldList = freqToKeys.get(oldFreq);
        oldList.remove(node.key);

        if (oldList.isEmpty()) {
            freqToKeys.remove(oldFreq);
            if (minFreq == oldFreq) minFreq++;
        }

        node.freq++;
        freqToKeys.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node.key);
    }
}


/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */