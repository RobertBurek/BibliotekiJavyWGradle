import com.google.inject.Guice;
import com.google.inject.Injector;
import injection.ListFiller;
import injection.injectmodule.RepositoryModule;
import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) throws Exception {

        Injector injector = Guice.createInjector(new RepositoryModule());

        //1.
        injector.getInstance(ListFiller.class).getUsers();

        //2.
        ListFiller listFiller = new ListFiller();
        injector.injectMembers(listFiller);
        listFiller.getUsers();

    }
}
