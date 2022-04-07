
public class Property {

	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	public Property() {
	
	}
	
	public Property(Property p) {
		city= p.getCity();
		owner = p.getOwner();
		propertyName = p.getPropertyName();
		rentAmount = p.getRentAmount();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
				
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner,int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x,y,width, depth);
	}

	public String getCity() {
		return city;
	}

	public String getOwner() {
		return owner;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	@Override
	public String toString() {
		return "Property Name: " + propertyName + "\n Located in " + city + "\n Belonging to " + owner + "\n Rent Amount: "
				+ rentAmount;
	}
	

}
