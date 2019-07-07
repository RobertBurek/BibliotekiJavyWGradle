package injection;

/**
 * Created by Robert Burek
 */

//Kontener wstrzykiwania(zalażności)
public class MarketBudowlany {

    private WiazkaSlupkow wiazka;

    public WiazkaSlupkow getWiazkaSlupkow() {
        if (wiazka != null) {
            return wiazka;
        } else {
            wiazka = new WiazkaSlupkow(...);
            return wiazka;
        }
    }

    public void PaniSprzedawca(){
        if (Altana){
            return WiazkaSlupkowOzdobnych;
        }
        if (Szalunki){
            return WiazkaSlupkowStruktur;
        }
    }
}
