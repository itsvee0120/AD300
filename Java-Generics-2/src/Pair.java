public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public void setKey(K Key){
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }

    // toString method to display the pair
    @Override
    public String toString() {
        return "Pair{" + "Key=" + key + ", Value=" + value + '}';
    }
}
