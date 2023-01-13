import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client extends User{

    private ArrayList<Cards> handCards = new ArrayList<>();
    private String userName;
    private String passWord;


    public ArrayList<Cards> getHandCards() {
        return handCards;
    }

    public void setHandCards(ArrayList<Cards> handCards) {
        this.handCards = handCards;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
