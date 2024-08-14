package com.example.writtingtools.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "pen")
public class Pen {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private int price;
	private int length;
	private String color;
	private int inklevel;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getInklevel() {
		return inklevel;
	}
	public void setInklevel(int inklevel) {
		this.inklevel = inklevel;
	}
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", model=" + model + ", price=" + price + ", length=" + length + ", color="
				+ color + ", inklevel=" + inklevel + "]";
	}
	


}
