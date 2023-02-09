package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void fight() {
        if (checkWeight()) {
            if (isFirst()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("====YENİ ROUND====");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println("-----------------------------");
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("====YENİ ROUND====");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println("------------------------------");
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            }
        } else {
            System.out.println("Dövüşçülerin sikletleri bu müsabakaya uygun değil !");
        }

    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }

    boolean isFirst() {
        double random = Math.random();
        if (random <= 0.5) {
            // System.out.println("Random : " + random);
            return true;
        }
        // System.out.println("Random : " + random);
        return false;
    }
}