import java.util.ArrayList;
import java.util.Random;

public class playable_character extends character {

    private String player;

    // #region Constrctor

    public playable_character() {
        super();
        this.player = "Smith";
    }

    public playable_character(String name, String origin, int hp, int phy, int intel, int soc, ArrayList<items> inv, String player) {
        super(name, origin, hp, phy, intel, soc, inv);
        this.player = player;
    }

    // #endregion

    // #region Getter

    public String getplayer() {
        return this.player;
    }

    // #endregion

    // #region Setter

    public void setplayer(String player) {
        this.player = player;
    }

    // #endregion

    // #region Methods

    public void combat_action(adverse c) { // can be to hit or to heal, base => hit
        Random rand = new Random();
        // La méthode pêut potentiellement être changer dans le futur donc j'utilise var
        // car ça permet de ne pas avoir a changer toute les variables.
        // ce n'est pas forcément utile ici mais ça ne coute rien

        var roll = this.getphy() + (rand.nextInt(20) - 9); // rand.nextInt(bound:20) renvoie un nombre entre 0 et 19
                                                           // donc je soustrait par 9 à la place de 10
        if (roll >= 10) {
            this.kill(c);
        } else {
            this.gethit((10 - roll), c);
        }
    }

    public void kill(adverse c) {
        c.sethp(0);
        System.out.println("Congratulation you killed a " + c.getctype() + " threat level " + c.getthreat());
    }

    public void gethit(int dmg, adverse c) {
        this.sethp(this.gethp() - dmg);
        System.out.println("You've been hit by " /* a smooth criminal */ + c.getctype() + " you lost " + dmg + " HP");
    }

    public void rest() {
        Random rand = new Random();
        var heal = rand.nextInt(6) + rand.nextInt(6);
        var act_hp = this.gethp();
        var max_hp = this.getmax_hp();
        if (act_hp + heal < max_hp) {
            this.sethp(gethp() + heal);
            System.out.println("You recovered " + heal + " HP");
        } else {
            this.sethp(gethp() + heal);
            System.out.println("You recovered all your health.");
        }
    }

    // #endregion

    // #region Override

    public String toString() {
        return super.toString() + ";" + this.player;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        playable_character c = (playable_character) o;
        return super.equals(c) && this.player == c.getplayer();
    }

    public int hashCode() {
        return super.hashCode() + this.player.hashCode() * 17;
    }

    // #endregion

}