package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class TabletPC extends Appliance{

    private Map<String, Object> tabletPcCriteria = new HashMap<String, Object>();

    public TabletPC(String name, Map<String, Object> tabletPcCriteria) {
        super(name);
        this.tabletPcCriteria = tabletPcCriteria;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "tabletPcCriteria=" + tabletPcCriteria +
                '}';
    }
}
