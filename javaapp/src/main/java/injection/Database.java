package injection;

import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
public class Database implements Repository {

    private String host;

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void getUsers() {
        log.info("injected z Database a host: " + host);
        log.info(toString());
    }
}

