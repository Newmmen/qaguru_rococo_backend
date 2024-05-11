package rococo.jupiter;

import jakarta.persistence.EntityManagerFactory;
import rococo.db.EmfProvider;

public class EmfExtension implements SuiteExtension {

    @Override
    public void afterSuite() {
        EmfProvider.INSTANCE.storedEmf().forEach(
                EntityManagerFactory::close
        );
    }
}
