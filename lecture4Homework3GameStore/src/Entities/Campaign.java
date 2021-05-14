package Entities;

public class Campaign {
	private int id;
	private String name;
	private double discount;
	boolean active;
	
	
	public Campaign() {
		
	}


	public Campaign(int id, String name, double discount, boolean active) {
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.active = active;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
}

