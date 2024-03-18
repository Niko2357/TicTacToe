import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    protected ArrayList<User> users = new ArrayList<>();

    public void start() throws Exception{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, let's play Tic Tac Toe!");
            boolean rep = true;
            while (rep) {
                System.out.println("Did you play before and would you like to continue? (y, n)");
                String answ = sc.next();
                if (answ.toLowerCase().equals("y")) {
                    System.out.println("What's your name?");
                    String name = sc.next();
                    loadUser(name);
                    rep = false;
                } else if (answ.toLowerCase().equals("n")) {
                    System.out.println("What's your name?");
                    String name = sc.next();
                    User user = new User(name, 0, 0);
                    rep = false;
                } else {
                    System.out.println("What? What do you mean?");
                }
            }
            System.out.println("How many games would you like to play?");
            int numberOfGames = sc.nextInt();
        }catch(Exception e){
            System.out.println("Your input was wrong or we couldn't find this player.");
        }
    }

    public User loadUser(String name){
        return users.get(users.indexOf(name));
    }
}
