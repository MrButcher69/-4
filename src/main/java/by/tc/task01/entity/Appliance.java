package by.tc.task01.entity;

public  class Appliance {
    private String name;

    public Appliance(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "name='" + name + '\'' +
                '}';
    }
}
