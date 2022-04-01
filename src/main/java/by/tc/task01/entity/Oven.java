package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class Oven extends Appliance{

    private Map<String, Object> ovenCriteria = new HashMap<String, Object>();

    public Oven(String name, Map<String, Object> ovenCriteria) {
        super(name);
        this.ovenCriteria = ovenCriteria;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "ovenCriteria=" + ovenCriteria +
                '}';
    }
}
