package hust.soict.globalict.aims.store;
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.globalict.aims.media.*;

public class Store {
	public static final int MAX_NUMBERS_ITEM =1000;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	private int qtyItem=0;
// ------------------------------ ------------------------------
	public void addMedia(Media media) {
		if(qtyItem < MAX_NUMBERS_ITEM) {
			itemsInStore.add(media);
			System.out.println("----The media /" + media.getTitle() + "/ has been added to the store.");
			qtyItem++;
			if(qtyItem == MAX_NUMBERS_ITEM -1) System.out.println("----<!>The store is almost full.");
			if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("----<!>Run out of space for items.");
		}
		else System.out.println("----<!>Space for items is already full! Can't add the media /" + media.getTitle() + "/ into the store.");
	}
	// ------------------------------ 
	public void addMedia(Media... mediaList) {
		for(int i=0; i < mediaList.length; i++) {
			if(qtyItem < MAX_NUMBERS_ITEM) {
				itemsInStore.add(mediaList[i]);
				System.out.println("---- The Media /" + mediaList[i].getTitle() + "/ has been added to the store.");
				qtyItem++;
				if(qtyItem == MAX_NUMBERS_ITEM-1) System.out.println("----<!>Space for items in the store is almost full.");
				if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("----<!>Run out of space for items.");
			}
			else System.out.println("----<!>Space for items is already full! Can't add the disc /" + mediaList[i].getTitle() + "/ into the store.");
		}
	}
// ------------------------------ ------------------------------
	public void removeMedia(Media media) {
		int mark = 0;
		for(int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i) == media) {
				itemsInStore.remove(i);
				System.out.println("---- The media /" + media.getTitle()+ "/ has been removed from the store.");
				mark ++;
			}
		}
		if(mark == 0) System.out.println("----<!>The Media  /" + media.getTitle() + "/ isn't in the store.");
	}
// ------------------------------ ------------------------------
	public void viewStore() {
	    for (int i = 0; i < itemsInStore.size()-1; i++){
	    	int minIndex = i;
	    	for (int j = i+1; j < itemsInStore.size(); j++)
	    		if (itemsInStore.get(j).getId() < itemsInStore.get(minIndex).getId())
	    			minIndex = j;
                    Collections.swap(itemsInStore, i, minIndex);
	    }
	    System.out.println("***********************STORE**********************");
		for(int i=0; i < itemsInStore.size(); i++) {
			System.out.println(itemsInStore.get(i).getDetail());
		}
		System.out.println("**************************************************");
	}
// ------------------------------ ------------------------------
	public Media searchByID(int id) {
		int index = 0;
		while(index < itemsInStore.size()) {
			if(itemsInStore.get(index).getId()==id) {
				itemsInStore.get(index).getDetail();
				return itemsInStore.get(index);
			}
			index++;
		}
		return null;
	}
}
