public class character{
    private String name;
    private String origin;

    private int hp;

    private int phy;
    private int intel;
    private int soc;

    // constructor

    public character(){
        this.name = "Gabriel Smith";
        this.origin = "Francais";

        this.hp = 18;

        this.phy = 14;
        this.intel = 14;
        this.soc = 14;
    }

    public character(String name, String origin, int hp, int phy, int intel, int soc){
        this.name = name;
        this.origin = origin;
        
        this.hp = hp;

        this.phy = phy;
        this.intel = intel;
        this.soc = soc;
    }

    // getter 

    public String getname(){
        return this.name;
    }

    public String getorigin(){
        return this.origin;
    }

    public int gethp(){
        return this.hp;
    }

    public int getphy(){
        return this.phy;
    }

    public int getintel(){
        return this.intel;
    }

    public int getsoc(){
        return this.soc;
    }

    // setter

    public void setname(String name){
        this.name = name;
    }

    public void setorigin(String origin){
        this.origin = origin;
    }

    public void sethp(int hp){
        this.hp = hp;
    }

    public void setphy(int phy){
        this.phy = phy;
    }

    public void setintel(int intel){
        this.intel = intel;
    }

    public void setsoc(int soc){
        this.soc = soc;
    }

    // Overrides

    public String toString(){
        return this.name + ";" + this.origin + ";" + this.hp + ";" + this.phy + ";" + this.intel + ";" + intel.soc;
    }

    public boolean equals(object o){
        if (o == null || o.getClass() != this.getClass()){
            return false;
        }
        character c = (character) o;
        return this.name == c.name && this.origin == c.origin && this.hp == c.hp && this.phy == c.phy && this.intel = c.intel && this.soc == c.soc;
    }

    public int hashcode(){
        return this.name.hashcode()*3 + this.origin.hashcode() + this.hp*5 + this.phy*7 +this.intel*11 + this.soc*13
    }

}