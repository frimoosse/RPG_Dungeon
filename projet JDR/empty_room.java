import java.util.ArrayList;

public class empty_room extends room {

    //#region Methods

    public void room_effect(ArrayList<playable_character> players){
        System.out.println("This room is empty, do you want to rest? (0 : y, 1 : n)");
        // mettre un scanner
        int choice = 0;
        if (choice == 0){
            for (playable_character c : players){
            c.rest();
            }
        } else {
            System.out.println("You decide not to rest, farewell traverlers");
        }
    }

    //#endregion
}
