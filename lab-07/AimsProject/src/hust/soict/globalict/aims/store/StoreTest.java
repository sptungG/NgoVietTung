package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.*;

public class StoreTest {
	public static void main(String[] args) {
		Store anItem = new Store();
		
		// Create new dvd objects and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter");
        DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
        DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", 
				"David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
		anItem.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7);
		
		// remove disc from the store
		anItem.removeMedia(dvd5);
		anItem.removeMedia(dvd5);
		anItem.addMedia(dvd6);
		anItem.removeMedia(dvd6);
		anItem.removeMedia(dvd6);
		
		anItem.viewStore();

	}
}
