package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class VacuumCleaner extends Appliance{

    private Map<String, Object> vacuumCleanerCriteria = new HashMap<String, Object>();

    public VacuumCleaner(String name, Map<String, Object> vacuumCleanerCriteria) {
        super(name);
        this.vacuumCleanerCriteria = vacuumCleanerCriteria;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "vacuumCleanerCriteria=" + vacuumCleanerCriteria +
                '}';
    }
}
