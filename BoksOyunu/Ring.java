package BoksOyunu;

public class Ring {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",125,10,100,40);
        Fighter f2 = new Fighter("B",105,15,90,30);

        Match match = new Match(f1,f2,80,100);
        match.fight();
    }
}
