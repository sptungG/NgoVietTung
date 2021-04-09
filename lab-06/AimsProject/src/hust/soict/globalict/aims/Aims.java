package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;

public class Aims {
	public static void main(String[] args) {
        //create a new cart
        Cart anOrder = new Cart();
		Store anItem = new Store();
        //add DVD to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter");
        DigitalVideoDisc dvd5= new DigitalVideoDisc("Harry Potter and the Deathly Hallows II", "Fantasy", "David Yates", 175 , 26.5f);
        DigitalVideoDisc dvd6= new DigitalVideoDisc("Harry Potter and the Order of Phoenix", "Fantasy", "David Yates", 147 , 24.5f);
		DigitalVideoDisc dvd7= new DigitalVideoDisc("Avatar", "Science Fiction", 20.6f);
        anItem.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7);

        Book book1= new Book("To Kill a Mockingbird", "Classic Novel", "A jarring & poignantly beautiful story about how humans treat each other.", 6.35f);
		book1.addAuthor("Harper Lee");
		Book book2= new Book("The Great Gatsby", "Classic Novel", "The greatest, most scathing dissection of the hollowness at the heart of the American dream. Hypnotic, tragic, both of its time and completely relevant.", 5.5f);
		book2.addAuthor("F. Scott Fitzgerald");
		Book book3= new Book("Pride and Prejudice", "Classic Novel", "Philosophy, history, wit, and the most passionate love story.", 6.3f);
		book3.addAuthor("Jane Austen");
		Book book4= new Book("Doraemon 1", "Comic", "Doraemon, a cat robot from the 22nd century", 4.25f);
		book4.addAuthor("Fujiko Fujio");
		Book book5= new Book("Doraemon 2", "Comic", "Doraemon is sent to help Nobita Nobi, a young boy who receives poor grades and is frequently bullied by his two classmates", 4.30f);
		book5.addAuthor("Fujiko Fujio");
		Book book6= new Book("Doraemon 3", "Comic", "Nobita Nobi and Doraemon end up developing a strong bond with each other.", 4.45f);
		book6.addAuthor("Fujiko Fujio");
		Book book7= new Book("Doraemon 4", "Comic", "Doraemon is sent to take care of Nobita by Sewashi Nobi, Nobita's future grandson, so that his descendants can get a better life", 4.15f);
		book7.addAuthor("Fujiko Fujio");
		Book book8= new Book("Doraemon 5", "Comic", "Doraemon has a four-dimensional pouch in which he stores unexpected gadgets he uses to help Nobita", 4.15f);
		book8.addAuthor("Fujiko Fujio");
		Book book9= new Book("Doraemon 6", "Comic", "His most important gadgets include- Bamboo-Copter, a small piece of headgear that can allow its users to fly", 4.05f);
		book9.addAuthor("Fujiko Fujio");
		Book book10= new Book("Doraemon 7", "Comic", "Anywhere Door, a pink-colored door that allows people to travel according to the thoughts of the person who turns the knob", 4.25f);
		book10.addAuthor("Fujiko Fujio");
        anItem.addMedia(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);

