package laskin;

public class Sovelluslogiikka {
 
    private int tulos;
    private int arvoEnnen;
 
    public void plus(int luku) {
        tulos += luku;
    }
     
    public void miinus(int luku) {
        tulos -= luku;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }

    public void undo() {tulos = arvoEnnen;}

    public void tallennaArvo() {arvoEnnen = tulos;}
}