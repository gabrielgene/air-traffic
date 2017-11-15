package com.data;

import com.util.Util;

import java.util.ArrayList;
import java.util.Arrays;

public class Model {
  private final String name;
  private final String fabricated;
  private static final ArrayList<Model> models;

  static {
    models = new ArrayList<>(Arrays.asList(
            new Model("ATR 42-500", "20/02/2014"),
            new Model("Airbus A320", "17/04/2013"),
            new Model("Embraer 175", "03/08/2015"),
            new Model("Boeing 737-700", "30/06/2017")
    ));
  }

  private Model(final String name, final String fabricated) {
    this.name = name;
    this.fabricated = fabricated;
  }

  public String getName() {
    return name;
  }

  public String getFabricated() {
    return fabricated;
  }

  public static int getModelsSize() {
    return models.size();
  }

  public static Model getModel(final Integer index) {
    return models.get(index);
  }
}
