public class Player {
    public static int total;
    public static String[] playerArray = new String[11];
    public String playerName;
    public String country;
    public int jerseyNum;

    public Player(String s1, String s2, int n) {
        if (total <= 11) {
            playerName = s1;
            country = s2;
            jerseyNum = n;
            playerArray[total] = playerName;
            total++;
        }
    }

    public String player_detail() {
        return "Player Name: " + playerName + "\nJersey Number: " + jerseyNum + "\nCountry: " + country;
    }

    public static void info() {
        System.out.println("Total number of players: " + total);
        System.out.print("Player enlisted so far: ");
        for (int i = 0; i < total; i++) {
            if(i == total-1){
                System.out.println(playerArray[i]);
            }
            else{
                System.out.print(playerArray[i] + ", ");
            }
        }
    }
}