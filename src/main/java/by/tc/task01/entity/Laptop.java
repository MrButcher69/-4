package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class Laptop extends Appliance{

    private Map<String, Object> laptopCriteria = new HashMap<String, Object>();

    public Laptop(String name, Map<String, Object> laptopCriteria) {
        super(name);
        this.laptopCriteria = laptopCriteria;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopCriteria=" + laptopCriteria +
                '}';
    }
}
