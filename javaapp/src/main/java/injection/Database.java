package injection;

import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
public class Database implements Repository {

    @Override
    public void getUsers() {
        log.info("injected z Database");
    }
}