        Media tmpMedia;
        DigitalVideoDisc dvd;
        Book book;

try (Scanner keyboard = new Scanner(System.in)) {
    int choice;
    int show;

    do {
        System.out.println("--------------------------------------------------------");
        // ------------------------------
        showMenu();
        // ------------------------------
        System.out.print(">>>> Your choice: ");
        show = keyboard.nextInt();
        switch(show) {
            case 0: 
                break;
            // ======================================
            case 1:
                int storeChoice;
                do {
                    System.out.println("--------------------------------------------------------");
                    anItem.viewStore();
                    // ------------------------------
                    storeMenu();
                    // ------------------------------
                    System.out.print(">>>> Your choice: ");
                    storeChoice = keyboard.nextInt();
                    switch(storeChoice) {
                    case 0:
                        break;
                    // ======================================
                    case 1:
                        System.out.print("==== Enter Media's ID to see details: ");
                        int id = keyboard.nextInt();
                        tmpMedia = anItem.searchByID(id);
                        if (tmpMedia!=null) {
                            System.out.println(tmpMedia.getDetail());
                            System.out.println("[??] Do you want to add the Media to the cart?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            System.out.print(">> Your choice: ");
                            choice = keyboard.nextInt();
                            if(choice ==1) {
                                if(tmpMedia instanceof DigitalVideoDisc) {
                                    dvd = (DigitalVideoDisc)tmpMedia;
                                    anOrder.addMedia(new DigitalVideoDisc(dvd.getTitle(), dvd.getCategory(),dvd.getDirector(),
                                        dvd.getLength(), dvd.getCost(), dvd.getId()));
                                }
                                else if(tmpMedia instanceof Book) {
                                    book=(Book)tmpMedia;
                                    anOrder.addMedia(new Book(book.getTitle(), book.getCategory(), book.getAuthors(),
                                            book.getContent(), book.getCost(), book.getId()));
                                }
                            }
                            else if(choice ==2) System.out.println();
                            
                            else System.out.println("----<!> Wrong statement!");
                        }
                        else System.out.println("----<!> No match Media with ID: ["+ id +"]  is found");
                        break;
                    // ======================================
                    case 2:
                        System.out.print("==== Enter Media's ID you want to add to the cart: ");
                        id = keyboard.nextInt();
                        tmpMedia = anItem.searchByID(id);
                        
                        if(tmpMedia!=null) {
                            if(tmpMedia instanceof DigitalVideoDisc) {
                                dvd=(DigitalVideoDisc)tmpMedia;
                                anOrder.addMedia(new DigitalVideoDisc(dvd.getTitle(), dvd.getCategory(),dvd.getDirector(),
                                    dvd.getLength(), dvd.getCost(), dvd.getId()));
                            }
                            else if(tmpMedia instanceof Book) {
                                book=(Book)tmpMedia;
                                anOrder.addMedia(new Book(book.getTitle(), book.getCategory(), book.getAuthors(),
                                        book.getContent(), book.getCost(), book.getId()));
                            }
                        }
                        else System.out.println("----<!> No match Media with ID: [" + id + "] is found");
                        break;
                    // ======================================
                    case 3:
                        int cartChoice;
                        do {
                            System.out.println("--------------------------------------------------------");
                            anOrder.orderedBill();
                            // ------------------------------
                            cartMenu();
                            // ------------------------------
                            System.out.print(">>>> Your choice: ");
                            cartChoice = keyboard.nextInt();

                            switch(cartChoice) {
                            case 0:
                                break;
                            // ======================================
                            case 1:
                                System.out.println("FILTER MEDIA IN CART: ----");
                                System.out.println("1. By ID"); 
                                System.out.println("2. By Title");
                                System.out.print(">>>> Your choice: ");
                                choice = keyboard.nextInt();
                                if(choice ==1) {
                                    System.out.print("==== Enter Media's ID: ");
                                    id = keyboard.nextInt();
                                    anOrder.searchByID(id);
                                }
                                else if(choice ==2) {
                                    anOrder.searchByTitle();
                                }
                                else System.out.println("----<!> Wrong statement!");
                                break;
                            // ======================================
                            case 2:
                                System.out.println("_SORT_ MEDIA IN CART: ----");
                                System.out.println("1. By Title");
                                System.out.println("2. By Cost");
                                System.out.print(">>>> Your choice: ");
                                choice = keyboard.nextInt();
                                if(choice == 1) {
                                        anOrder.sortByTitle();
                                }
                                else if(choice ==2) {
                                        anOrder.sortByCost();
                                }
                                else System.out.println("----<!> Wrong statement!");
                                break;
                            // ======================================
                            case 3:
                                System.out.print("==== Enter DVD's ID to remove from cart: ");
                                id = keyboard.nextInt();
                                anOrder.removeByID(id);
                                break;
                            // ======================================
                            case 4:
                                anOrder.getFreeItem();
                                break;
                            case 5:
                                anOrder.emptyCart();
                                break;
                            // ======================================
                            default:
                                System.out.println("----<!> Wrong statement! Please choose again.\n");
                                break;
                            }
                        }while(cartChoice!=0);
                        break;
                    // ======================================
                    default:
                        System.out.println("----<!> Wrong statement! Please choose again.\n");
                        break;
                    }
                }while(storeChoice!=0);
                break;
            // ======================================
            case 2:
                System.out.println("--------------------------------------------------------");
                // ------------------------------
                anItem.viewStore();
                // ------------------------------
                System.out.println("UPDATE STORE: ----");
                System.out.println("1. Add Media");
                System.out.println("2. Remove Media");
                System.out.print(">>>> Your choice: ");
                choice = keyboard.nextInt();
                // ======================================
                if(choice ==1) {
                    System.out.println("1. Add DVD");
                    System.out.println("2. Add Book");
                    System.out.print(">> Your choice: ");
                    int addChoice = keyboard.nextInt();
                    // ======================================
                    if(addChoice == 1) {
                        keyboard.nextLine();
                        System.out.print("==== Enter Title: ");
                        String title = keyboard.nextLine();
                        System.out.print("==== Enter Category: ");
                        String category = keyboard.nextLine();
                        System.out.print("==== Enter Director: ");
                        String director = keyboard.nextLine();
                        System.out.print("==== Enter Length: ");
                        int length = keyboard.nextInt();
                        System.out.print("==== Enter Cost: ");
                        float cost = keyboard.nextFloat();
                        anItem.addMedia(new DigitalVideoDisc(title, category, director, length, (float)cost));
                    }
                    // ======================================
                    else if(addChoice == 2) {
                        keyboard.nextLine();
                        System.out.print("==== Enter Title: ");
                        String title = keyboard.nextLine();
                        System.out.print("==== Enter Category: ");
                        String category = keyboard.nextLine();
                        System.out.print("==== Enter Author: ");
                        String Author = keyboard.nextLine();
                        System.out.print("==== Enter Content: ");
                        String content = keyboard.nextLine();
                        System.out.print("==== Enter Cost: ");
                        float cost = keyboard.nextFloat();
                        book= new Book(title, category, content, (float)cost);
                        book.addAuthor(Author);
                        anItem.addMedia(book);
                    }
                    else System.out.println("----<!> Wrong functionality!");
                    
                }
                // ======================================
                else if(choice == 2) {
                    System.out.print("==== Enter Media's ID to remove from store: ");
                    int id = keyboard.nextInt();
                    tmpMedia = anItem.searchByID(id);
                    anItem.removeMedia(tmpMedia);
                    //remove dvd which has been removed from store from cart
                    int mark = anOrder.checkId(id);
                    while(mark > 0) {
                        anOrder.removeByID(id);
                        mark--;
                    }
                }
                else System.out.println("----<!> Wrong statement!");
                break;
            // ======================================
            case 3:
                int cartChoice;
                do {
                    System.out.println("--------------------------------------------------------");
                    anOrder.orderedBill();
                    // ------------------------------
                    cartMenu();
                    // ------------------------------
                    System.out.print(">>>> Your choice: ");
                    cartChoice = keyboard.nextInt();
                    switch(cartChoice) {
                    case 0:
                        break;
                    // ======================================
                    case 1:
                        System.out.println("_FILTER_ MEDIA IN CART: ----");
                        System.out.println("1. By ID");
                        System.out.println("2. By Title");
                        System.out.print(">>>>Your choice: ");
                        choice = keyboard.nextInt();
                        if(choice ==1) {
                            System.out.print("==== Enter Media's ID: ");
                            int id = keyboard.nextInt();
                            anOrder.searchByID(id);
                        }
                        else if(choice ==2) {
                            anOrder.searchByTitle();
                        }
                        else System.out.println("----<!> Wrong statement!");
                        break;
                    // ======================================
                    case 2:
                        System.out.println("_SORT_ MEDIA IN CART: ----");
                        System.out.println("1. By Title");
                        System.out.println("2. By Cost");
                        System.out.print(">>>> Your choice: ");
                        choice = keyboard.nextInt();
                        if(choice == 1) {
                            anOrder.sortByTitle();
                        }
                        else if(choice ==2) {
                            anOrder.sortByCost();
                        }
                        else System.out.println("----<!> Wrong statement!");
                        break;
                    // ======================================
                    case 3:
                        System.out.print("==== Enter Media's ID to remove from cart: ");
                        int id = keyboard.nextInt();
                        anOrder.removeByID(id);
                        break;
                    // ======================================
                    case 4:
                        anOrder.getFreeItem();
                        break;
                    case 5:
                        anOrder.emptyCart();
                        break;
                    // ======================================
                    default:
                        System.out.println("----<!> Wrong statement! Please choose again.\n");
                        break;
                    }
                }while(cartChoice!=0);
                break;
            // ======================================
            default:
                System.out.println("----<!> Wrong statement! Please choose again.\n");
                break;
        }
    }while(show!=0);
}

}

public static void showMenu() {
    System.out.println("[Main Menu] AIMS: ");
    System.out.println("--------------------------------");
    System.out.println("1. View store");
    System.out.println("2. Update store");
    System.out.println("3. See current cart");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3");
}
public static void storeMenu() {
    System.out.println("[Store] Options: ");
    System.out.println("--------------------------------");
    System.out.println("1. See a media’s details");
    System.out.println("2. Add a media to cart");
    System.out.println("3. See current cart");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3");
}

public static void cartMenu() {
    System.out.println("[Cart] Options: ");
    System.out.println("--------------------------------");
    System.out.println("1. Filter medias in cart");
    System.out.println("2. Sort medias in cart");
    System.out.println("3. Remove media from cart");
    System.out.println("4. Get a lucky item from cart");
    System.out.println("5. Place order");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3-4-5");
}
}

/*
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
*/