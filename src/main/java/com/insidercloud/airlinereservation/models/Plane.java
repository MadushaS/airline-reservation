package com.insidercloud.airlinereservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Plane {
  @Id private String id;
  @Field private String name;
  @Field private String model;
  @Field private String manufacturer;
  @Field private int remaining1stPassengers;
  @Field private int total1stPassengers;
  @Field private int remaining2ndPassengers;
  @Field private int total2ndPassengers;
  @Field private float maxCargoCapacity;

  public Plane(
      String name,
      String model,
      String manufacturer,
      int total1stPassengers,
      int total2ndPassengers,
      float maxCargoCapacity) {
    this.name = name;
    this.model = model;
    this.manufacturer = manufacturer;
    this.remaining1stPassengers = total1stPassengers;
    this.total1stPassengers = total1stPassengers;
    this.remaining2ndPassengers = total2ndPassengers;
    this.total2ndPassengers = total2ndPassengers;
    this.maxCargoCapacity = maxCargoCapacity;
  }

  public Plane() {}

  public String getId() {
    return id;
  }

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

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getRemaining1stPassengers() {
    return remaining1stPassengers;
  }

  public void setRemaining1stPassengers(int remaining1stPassengers) {
    this.remaining1stPassengers = remaining1stPassengers;
  }

  public int getTotal1stPassengers() {
    return total1stPassengers;
  }

  public void setTotal1stPassengers(int total1stPassengers) {
    this.total1stPassengers = total1stPassengers;
  }

  public int getRemaining2ndPassengers() {
    return remaining2ndPassengers;
  }

  public void setRemaining2ndPassengers(int remaining2ndPassengers) {
    this.remaining2ndPassengers = remaining2ndPassengers;
  }

  public int getTotal2ndPassengers() {
    return total2ndPassengers;
  }

  public void setTotal2ndPassengers(int total2ndPassengers) {
    this.total2ndPassengers = total2ndPassengers;
  }

  public float getMaxCargoCapacity() {
    return maxCargoCapacity;
  }

  public void setMaxCargoCapacity(float maxCargoCapacity) {
    this.maxCargoCapacity = maxCargoCapacity;
  }

  @Override
  public String toString() {
    return "Plane{"
        + "id="
        + id
        + ", name="
        + name
        + ", model="
        + model
        + ", manufacturer="
        + manufacturer
        + ", remaining1stPassengers="
        + remaining1stPassengers
        + ", total1stPassengers="
        + total1stPassengers
        + ", remaining2ndPassengers="
        + remaining2ndPassengers
        + ", total2ndPassengers="
        + total2ndPassengers
        + ", maxCargoCapacity="
        + maxCargoCapacity
        + '}';
  }
}
