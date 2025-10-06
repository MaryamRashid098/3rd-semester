//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameLobby lobby = new GameLobby();

        Player p1 = new Player("maryam","50");
        Player p2 = new Player("minahil","53");
        Player p3 = new Player("wassam","131");
        Player p4 = new Player("cainoosh","29");
        Player p5 = new Player("ibrahim","71");

        lobby.addPlayer(p1);
        lobby.addPlayer(p2);
        lobby.addPlayer(p3);
        lobby.addPlayer(p4);
        lobby.addPlayer(p5);

   /*     try {
            lobby.displayLobby();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } */

        lobby.startGame();

        for(int i=0;i<10;i++){
            lobby.executeTurn();
            if(i==4) {
                lobby.removePlayer("71");
            }
        }





    }
}