package aims;

import java.util.ArrayList;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

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

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int j = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (this.itemsOrdered[i] != disc){
                this.itemsOrdered[j] = this.itemsOrdered[i];
                j++;
            }
        }
        if ( j != qtyOrdered ){
            System.out.println("---- [" + disc.getTitle() + "] was removed.");
            this.setQtyOrdered(j);
        }
        else{
            System.out.println("----<!>[" + disc.getTitle() + "] is not in Cart.");
        }
    }
    // public void showOrder(int blank, String str) {
    //     int cBlank = blank - str.length();
    //     if (cBlank % 2 == 0) {
    //         for (int i = 1; i <= cBlank / 2; i++) {
    //             System.out.print(" ");
    //         }
    //         System.out.print(str);
    //         for (int i = 1; i <= cBlank / 2; i++) {
    //             System.out.print(" ");
    //         }
    //     } else {
    //         for (int i = 1; i <= cBlank / 2; i++) {
    //             System.out.print(" ");
    //         }
    //         System.out.print(str);
    //         for (int i = 1; i <= cBlank / 2 + 1; i++) {
    //             System.out.print(" ");
    //         }
    //     }
    // }

    public float totalCost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++){
                total += itemsOrdered[i].getCost();
        }
        return total;       
    }
    public void orderedBill() {
        System.out.println("*********************CART*********************");
        System.out.println("Ordered Items: ");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("DVD - " + itemsOrdered[i].getTitle() + " - " +
                    itemsOrdered[i].getDirector() + " - " + 
                    itemsOrdered[i].getCategory() + " - " + 
                    itemsOrdered[i].getLength() + ": " + 
                    itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost : " + totalCost() +" $");
        System.out.println("***********************************************");
    }
}
