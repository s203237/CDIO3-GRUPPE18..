import gui_fields.*;
import gui_main.GUI;

import java.awt.*;

public class Markfabrik {
    public static GUI_Field[] makeFields() {
        GUI_Field[] fields = new GUI_Field[24];
        int i = 0;
        int var2 = i + 1;
        fields[i] = new GUI_Start("Start", "Modtag: 2", "Modtag kr. 2,-\nnår de passerer start", Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Burgerbaren", "Pris:  1", "Burgerbaren", "Leje:  1", new Color(139, 69, 19), Color.BLACK);
        fields[var2++] = new GUI_Street("Pizzahuset", "Pris:  1", "Pizzahuset", "Leje:  1", new Color(139, 69, 19), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.",Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Slikbutikken", "Pris:  1", "Slikbutikken", "Leje:  1", new Color(0, 191, 255), Color.BLACK);
        fields[var2++] = new GUI_Street("Iskiosken", "Pris:  1", "Iskiosken", "Leje:  1", new Color(0, 191, 255), Color.BLACK);
        fields[var2++] = new GUI_Jail("default", "Fængsel", "Fængsel", "På besøg i fængslet", new Color(125, 125, 125), Color.BLACK);
        fields[var2++] = new GUI_Street("Museet", "Pris:  2", "Museet", "Leje:  2", new Color(255, 105, 180), Color.BLACK);
        fields[var2++] = new GUI_Street("Biblioteket", "Pris:  2", "Biblioteket", "Leje:  2", new Color(255, 105, 180), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.",Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Rullebretteparken", "Pris:  2", "Rullebretteparken", "Leje:  2", new Color(210, 105, 30), Color.BLACK);
        fields[var2++] = new GUI_Street("Svømmebassenget", "Pris:  2", "Svømmebassenget", "Leje:  2", new Color(210, 105, 30), Color.BLACK);
        fields[var2++] = new GUI_Refuge("default", "Gratis parkering", "Gratis parkering", "Gratis parkering", Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Spillehallen", "Pris:  3", "Spillehallen", "Leje:  3", new Color(255, 0, 0), Color.BLACK);
        fields[var2++] = new GUI_Street("Biografen", "Pris:  3", "Biografen", "Leje:  3", new Color(255, 0, 0), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.",Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Legetøjbutikken", "Pris:  3", "Legetøjbutikken", "Leje:  3", new Color(255, 255, 0), Color.BLACK);
        fields[var2++] = new GUI_Street("Dyrehandlen", "Pris:  3", "Dyrehandlen", "Leje:  3", new Color(255, 255, 0), Color.BLACK);
        fields[var2++] = new GUI_Jail("default", "Fængsel", "Fængsel", "Går i fængslet", new Color(125, 125, 125), Color.BLACK);
        fields[var2++] = new GUI_Street("Bowlinghallen", "Pris:  4", "Bowlinghallen", "Leje:  4", new Color(0, 250, 154), Color.BLACK);
        fields[var2++] = new GUI_Street("Zoologiskhave", "Pris:  4", "Zoologiskhave", "Leje:  4", new Color(0, 250, 154), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "Prøv lykken", "Ta' et chancekort.",Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Vandlander", "Pris:  5", "Vandlander", "Leje:  5", new Color(0, 0, 205), Color.BLACK);
        fields[var2++] = new GUI_Street("Strandpromenaden", "Pris:  5", "Strandpromenaden", "Leje:  5", new Color(0, 0, 205), Color.BLACK);

        return fields;
    }

}

