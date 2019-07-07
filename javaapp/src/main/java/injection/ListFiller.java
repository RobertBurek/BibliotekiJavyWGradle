package injection;


import com.google.inject.Inject;

/**
 * Created by Robert Burek
 */
public class ListFiller {

    @Inject
    private Repository repository;


    public void getUsers() {
        repository.getUsers();
        //przetworzenie users na format zgodny z listą użytkowników
    }
}

