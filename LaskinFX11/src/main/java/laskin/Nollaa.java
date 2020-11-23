package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa implements Komento{
    private TextField tuloskentta;
    private TextField syotekentta;
    private Button nollaa;
    private Button undo;
    private Sovelluslogiikka sovellus;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void peru() {
        sovellus.undo();
        tuloskentta.setText(sovellus.tulos() + "");
    }

    @Override
    public void suorita() {
        sovellus.tallennaArvo();
        sovellus.nollaa();
        tuloskentta.setText(sovellus.tulos() + "");
    }
}
