import java.util.ArrayList;
import java.util.Scanner;

public class ManageApp {
       Scanner sc = new Scanner(System.in);
       private int playersNumber;
       private ArrayList<Robots> players = new ArrayList<>();

       public int getPlayersNumber() {
              return playersNumber;
       }

       public void setPlayersNumber(int playersNumber) {
              this.playersNumber = playersNumber;
       }

       public ArrayList<Robots> getPlayers() {
              return players;
       }

       public void setPlayers(ArrayList<Robots> players) {
              this.players = players;
       }

       public void mainManageApp (){


              choose_number_of_player();// گرفتن تعداد بازیکن ها
              creat_obj_players(playersNumber);// ساخت object ب تعداد بازیکن ها
              GameContextBuilderService gameContextBuilderService = new GameContextBuilderService();
              Bank bank = new Bank();
              gameContextBuilderService.creat_and_add_obj_cards_to_allArray(bank);// ساخت کارت ها
              Client client = new Client();
              gameContextBuilderService.divide_cards(players, client, bank);//پر کردن دسته کارت های بازیکنان
              gameContextBuilderService.choose_starter_card(bank);
              gameContextBuilderService.creat_bank(bank);


                   /*
                   Cards ob = bank.allCards.get(item);
                   if(ob instanceof MoveCard){
                            ob = (MoveCard)ob;
                            System.out.println(ob.getColor());
                            System.out.println(((MoveCard) ob).getType());
                     } else if(ob instanceof WildCard){
                            ob = (WildCard)ob;
                            System.out.println();
                     }  else if(ob instanceof NormalCard) {
                            ob = (NormalCard) ob;

                     }*/
       }
       private void choose_number_of_player() {
              System.out.println("Enter number of players = ");
              playersNumber = sc.nextInt();
       }


              //ساختن object ها از بازیکن ها
       public void creat_obj_players(int playersNumber) {

              for (int item = 1; item < playersNumber; item++) {
                     Robots sampleRobot = new Robots();
                     players.add(sampleRobot);
              }


       }

}
