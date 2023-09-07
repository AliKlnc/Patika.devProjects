public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Rocky Balboa", 15, 100, 100, 30);
        Fighter f2 = new Fighter("Apollo Creed", 10, 100, 100,40);

        Match match = new Match(f1,f2,90,105);
        match.run();
    }
}