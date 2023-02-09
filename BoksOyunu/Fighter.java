package BoksOyunu;

public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    int dodge;

    Fighter(String name, int health, int damage, int weight, int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        if(this.dodge >=0&& this.dodge<=0){
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe) {
        System.out.println(this.name + ", " + foe.name + " adlı dövüşçüye " + this.damage + " kadar hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı !");
            return foe.health;
        }

        if ((foe.health - this.damage) < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber= Math.random()* 100.0;
        return this.dodge >= randomNumber;
    }
}
