package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cart anOrder = new Cart();
        
        //add DVD to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sinbab", "Animation", "bbbbbb", 88, 19f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Ironman 1", "Science Fiction", "aaaaaa", 87, 24f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Naruto", "Animation", 19.95f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Kimetsu no Yaiba");
        anOrder.addDigitalVideoDisc(dvd4);
        
        //show the cart
        anOrder.displayCart();
        
        //remove DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.displayCart();
        
        //print total cost
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
	}

}
