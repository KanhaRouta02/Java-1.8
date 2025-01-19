package org.kanha.a_Data;

public class Bike {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    private String name;
    private String model;

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
