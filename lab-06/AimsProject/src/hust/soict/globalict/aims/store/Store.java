package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.utils.DVDUtils;

public class Store {
	public static final int MAX_NUMBERS_ITEM =1000;
	
	private DigitalVideoDisc itemsInStore[]= new DigitalVideoDisc[MAX_NUMBERS_ITEM];
	
	private int qtyItem=0;

	public void addDVD(DigitalVideoDisc disc) {
		if(qtyItem < MAX_NUMBERS_ITEM) {
			itemsInStore[qtyItem]= disc;
			System.out.println("----The disc /" + disc.getTitle() + "/ has been added to the store.");
			qtyItem++;
			if(qtyItem == MAX_NUMBERS_ITEM -1) System.out.println("----<!>The store is almost full.");
			if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("----<!>Run out of space for items.");
		}
		else System.out.println("----<!>Space for items is already full! Can't add the disc /" + disc.getTitle() + "/ into the store.");
	}
	
	public void addDVD(DigitalVideoDisc... dvdList) {
		for(int i=0; i<dvdList.length; i++) {
			if(qtyItem < MAX_NUMBERS_ITEM) {
				itemsInStore[qtyItem]= dvdList[i];
				System.out.println("---- The disc /" + dvdList[i].getTitle() + "/ has been added to the store.");
				qtyItem++;
				if(qtyItem == MAX_NUMBERS_ITEM-1) System.out.println("----<!>Space for items in the store is almost full.");
				if(qtyItem == MAX_NUMBERS_ITEM) System.out.println("----<!>Run out of space for items.");
			}
			else System.out.println("----<!>Space for items is already full! Can't add the disc /" + dvdList[i].getTitle() + "/ into the store.");
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int mark = 0;
		for(int i = 0; i < qtyItem; i++) {
			if (itemsInStore[i] == disc) {
				itemsInStore[i] = itemsInStore[qtyItem-1];
				qtyItem--;
				System.out.println("---- The disc /" + disc.getTitle()+ "/ has been removed from the store.");
				mark ++;
                break;
			}
		}
		if(mark == 0) System.out.println("----<!>The disc  /" + disc.getTitle() + "/ isn't in the store.");
	}
	
	
	public void viewStore() {
		int n = qtyItem;
	    for (int i = 0; i < n-1; i++){
	    	int minIndex = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsInStore[j].getId() < itemsInStore[minIndex].getId())
	    			minIndex = j;
                    DVDUtils.swap(itemsInStore[minIndex], itemsInStore[i]);
	    }
	    System.out.println("***********************STORE**********************");
		for(int i=0; i<n; i++) {
			System.out.println(itemsInStore[i].viewInStore());
		}
		System.out.println("**************************************************");
	}
	
	public DigitalVideoDisc searchByID(int id) {
		int i = 0;
		while(i < qtyItem) {
			if(itemsInStore[i].getId()==id) {
				itemsInStore[i].getDetail();
				return itemsInStore[i];
			}
			i++;
		}
		return null;
	}
}
