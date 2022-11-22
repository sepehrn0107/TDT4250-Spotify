import java.util.Date;

import ecoreA1.BikeListing;
import ecoreA1.BikeType;
import ecoreA1.Condition;
import ecoreA1.User;
import ecoreA1.impl.EcoreA1FactoryImpl;

public class main {
	public static void main(String[] args) {
		
		User user = EcoreA1FactoryImpl.eINSTANCE.createUser("lofti@loffen.loff");
		user.setName("Lofti");
		user.setPhone(12345678);

		
		User user2 = EcoreA1FactoryImpl.eINSTANCE.createUser("si@loffen.loff");
		user2.setName("Sippa");
		user2.setPhone(56789102);
		
		BikeListing BListing = EcoreA1FactoryImpl.eINSTANCE.createBikeListing();
		BListing.setUser(user);
		BListing.setBikeType(BikeType.BMX);
		BListing.setCondition(Condition.NEW);
		BListing.setDescription("Describing the bicycle");
		BListing.setPrice(999);
		BListing.setTitle("Bike for sale");
		
		BikeListing BListing2 = EcoreA1FactoryImpl.eINSTANCE.createBikeListing();
		BListing2.setUser(user);
		BListing2.setBikeType(BikeType.BMX);
		BListing2.setCondition(Condition.USED);
		BListing2.setDescription("Describing the bicycle");
		BListing2.setPrice(999);
		BListing2.setTitle("Bike for sale");
		
		Date date = new Date();
		BListing.setModified_At(date);
		System.out.println(user);
		System.out.println(user2);
		
		System.out.println(BListing);
		System.out.println(BListing2);
		
		

	}

}
