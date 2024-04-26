import java.util.ArrayList;

public class adverse extends character {

    private int threat;
    private String ctype;

    // #region Constructor

    public adverse() {
        super();
        this.threat = 0;
        this.ctype = "enemy";
    }

    public adverse(String name, String origin, int hp, int phy, int intel, int soc, ArrayList<items> inv, int threat, String ectype) {
        super(name, origin, hp, phy, intel, soc, inv);
        this.threat = threat;
        this.ctype = ectype;
    }

    // #endregion

    // #region Getter

    public String getctype() {
        return this.ctype;
    }

    public int getthreat() {
        return this.threat;
    }

    // #endregion

    // #region Setter

    public void setctype(String ctype) {
        this.ctype = ctype;
    }

    public void setthreat(int threat) {
        this.threat = threat;
    }

    // #endregion

    // #region Override

    public String toString() {
        return super.toString() + ";" + this.ctype + ";" + this.threat;
    }

    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        adverse c = (adverse) o;
        return super.equals(c) && this.threat == c.threat && this.ctype == c.ctype;
    }

    public int hashCode() {
        return super.hashCode() + this.threat * 17 + this.ctype.hashCode() * 19;
    }

    // #endregion
}
