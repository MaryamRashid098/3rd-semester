import java.util.Random;

public class Player {
    private String name, ID;
    private int score;
    private boolean isReady;

    public Player(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.score = 0;
        this.isReady = false;
    }

    public void takeTurn(){
        Random random = new Random();
        int currpoint = random.nextInt(0,10);

        score += currpoint;
        System.out.println(name + " took their turn. They scored "+currpoint+" in this turn! ");
    }

    public String getName() {
        return name;
    }

    public boolean isReady() {
        return isReady;
    }

    public String getID() {
        return ID;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", score=" + score +
                ", isReady=" + isReady +
                '}';
    }
}
