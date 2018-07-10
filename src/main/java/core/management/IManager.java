package core.management;

import nu.xom.Element;

import java.util.Vector;

public interface IManager {

    void save(Vector<AConfiguration> configsToSave);
    Element parse(AConfiguration configsToParse);
    void requestData(IManager subsystemManager);
    AConfiguration getConfig(String elementName);
}
