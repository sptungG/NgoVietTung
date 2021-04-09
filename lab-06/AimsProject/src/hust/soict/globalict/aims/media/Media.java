package hust.soict.globalict.aims.media;

import java.time.LocalDate;

public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;
    protected int id;
    protected LocalDate dateAdded;
	protected static int nbMedias = 0;
	
// ------------------------------
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
// ------------------------------
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
// ------------------------------
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
// ------------------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
// ------------------------------
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public static int getNbMedias() {
		return nbMedias;
	}
// ------------------------------
    protected Media(String title){
        this.title = title;
    }

    protected Media(String title,String category){
        this.title = title;
        this.category = category;
    }  
    
    protected Media(String title,String category,float cost){
        this(title);
        this.category = category;
        this.cost=cost;
    } 

    protected Media(int id,String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
// ------------------------------
    public boolean search(String title){
        int count=0;
        String[] s1 = getTitle().split("\\s");
        String[] s2 = title.split("\\s");
        for(String s3 : s2){
            for(String s4 : s1){
                if(s4.equalsIgnoreCase(s3)){
                    count++;
                }
            }
        }
        if(count==s2.length) return true;
        else return false;
    }
// ------------------------------
    public abstract String getDetail();
    public abstract String viewInStore();

	// public static void swap(Media media1, Media media2) {
	// 	// String temp = media1.getTitle();
	// 	// media1.setTitle(media2.getTitle());
	// 	// media2.setTitle(temp);

	// 	String title = media1.getTitle();
	// 	String category = media1.getCategory();
	// 	float cost= media1.getCost();
		
	// 	media1.setTitle(media2.getTitle());
	// 	media1.setCategory(media2.getCategory());
	// 	media1.setCost(media2.getCost());
		
	// 	media2.setTitle(title);
	// 	media2.setCategory(category);
	// 	media2.setCost(cost);
	// }

    // public static Media[] sortByCost(Media...media) {
	//     for (int i = 0; i < media.length - 1; i++){
	//     	int minIndex = i;
	//     	for (int j = i+1; j < media.length; j++)
	//     		if (media[j].getCost() > media[minIndex].getCost())
	//     			minIndex = j;
	//     			swap(media[minIndex], media[i]);
	//     }
	//     return media;
	// }
	
	// public static Media[] sortByTitle(Media... media) {
	//     for (int i = 0; i < media.length - 1; i++){
	//     	int minIndex = i;
	//     	for (int j = i+1; j < media.length; j++)
	//     		if (media[j].getTitle().compareTo(media[minIndex].getTitle()) < 0)
	//     			minIndex = j;
	//     			swap(media[minIndex], media[i]);
	//     }
	//     return media;
	// }
}