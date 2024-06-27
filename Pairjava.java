public class Pairjava<T, U> {
    private T one;
    private U two;

    public Pairjava(T one, U two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public U getTwo() {
        return two;
    }

    public void setTwo(U two) {
        this.two = two;
    }
    
    public Pairjava<U, T> reverse() {
        return new Pairjava<>(two, one);
    }

    @Override
    public String toString() {
        return "Pairjava{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }

    public static void main(String[] args) {
        Pairjava<String, Integer> pair = new Pairjava<>("Hello", 100);
        System.out.println("Original Pair: " + pair);

        Pairjava<Integer, String> reversedPair = pair.reverse();
        System.out.println("Reversed Pair: " + reversedPair);
    }
}
