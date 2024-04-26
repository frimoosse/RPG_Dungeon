import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class items implements Serializable{

    private rarity rare;
    private String name;
    private int phy_boost;
    private int intel_boost;
    private int soc_boost;

    //#region Cosntructor

    public items(){
        this.rare = rarity.COMMON;
        this.name = "wooden_stick";

        this.phy_boost = 0;
        this.intel_boost = 0;
        this.soc_boost = 0;
    }

    public items(rarity rare, String name, int phy, int intel, int soc){
        this.rare = rare;
        this.name = name;

        this.phy_boost = phy;
        this.intel_boost = intel;
        this.soc_boost = soc;
    }

    //#endregion

    //#region Getter

    public rarity getrare(){
        return this.rare;
    }

    public String getname(){
        return this.name;
    }

    public int getphy_boost(){
        return this.phy_boost;
    }

    public int getintel_boost(){
        return this.intel_boost;
    }

    public int getsoc_boost(){
        return this.soc_boost;
    }

    //#endregion

    //#region Setter

    public void setrare(rarity rare){
        this.rare = rare;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setphy_boost(int phy_boost){
        this.phy_boost = phy_boost;
    }

    public void setintel_boost(int intel_boost){
        this.intel_boost = intel_boost;
    }

    public void setsoc_boost(int soc_boost){
        this.soc_boost = soc_boost;
    }


    //#endregion

    //#region Methods

    public void equip(character c){
        c.setphy(c.getphy() + this.phy_boost);
        c.setintel(c.getintel() + this.intel_boost);
        c.setsoc(c.getsoc() + this.soc_boost);
    }

    //for now, all item will be equip permanently

    public void unequip(character c){
        c.setphy(c.getphy() - this.phy_boost);
        c.setintel(c.getintel() - this.intel_boost);
        c.setsoc(c.getsoc() - this.soc_boost);
    }

    public void saveitem(){
        try {
            if (this.rare == rarity.EPIC || this.rare == rarity.LEGENDARY) {
                try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("legendary_epic.txt", true))) {
                    writer.writeObject(this);
                }
            } else {
                try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("common2Urare.txt", true))) {
                    writer.writeObject(this);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    //#endregion

    //#region Override

    public String toString() {
        return this.rare + this.name;
    }

    //#endregion
    
}
