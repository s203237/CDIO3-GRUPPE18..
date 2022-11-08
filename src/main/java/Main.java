import gui_fields.GUI_Field;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_tests.TestRunExampleGame;

public class Main {
    public static void main(String[]args){
        realExampleGame();

    }
    private static void realExampleGame() {
        GUI_Player mn = new GUI_Player("Mads", 30000);
        GUI_Player sh = new GUI_Player("Stig", 30000);
        GUI gui = new GUI(Markfabrik.makeFields());
        sleep();
        gui.addPlayer(mn);
        sleep();
        gui.addPlayer(sh);
        sleep();
        gui.getFields()[0].setCar(mn, true);
        sleep();
        gui.getFields()[0].setCar(sh, true);
        sleep();
        gui.setDice(4,2);
        sleep();
        GUI_Field[] var3 = gui.getFields();
        int var4 = var3.length;

        int var5;
        GUI_Field f;
        for(var5 = 0; var5 < var4; ++var5) {
            f = var3[var5];
            f.setCar(mn, false);
        }

        gui.getFields()[1].setCar(mn, true);
        sleep();
        var3 = gui.getFields();
        var4 = var3.length;

        for(var5 = 0; var5 < var4; ++var5) {
            f = var3[var5];
            f.setCar(mn, false);
        }

        gui.getFields()[2].setCar(mn, true);
        sleep();
        var3 = gui.getFields();
        var4 = var3.length;

        for(var5 = 0; var5 < var4; ++var5) {
            f = var3[var5];
            f.setCar(mn, false);
        }

        gui.getFields()[3].setCar(mn, true);
        sleep();
        mn.setBalance(28000);
         f = gui.getFields()[3];
        if (f instanceof GUI_Ownable) {
            GUI_Ownable o = (GUI_Ownable)f;
            o.setBorder(mn.getPrimaryColor(), mn.getSecondaryColor());
        }

        sleep();
        gui.displayChanceCard("De har vundet vild med dans og skifter navn til Allan!");
    }

    public static void sleep() {
        sleep(1200);
    }

    public static void sleep(int n) {
        long t0 = System.currentTimeMillis();

        long t1;
        do {
            t1 = System.currentTimeMillis();
        } while(t1 - t0 < (long)n);

    }
}
