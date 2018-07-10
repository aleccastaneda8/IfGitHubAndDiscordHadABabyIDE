package core.management;

import nu.xom.Element;

import java.io.Serializable;
import java.util.Vector;

public abstract class AConfiguration {

    public enum ConfigType {STYLE,VC,EDITOR,BUILD,COMM,DB}

    protected Serializable configKey;
    protected String projectName;
    protected String configTitle;
    protected ConfigType configType;
    protected boolean changed;

    public abstract void update(Vector chosenConfigs);
    public abstract void load(Element configFromStorage);
    public abstract ConfigType getType();
    public abstract boolean hasChanged();
}
