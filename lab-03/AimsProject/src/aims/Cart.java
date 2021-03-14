package aims;
import java.util.Arrays;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOdered = 0;
	
	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public int getQtyOdered() {
		return qtyOdered;
	}
	public void setQtyOdered(int qtyOdered) {
		this.qtyOdered = qtyOdered;
	}
	public static int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if(qtyOdered == MAX_NUMBERS_ORDERED) {
			System.out.println("----[Add]The order is almost full");
			return;
		}
		else {
			itemsOrdered[qtyOdered] = disc;
			System.out.println("----[Add]The disc has been added");
			qtyOdered++;
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i<qtyOdered; i++) {
			if(disc.equals(itemsOrdered[i])) {
				for(int j = i; j < qtyOdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				qtyOdered--;
				System.out.println("----[Removed]Successful");
				return;
			}
		}
		System.out.println("----[Removed]Item does not exist in the ordered list");
	}
	public float totalCost() {
		float sumCost = 0;
		for(int i = 0; i < qtyOdered; i++) {
			sumCost += itemsOrdered[i].getCost();
		}
		return sumCost;
	}
	@Override
	public String toString() {
		return "\n----Order itemsOrdered :\n" + Arrays.toString(itemsOrdered) + "\n qtyOdered=" + qtyOdered + "\n";
	}
}
	
