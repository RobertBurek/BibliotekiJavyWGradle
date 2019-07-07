package injection;


import com.google.inject.AbstractModule;

/**
 * Created by Robert Burek
 */
public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Repository.class).to(Database.class);
    }

}
