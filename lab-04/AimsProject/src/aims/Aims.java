package aims;

public class Aims {

	public static void main(String[] args) {
        //create a new cart
        Cart anOrder = new Cart();
        
        //add DVD to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		// anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        // anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter");
        // anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
        // anOrder.addDigitalVideoDisc(dvd5);
        DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		// anOrder.addDigitalVideoDisc(dvd6);
		
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		// anOrder.addDigitalVideoDisc(dvd7);
        //show the cart

		// anOrder.addDigitalVideoDisc(dvd1, dvd2);
		DigitalVideoDisc[] allDVDList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7};
        DigitalVideoDisc[] tempDVDList = {dvd1, dvd2, dvd3, dvd4, dvd6};  
        anOrder.addDigitalVideoDisc(tempDVDList);
        System.out.println("\n---- Print Bill: ");
        anOrder.orderedBill();
        //remove DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.removeDigitalVideoDisc(dvd5);
		anOrder.removeDigitalVideoDisc(dvd6);
		anOrder.removeDigitalVideoDisc(dvd6);

		// System.out.println(DVDUtils.compareByCost(dvd1, dvd2));
		// System.out.println(DVDUtils.compareByCost(dvd2, dvd3));
		// System.out.println(DVDUtils.compareByTitle(dvd4, dvd5));
        // System.out.println(DVDUtils.compareByTitle(dvd7, dvd6));
		
		System.out.println("\n---- Print Bill: ");
        anOrder.orderedBill();
        
        //print total cost
        System.out.print("Total Cost is: " + anOrder.totalCost() + " $");
    }
}
