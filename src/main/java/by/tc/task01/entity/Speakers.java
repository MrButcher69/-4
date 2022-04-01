package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class Speakers extends Appliance{

    private Map<String, Object> speakersCriteria = new HashMap<String, Object>();

    public Speakers(String name, Map<String, Object> speakersCriteria) {
        super(name);
        this.speakersCriteria = speakersCriteria;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "speakersCriteria=" + speakersCriteria +
                '}';
    }
}
