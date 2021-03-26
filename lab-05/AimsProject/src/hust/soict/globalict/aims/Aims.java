package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.disc.*;
public class Aims {

	public static void main(String[] args) {
        //create a new cart
        Cart anOrder = new Cart();
        
        //add DVD to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		// anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 19.95f);
        // anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"Harry Potter");
        // anOrder.addDigitalVideoDisc(dvd4);
        DigitalVideoDisc dvd5= new DigitalVideoDisc(5,"Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
        // anOrder.addDigitalVideoDisc(dvd5);
        DigitalVideoDisc dvd6= new DigitalVideoDisc(6,"Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		// anOrder.addDigitalVideoDisc(dvd6);	
		DigitalVideoDisc dvd7= new DigitalVideoDisc(7,"Avatar", "Science Fiction", 20.6f);
		// anOrder.addDigitalVideoDisc(dvd7);
        //show the cart

		// anOrder.addDigitalVideoDisc(dvd1, dvd2);
		DigitalVideoDisc[] allDVDList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7};
        DigitalVideoDisc[] tempDVDList = {dvd1, dvd2, dvd3, dvd4, dvd6};  

        anOrder.addDigitalVideoDisc(tempDVDList);
		//sortByCost
		anOrder.sortByCost(tempDVDList);
		//sortByTitle
		anOrder.sortByTitle(tempDVDList);
        System.out.println("\n---- Print Bill: ");
        anOrder.orderedBill();
        // Search by Id
		anOrder.searchByID(5);
		anOrder.searchByID(1);
		System.out.println("\n");
        //remove DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.removeDigitalVideoDisc(dvd5);
		anOrder.removeDigitalVideoDisc(dvd6);
		anOrder.removeDigitalVideoDisc(dvd6);		
		System.out.println("\n---- Print Bill: ");
        anOrder.orderedBill();
        //print total cost
        System.out.print("Total Cost is: " + anOrder.totalCost() + " $");
    }
}
