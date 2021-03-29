package hust.soict.globalict.aims.cart;
import java.util.Scanner;

import hust.soict.globalict.aims.utils.*;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    public final DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
// ------------------------------ ------------------------------
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("----The disc named [" + disc.getTitle() + 
                        "] has been added.");
        }
        else{
            System.out.println("----<!>The disc named [" + disc.getTitle() + 
                        "] hasn't been added. The order is almost full.");
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length ; i++) {
            if(qtyOrdered < MAX_NUMBERS_ORDERED){
                itemsOrdered[qtyOrdered++] = dvdList[i];
                System.out.println("----The disc named [" + dvdList[i].getTitle() + 
                        "] has been added.");
            }
            else {
                System.out.println("----<!>The disc named [" + dvdList[i].getTitle() + 
                        "] hasn't been added. The order is almost full.");
            }
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
// ------------------------------ ------------------------------
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int j = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (this.itemsOrdered[i] != disc){
                this.itemsOrdered[j] = this.itemsOrdered[i];
                j++;
            }
        }
        if ( j != qtyOrdered ){
            System.out.println("----[" + disc.getTitle() + "] was removed.");
            this.setQtyOrdered(j);
        }
        else{
            System.out.println("----<!>[" + disc.getTitle() + "] is not in Cart.");
        }
    }
// ------------------------------ ------------------------------
    public void sortByCost(DigitalVideoDisc[] dvdList) {
		DigitalVideoDisc[] sorted = DVDUtils.sortByCost(dvdList);
		System.out.println("---- Sort by Cost: ");
		for(int i = 0; i< sorted.length; i++){
			System.out.println(sorted[i].getDetail());
		}
    }
    public void sortByTitle(DigitalVideoDisc[] dvdList) {
		DigitalVideoDisc[] sortedd = DVDUtils.sortByTitle(dvdList);
		System.out.println("---- Sort by Title: ");
		for(int i = 0; i< sortedd.length; i++){
			System.out.println(sortedd[i].getDetail());
		}
    }
// ------------------------------ ------------------------------
	public void searchByID(int id) {
		int found  = 0;
		int i = 0;
		while(i < qtyOrdered && found  == 0) {
			if(itemsOrdered[i].getId() == id) {
				System.out.println("----A match DVD is found: [" + id +" ."+ itemsOrdered[i].getDetail() + "]");
				found =1;
			}
			i++;
		}
		if(found == 0) System.out.println("----<!>No match DVD with ID: [" + id + "] is found");
	}
    public void searchByTitle() {
        int mark = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("====[Search by Title] Enter the title:");
        String title = sc.nextLine();
        System.out.println("==== Results: ");
        for(DigitalVideoDisc disc: itemsOrdered) {
            if(disc != null && disc.search(title)) {
                mark = 1;
                System.out.println("---- ["+ disc.getTitle()+"]");
                }
            }
        if(mark == 0) {
            System.out.println("----<!> ["+ title +"] is not matched.");
        }
            sc.close();
    }
// ------------------------------ ------------------------------
    public float totalCost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++){
                total += itemsOrdered[i].getCost();
        }
        return total;       
    }
// ------------------------------ ------------------------------
    public void orderedBill() {
        System.out.println("*********************CART*********************");
        System.out.println("Ordered Items: ");
        for(int i = 0; i < qtyOrdered; i++) {
			System.out.println( itemsOrdered[i].getDetail());
		}
        System.out.println("Total cost : " + totalCost() +" $");
        System.out.println("***********************************************");
    }
}
