package core.project.management;
import core.management.AConfiguration;
import core.management.IManager;
import style.management.StyleConfiguration;
import database.management.DBConfiguration;
import vcs.management.VCConfiguration;
import editor.management.EditorConfiguration;
import communication.management.CommunicationConfiguration;
import build.management.BuildConfiguration;

import nu.xom.Element;
import nu.xom.Elements;

import java.util.Hashtable;
import java.util.Vector;

public class Project {
    protected Element configurationsXML;

    public void save(Vector<AConfiguration> configsToSave){

        for(int i = 0; i < configsToSave.size(); i++) {
            Element specificConfig = parse(configsToSave.get(i));
        }
    }

    public void save(Hashtable<String, Vector<AConfiguration>> configsToSave) {

        for(int i = 0; i < configsToSave.keySet().size(); i++){
            for(int j = 0; j < configsToSave.values().size(); j++){
                //TODO - can
            }
        }
    }

    public Element parse(AConfiguration configsToParse) {
        Elements existingConfigs = configurationsXML.getChildElements();
        Element targetElement = null;
        for(int i = 0; i < configurationsXML.getChildCount(); i++){
            //TODO - in order to finish, finish all configuration classes
        }
        return targetElement;
    }

    public void requestData(IManager subsystemManager) {
    }

    public AConfiguration getConfig(String elementName){
        Elements existingConfigs = configurationsXML.getChildElements();
        AConfiguration targetElement = null;
        for (int i = 0; i < configurationsXML.getChildCount(); i++){
            //TODO - in order to finish, finish all configuration classes
        }
        return targetElement;
    }

    public AConfiguration[] getAllConfigs(){
        AConfiguration[] allConfigs = {new StyleConfiguration(), new EditorConfiguration(), new VCConfiguration(), new BuildConfiguration(), new CommunicationConfiguration(), new DBConfiguration()};
        String[] configElementNames = {"style", "editor", "vc", "build", "comm", "database"};
        for(int i = 0; i < configurationsXML.getChildCount(); i++) {
            Element storedConfig = configurationsXML.getFirstChildElement(configElementNames[i]);
            allConfigs[i].load(storedConfig);
        }
        return allConfigs;
    }
}
