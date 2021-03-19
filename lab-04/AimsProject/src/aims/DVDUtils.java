package aims;

public class DVDUtils {
	
	public static String compareByCost(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
	{
		String s;
		if(dvd1.getCost()>dvd2.getCost()) s= "---Cost of " +dvd1.getTitle()+" more than "+dvd2.getTitle();
		else if(dvd1.getCost()==dvd2.getCost()) s= "---Cost of " +dvd1.getTitle()+" equal to "+dvd2.getTitle();
		else s= "---Cost of " +dvd1.getTitle()+" less than "+dvd2.getTitle();
		return s;
	}
	
	public static String compareByTitle(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
	{
		String s;
		if(dvd1.getTitle().compareTo(dvd2.getTitle())>0) s= "---Title of " +dvd1.getTitle()+" stand before "+dvd2.getTitle();
		else if(dvd1.getTitle().compareTo(dvd2.getTitle())==0) s= "---Title of " +dvd1.getTitle()+" is the same with "+dvd2.getTitle();
		else s= "---Title of " +dvd1.getTitle()+" stand after "+dvd2.getTitle();
		return s;
	}
	public void sortByCost(DigitalVideoDisc[] dvdList) {
		
	}
	public void sortByTitle(DigitalVideoDisc[] dvdList) {
		
	}
}
