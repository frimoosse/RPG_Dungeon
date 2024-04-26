import java.util.ArrayList;

public class character {

    // #region Attribut

    private String name;
    private String origin;

    private int hp;
    private int max_hp;

    private int phy;
    private int intel;
    private int soc;

    private ArrayList<items> inventory;

    // #endregion

    // #region Constructor

    public character() {
        this.name = "Gabriel Smith";
        this.origin = "Francais";

        this.hp = 18;

        this.phy = 14;
        this.intel = 14;
        this.soc = 14;

        this.inventory = new ArrayList<items>();
    }

    public character(String name, String origin, int hp, int phy, int intel, int soc, ArrayList<items> inv) {
        this.name = name;
        this.origin = origin;

        this.max_hp = hp;
        this.hp = hp;

        this.phy = phy;
        this.intel = intel;
        this.soc = soc;

        this.inventory = inv;
    }

    // #endregion

    // #region Getter
    public String getname() {
        return this.name;
    }

    public String getorigin() {
        return this.origin;
    }

    public int getmax_hp() {
        return this.max_hp;
    }

    public int gethp() {
        return this.hp;
    }

    public int getphy() {
        return this.phy;
    }

    public int getintel() {
        return this.intel;
    }

    public int getsoc() {
        return this.soc;
    }

    public ArrayList<items> getinv(){
        return this.inventory;
    }
    // #endregion

    // #region Setter

    public void setname(String name) {
        this.name = name;
    }

    public void setorigin(String origin) {
        this.origin = origin;
    }

    public void setmax_hp(int max_hp) {
        this.max_hp = max_hp;
    }

    public void sethp(int hp) {
        this.hp = hp;
    }

    public void setphy(int phy) {
        this.phy = phy;
    }

    public void setintel(int intel) {
        this.intel = intel;
    }

    public void setsoc(int soc) {
        this.soc = soc;
    }

    public void setinv(ArrayList<items> inv){
        this.inventory = inv;
    }
    // #endregion

    // #region Overrides

    public String toString() {
        return this.name + ";" + this.origin + ";" + this.hp + ";" + this.max_hp + ";" + this.phy + ";" + this.intel
                + ";" + this.soc;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        character c = (character) o;
        return this.name == c.name && this.origin == c.origin && this.hp == c.hp && this.phy == c.phy
                && this.intel == c.intel && this.soc == c.soc && this.max_hp == c.max_hp;
    }

    public int hashCode() {
        return this.name.hashCode() * 3 + this.origin.hashCode() + this.hp * 5 + this.phy * 7 + this.intel * 11
                + this.soc * 13 + this.max_hp * 31;
    }

    // #endregion

    // #region Methods

    // #endregion
}