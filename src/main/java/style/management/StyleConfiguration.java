package style.management;
import core.management.AConfiguration;
import nu.xom.Element;

import java.util.Vector;
public class StyleConfiguration extends AConfiguration {

    @Override
    public void update(Vector chosenConfigs) {
    }

    @Override
    public void load(Element configFromStorage) {
    }

    @Override
    public ConfigType getType() {
        return null;
    }

    @Override
    public boolean hasChanged() {
        return false;
    }
}
