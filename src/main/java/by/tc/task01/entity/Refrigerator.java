package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class Refrigerator extends Appliance{

    private Map<String, Object> refrigeratorCriteria = new HashMap<String, Object>();

    public Refrigerator(String name, Map<String, Object> refrigeratorCriteria) {
        super(name);
        this.refrigeratorCriteria = refrigeratorCriteria;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "refrigeratorCriteria=" + refrigeratorCriteria +
                '}';
    }
}
