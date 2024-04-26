import java.util.ArrayList;
import java.util.Scanner;

public class main_item_creation {
    public static void main(String[] args){
        int item_creation = 0;
        Scanner scan = new Scanner(System.in);

        while(item_creation == 0){

        System.out.println("rarity");
        int choice = scan.nextInt();
        rarity rare;
        switch (choice) {
            case 1:
                rare = rarity.COMMON;
                break;
            case 2:
                rare = rarity.RARE;
                break;
            case 3:
                rare = rarity.SRARE;
                break;
            case 4:
                rare = rarity.URARE;
                break;
            case 5:
                rare = rarity.EPIC;
                break;
            case 6:
                rare = rarity.LEGENDARY;
                break;
            default:
                rare = rarity.COMMON;
                break;
        }
        scan.nextLine();

        System.out.println("name");
        String name = scan.nextLine();

        System.out.println("phy_boost");
        int phy = scan.nextInt();

        System.out.println("intel_boost");
        int intel = scan.nextInt();

        System.out.println("soc_boost");
        int soc = scan.nextInt();

        items item = new items(rare, name, phy, intel, soc);
        item.saveitem();

        System.out.println("continue?");
        item_creation = scan.nextInt();
    }

    scan.close();

    load loader = new load();
    ArrayList<items> scanned = loader.loadItems("legendary_epic.txt");

    System.out.println(scanned);
}
}
