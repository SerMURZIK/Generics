public class Main {

    public static void main(String[] args) {
        MagicBox<Integer> mg = new MagicBox<Integer>(3);

        mg.add(5);
        mg.add(1);

        mg.pick();
    }
}
