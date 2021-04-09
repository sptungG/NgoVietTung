package hust.soict.globalict.aims.cart;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import hust.soict.globalict.aims.media.*;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(20);
// ------------------------------ ------------------------------
    public void addMedia(Media media){
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            itemsOrdered.add(media);
            System.out.println("----The media named [" + media.getTitle() + 
                        "] has been added.");
            if(itemsOrdered.size() == 19) System.out.println("The cart is almost full.");
            if(itemsOrdered.size() == 20) System.out.println("The cart is full.");
        }
        else{
            System.out.println("----<!>The media named [" + media.getTitle() + 
                        "] hasn't been added. The order is almost full.");
        }
    }
    
    public void addMedia(Media... mediaList) {
        for (int i = 0; i < mediaList.length ; i++) {
            if(itemsOrdered.size() < MAX_NUMBERS_ORDERED){
                itemsOrdered.add(mediaList[i]);
                System.out.println("----The disc named [" + mediaList[i].getTitle() + 
                        "] has been added.");
                if(itemsOrdered.size() == 19) System.out.println("The cart is almost full.");
                if(itemsOrdered.size() == 20) System.out.println("The cart is full.");  
            }
            else {
                System.out.println("----<!>The media named [" + mediaList[i].getTitle() + 
                        "] hasn't been added. The order is almost full.");
            }
        }
    }

// ------------------------------ ------------------------------
    public void removeMedia(Media media){
        int mark = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i) != media){
                itemsOrdered.remove(i);
                System.out.println("----[" + media.getTitle() + "] was removed.");
                mark++;
            }
        }
        if ( mark == 0 ){
            System.out.println("----<!>[" + media.getTitle() + "] is not in Cart.");
        }
    }
// ------------------------------ ------------------------------
    public void sortByCost() {
		int n= itemsOrdered.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsOrdered.get(j).getCost() > itemsOrdered.get(min_idx).getCost())
	    			min_idx = j;
	    		else if (itemsOrdered.get(j).getCost() == itemsOrdered.get(min_idx).getCost()) {
	    			if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) < 0)
		    			min_idx = j;
	    		}
	    	Collections.swap(itemsOrdered, i, min_idx);
	    }
		System.out.println("Sort by cost: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1+ ". " + itemsOrdered.get(i).getDetail());
		}
    }
    public void sortByTitle() {
		int n= itemsOrdered.size();
	    for (int i = 0; i < n-1; i++){
	    	int min_idx = i;
	    	for (int j = i+1; j < n; j++)
	    		if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) < 0)
	    			min_idx = j;
	    		else if (itemsOrdered.get(j).getTitle().compareTo(itemsOrdered.get(min_idx).getTitle()) == 0) {
	    			if (itemsOrdered.get(j).getCost() > itemsOrdered.get(min_idx).getCost()) 
	    				min_idx = j;
	    		}
	    	Collections.swap(itemsOrdered, i, min_idx);
	    }
		System.out.println("Sort by Title: ");
		for(int i=0; i<n; i++) {
			System.out.println(i+1 +". "+ itemsOrdered.get(i).getDetail());
		}
    }
// ------------------------------ ------------------------------
	public void searchByID(int id) {
		int found  = 0;
		int i = 0;
		while(i < itemsOrdered.size() && found  == 0) {
			if(itemsOrdered.get(i).getId() == id) {
				System.out.println("----A match DVD is found: [" + id +" ."+ itemsOrdered.get(i).getDetail() + "]");
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
        for(Media media: itemsOrdered) {
            if(media != null && media.search(title)) {
                mark = 1;
                System.out.println("---- ["+ media.getTitle()+"]");
                }
            }
        if(mark == 0) {
            System.out.println("----<!> ["+ title +"] is not matched.");
        }
            sc.close();
    }
    // ------------------------------ ------------------------------
	public void removeByID(int id) {
		int mark = 0;
		int i = 0;
		while(i < itemsOrdered.size() && mark == 0) {
			if(itemsOrdered.get(i).getId() == id) {
				removeMedia(itemsOrdered.get(i));
				mark = 1;
			}
			i++;
		}
		if(mark == 0) System.out.println("----<!>[Removed Fail] No match DVD with ID: [" + id + "] is found");
	}
	
	// ------------------------------ ------------------------------
	public void emptyCart() {
		if(itemsOrdered.size()>0) {
			while(itemsOrdered.size()!=0) {
				removeMedia(itemsOrdered.get(0));
			}
			System.out.println("An order is created");
		}
		else System.out.println("Can't create order. The cart is empty!");
	}
// ------------------------------ ------------------------------
    public Media getALuckyItem() {
		int rand = (int)(Math.random() * itemsOrdered.size());
		String title=itemsOrdered.get(rand).getTitle();
		itemsOrdered.get(rand).setTitle(title + "(free)");
		itemsOrdered.get(rand).setCost(0f);
		return itemsOrdered.get(rand);
	}
	public void getFreeItem() {
		int flag=0;
		for(int i=0; i<itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getCost()==0.0f) flag=1;
		}
		if(itemsOrdered.size()>1) {
			if(flag==0) {
				System.out.println("Get lucky item: ");
				System.out.println(getALuckyItem().getDetail());
				flag=1;
			}
			else System.out.println("You already has a lucky item in the cart");
		}
		else System.out.println("Can't get a lucky item. The quantity of items in cart is too small!");
	}
// ------------------------------ ------------------------------
	// check whether a mdeia in cart by id
	public int checkId(int id) {
		int mark = 0;
		int i = 0;
		while(i < itemsOrdered.size()) {
			if(itemsOrdered.get(i).getId()==id) {
				mark++;
			}
			i++;
		}
		return mark;
	}
// ------------------------------ ------------------------------
    public float totalCost(){
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++){
                total += itemsOrdered.get(i).getCost();
        }
        return total;       
    }
// ------------------------------ ------------------------------
    public void orderedBill() {
        System.out.println("*********************CART*********************");
        System.out.println("Ordered Items: ");
        for(int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i).getDetail());
		}
        System.out.println("Total cost : " + totalCost() +" $");
        System.out.println("***********************************************");
    }
}
