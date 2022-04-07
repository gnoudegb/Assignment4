

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m1, m2, m3, mgmtco;
	Property p1,p2, p3;
	@Before
	public void setUp() throws Exception {
		m1= new ManagementCompany ("Managing", "Mn23", 500.0, 3, 5, 7, 8);
		m2= new ManagementCompany ("Missionx", "MX3", 500.0, 4, 4, 9, 10);
		m3= new ManagementCompany ("Mobile", "Mb25", 500.0, 3, 2, 6, 6);
		
		//student add three properties, with plots, to mgmt co
		mgmtco= new ManagementCompany ("MgmtCo", "Mc00", 500.0, 6, 6, 7, 7);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		m1=m2=m3=mgmtco=null;
		p1=p2=p3=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		p1= new Property ("Lakeview", "Lynchburg", 700.0, "Esse");
		//student should add property with 8 args
		p2= new Property ("Lakeside", "Potomac", 1900.0, "Nath", 19, 19, 58, 4);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p3= new Property(p2);
		
		assertEquals(mgmtco.addProperty(p1),1,0);
		assertEquals(mgmtco.addProperty(p2),1,0);
		assertEquals(mgmtco.addProperty(p3),-1,0);
		
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgmtco.maxRentProp(), 1900.0,0);
		
	}

	@Test
	public void testTotalRent() {
		fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgmtco.totalRent(),4500.0,0);
	}

 }
