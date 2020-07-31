package novi.basics;

public class Player {

    //attributen: informatie verzamelen
    private String name;
    private int score;

    //methoden: acties die de speler uit kan voeren
    //constructor
    public Player(String name) {
        this.name = name;
        score = 0;
    }

    //get methoden
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

}
