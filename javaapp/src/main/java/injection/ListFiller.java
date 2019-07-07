package injection;

/**
 * Created by Robert Burek
 */
public class ListFiller {

    //Takim niby przeciwieństwem kompozycji jest dziedziczenie
    //czyli rozszeżenie klasy Database o właściwości klasy ListFiller,
    //tego na razie nie chcemy.

    //Kompozycja - klasa zawiera się w polu innej klasy
    private Database database;
    // To JEST ZALEŻNOść, naruszamy zasady:
    //  - SINGLE RESPOSIBILITY (pojedyńczej odpowiedzialność)
    //  - OPEN-CLOSE
    //  - DEPENDENCY INVERSION PRINCIBLE (odwrócenie zależności)

    // 1. dostarczamy Database poprzez konstruktor
    public ListFiller(Database database) {
        this.database = database;  // pojawia się pytanie skąd ktoś(użytkownik) weżmie Database?
    }

    // 2. możemy sami zainstancjonowaś Database poprzez jakiś (bezagumentowy) konstruktor


    public ListFiller() {
        this.database = new Database();//(host, login, hasło, key);  //ale teraz potrzebujemy innych rzeczy
    }

    public void getUser() {
        database.getUser();
        //przetworzenie users na format zgodny z listą użytkowników
    }
}

