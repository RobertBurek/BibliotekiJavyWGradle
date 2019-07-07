package injection.injectmodule;


import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import injection.Repository;

/**
 * Created by Robert Burek
 */
public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("DB_URL")).toInstance("localhost");
        bind(Repository.class).toProvider(DatabaseProvider.class);
    }


}
