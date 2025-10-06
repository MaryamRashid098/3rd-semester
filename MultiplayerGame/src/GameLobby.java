public class GameLobby {
    Node current;

    public void addPlayer(Player player){
        Node newPlayer = new Node(player);

        if(current==null){
            newPlayer.next = newPlayer;
            current=newPlayer;
        }
        Node temp = current;
        while(temp.next!=current){
            temp = temp.next;
        }
        temp.next = newPlayer;
        newPlayer.next =current;
    }

    public void removePlayer(String playerID){
            if(current==null){
                System.out.println("lobby is empty!");
                return;
        }
            Node temp = current;
            Node prev = null;

        while(true) {
            if (temp.player.getID().equals(playerID)) {
                //temp didnt move - curr player is being remooved
                if (prev == null) {
                    if (temp.next == temp) {
                        current = null;    //there was only one player in lobby so we delete it
                    } else {
                        Node last = current;    //temp and curr is head(first element)
                        while (last.next != current) {  //search for last node
                            last = last.next;
                        }
                        current = current.next;        //delete first node
                        last.next = current;

                    }
                } else {
                    prev.next = temp.next;   //removing element somewhere in middle of list
                }
                System.out.println("player "+playerID+ " removed from lobby.");
                return;

            } else {               // if ID didn't match
                prev = temp;
                temp = temp.next;
            }

            if(temp==current)  {
                break;// list cirlces backs so loop ends
            }
        }
        System.out.println("player not found in list!");
    }

        public void startGame(){
            if(current==null){
                System.out.println("no players in lobby!");
            }

            Node temp = current;

            while(true){

                temp.player.setReady(true);
                temp = temp.next;

                if (temp==current){
                break; }
            }
        }

        public Player executeTurn(){
            if (current == null) {
                System.out.println("no players in the lobby!");
                return null;
            }
        current.player.takeTurn();
        Node p = current;
        current=current.next;
        return p.player;
    }

    public void displayLobby(){
        if(current==null){
            throw new IllegalStateException("lobby empty!");
        }
        Node temp = current;
        while(true){
            System.out.println(temp.player.toString());
            temp = temp.next;

            if(temp==current)
                break;
        }
    }


}
