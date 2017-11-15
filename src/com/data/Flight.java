package com.data;


/* models

 */

/* fabricated

 */

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.util.Util;

public class Flight {

  private Integer status;
  final private Model model;
  private String speed;
  private String altitude;
  private String direction;
  private String transporter;
  private String goingHour;
  private String arriveHour;
  private String origin;
  private String destiny;

  public Flight() {
    this.status = Util.getRandomNumber(Status.getStatusSize());
    this.model = Model.getModel(Util.getRandomNumber(Model.getModelsSize()));
  }

  public void nextStatus() throws Exception {
    this.status++;
    if (this.status > 6) {
      throw new Exception("Aeronave já está aterrada");
    } else {
      about();
    }
  }

  public void about () {
    String modelName = model.getName();
    String fabricated = model.getFabricated();
    System.out.format("Avião modelo: %s, fabricado: %s, status: %s \n", modelName, fabricated, Status.getStatus(status));
  }
}

