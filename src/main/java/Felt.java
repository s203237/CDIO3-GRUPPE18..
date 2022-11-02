import gui_main.GUI;

public class Felt {
    int tal;
    char bogstav;
    String tekst;

    public Felt(int x, char y, String z) {
        tal = x;
        bogstav = y;
        tekst = z;
    }


}

class Test {
    public static void main(String[] args) {
        Felt[] tabel = new Felt[11];

        tabel[1] = new Felt(2, 'b', "test");

     /**
       begren( tabel[10].tal);
      **/
    }
}

