import java.util.List;
import java.util.ArrayList;

public class room {
    private room east; // base null
    private room north;
    private room west;
    private room south;
    private List<playable_character> playerin; // List of player inside this room

    private boolean statue; // Modify all to make it fit

    //#region Constructor

    public room(){
        this.east = null;
        this.north = null;
        this.west = null;
        this.south = null;
        this.playerin = new ArrayList<playable_character>();
    }

    public room(room east, room north, room west , room south, List<playable_character> playerin){
        this.east = east;
        this.north = north;
        this.west = west;
        this.south = south;
        this.playerin = playerin;
    }

    //#endregion

    //#region Getter

    public room geteast(){
        return this.east;
    }

    public room getnorth(){
        return this.north;
    }

    public room getwest(){
        return this.west;
    }

    public room getsouth(){
        return this.south;
    }

    public List<playable_character> getplayerin(){
        return this.playerin;
    }

    //#endregion

    //#region Setter

    public void seteast(room east) {
        this.east = east;
    }

    public void setnorth(room north) {
        this.north = north;
    }

    public void setwest(room west) {
        this.west = west;
    }

    public void setsouth(room south) {
        this.south = south;
    }

    public void setplayerin(List<playable_character> playerin){
        this.playerin = playerin;
    }

    //#endregion

    //#region Methods

    public List<room> getnext(){
        List<room> next = new ArrayList<room>();
        next.add(this.east);
        next.add(this.north);
        next.add(this.south);
        next.add(this.south);
        return next;
    }

    public void addplayer(playable_character c){
        this.playerin.add(c);
    }

    public void removeplayer(playable_character c){
        this.playerin.remove(c);
    }

    public void move(playable_character c, room next_room){
        this.removeplayer(c);
        next_room.addplayer(c);
    }

    //#endregion

    //#region Override

    //#endregion

}
