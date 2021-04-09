package hust.soict.globalict.aims.store;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.*;

public class Store {
	public static final int MAX_NUMBERS_ITEM =1000;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	private int qtyItem=0;

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
	
	public void addMedia(Media... mediaList) {
		for(int i=0; i < mediaList.length; i++) {
			if(qtyItem < MAX_NUMBERS_ITEM) {
				itemsInStore.add(mediaList[i]);
				System.out.println("---- The disc /" + mediaList[i].getTitle() + "/ has been added to the store.");
				qtyItem++;
				if(qtyItem == MAX_NUMBERS_ITEM-1) System.out.println("----<!>Space for items in the store is almost full.");
				if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("----<!>Run out of space for items.");
			}
			else System.out.println("----<!>Space for items is already full! Can't add the disc /" + mediaList[i].getTitle() + "/ into the store.");
		}
	}
	public void removeMedia(Media media) {
		int mark = 0;
		for(int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i) == media) {
				itemsInStore.remove(i);
				System.out.println("---- The media /" + media.getTitle()+ "/ has been removed from the store.");
				mark ++;
			}
		}
		if(mark == 0) System.out.println("----<!>The disc  /" + media.getTitle() + "/ isn't in the store.");
	}
	
	
	public void viewStore() {
		int n = itemsInStore.size();
	    for (int i = 0; i < n-1; i++){
	    	int minIndex = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsInStore.get(j).getId() < itemsInStore.get(minIndex).getId())
	    			minIndex = j;
                    Media.swap(itemsInStore.get(minIndex), itemsInStore.get(i));
	    }
	    System.out.println("***********************STORE**********************");
		for(int i=0; i < n; i++) {
			System.out.println(itemsInStore.get(i).getDetail());
		}
		System.out.println("**************************************************");
	}
	
	public Media searchByID(int id) {
		int i = 0;
		while(i < itemsInStore.size()) {
			if(itemsInStore.get(i).getId()==id) {
				itemsInStore.get(i).getDetail();
				return itemsInStore.get(i);
			}
			i++;
		}
		return null;
	}
}
