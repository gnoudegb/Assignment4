import javafx.scene.layout.Region;

public class ManagementCompany {

	private int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private int MGMT_WIDTH =10;
	private int MGMT_DEPTH = 10;
	private Plot plot;
	
	public ManagementCompany() {
		plot = new Plot(0,0,10,10);
		properties = new Property [5];
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		plot = new Plot(0,0,10,10);
		properties = new Property [5];
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new Property [MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		mgmFeePer = otherCompany.mgmFeePer;
		plot = new Plot (otherCompany.plot);
	}
	
	public int getMAX_PROPERTY () {
		return  properties.length;
	}
	
	public int addProperty(Property property) {
		int a, i;
		for (i=0; i<=properties.length; i++) {
				properties[i] = new Property (property);
				break;}
		
		if (getMAX_PROPERTY()==5)
			a=1;
		else if (getMAX_PROPERTY()==1)
			a =2;
		else if (!properties[i].getPlot().encompasses(plot))
			a=3;
		else if (properties[i].getPlot().overlaps(properties[i].getPlot()))
			a=4;
		else
			a = i;
		
		return a;
	}
	
	public int addProperty(String name,String city,double rent,String owner) {
		int a, i;
		for (i=0; i<5; i++) {
			if (properties[i].getRentAmount() <= 0)
				properties[i] = new Property (name, city, rent, owner);
			else
				break;}
		
		if (properties[4].getRentAmount() > 0)
			a=1;
		else if (properties[0].getRentAmount() <= 0)
			a =2;
		else if (!properties[i].getPlot().encompasses(plot))
			a=3;
		else if (properties[i].getPlot().overlaps(properties[i].getPlot()))
			a=4;
		else
			a = i;
		
		return a;
	}
	
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		int a, i;
		for (i=0; i<5; i++) {
			if (properties[i].getRentAmount() <= 0)
				properties[i] = new Property (name, city, rent, owner, x, y, width, depth);
			else
				break;}
		
		if (properties[4].getRentAmount() > 0)
			a=1;
		else if (properties[0].getRentAmount() <= 0)
			a =2;
		else if (!properties[i].getPlot().encompasses(plot))
			a=3;
		else if (properties[i].getPlot().overlaps(properties[i].getPlot()))
			a=4;
		else
			a = i;
		
		return a;
	}
	
	public double totalRent() {
		double totalR=0;
		for (int i=0; i<MAX_PROPERTY; i++) {
			totalR+= properties[i].getRentAmount();
		}
		return totalR;
	}
	

	
	private int maxRentPropertyIndex() {
		double maxRent = 0;
		int index= 0;
		for (int i=0; i<getMAX_PROPERTY(); i++) {
			if (properties[i].getRentAmount()> maxRent)
				maxRent = properties[i].getRentAmount();
				index = i;
		}
		return index;
	}
	
	private String displayPropertyAtIndex(int i) {
		return "Property Name: " + properties[i].getPropertyName() + "\n Located in " + properties[i].getCity() + "\n Belonging to " + properties[i].getOwner() + "\n Rent Amount: "
				+ properties[i].getRentAmount();
	}
	
	public String toString() {
		String str= "null";
		for (int i=0; i<properties.length; i++) {
			str += displayPropertyAtIndex(i);
		}
		return str;
	}

	public Plot getPlot() {
		return plot;
	}

	public String getName() {
		return name;
	}
	
	public double maxRentProp() {
		double maxRent = properties[0].getRentAmount();
		for (int i=0; i<5; i++) {
			while (maxRent<properties[i].getRentAmount())
				maxRent = properties[i].getRentAmount();
		}
		System.out.print("The property with the highest rent: ");
		return maxRent;
	}

}
