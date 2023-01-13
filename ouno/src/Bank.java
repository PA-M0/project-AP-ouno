import java.util.ArrayList;

public class Bank {

    private ArrayList<Cards> allCards = new ArrayList<>();
    private ArrayList<Cards> remainCards = new ArrayList<>();
    private ArrayList<Cards> lostCards = new ArrayList<>();


    public ArrayList<Cards> getLostCards() {
        return lostCards;
    }

    public void setLostCards(ArrayList<Cards> baseCards) {
        this.lostCards = baseCards;
    }

    public ArrayList<Cards> getRemainCards() {
        return remainCards;
    }

    public ArrayList<Cards> getAllCards() {
        return allCards;
    }

    public void setAllCards(ArrayList<Cards> allCards) {
        this.allCards = allCards;
    }

    public ArrayList<Cards> getRemainCards(Cards item) {
        return remainCards;
    }

    public void setRemainCards(ArrayList<Cards> remainCards) {
        this.remainCards = remainCards;
    }
}
