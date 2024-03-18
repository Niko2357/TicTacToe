public class User {
    protected String name;
    protected int winGames;
    protected int lostGames;


    public User(String name, int winGames, int lostGames) {
        this.name = name;
        this.winGames = winGames;
        this.lostGames = lostGames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinGames() {
        return winGames;
    }

    public void setWinGames(int winGames) {
        this.winGames = winGames;
    }

    public int getLostGames() {
        return lostGames;
    }

    public void setLostGames(int lostGames) {
        this.lostGames = lostGames;
    }
}
