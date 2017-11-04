package com.data;


public class Model {
    private final String model;
    private final String factoryDate;

    public Model(final String model, final String factoryDate) {
        this.model = model;
        this.factoryDate = factoryDate;
    }

    public String getModel() {
        return model;
    }

    public String getFactoryDate() {
        return factoryDate;
    }
}
