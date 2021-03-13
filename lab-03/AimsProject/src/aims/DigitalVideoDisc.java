package aims;

public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc() {
    } 

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    public void displayColumn(int blanks, String s) {
        if (s == null) {
            s = "-";
        }
        int cBlanks = blanks - s.length();
        if (cBlanks % 2 == 0) {
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlanks / 2 + 1; i++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");
    }
    
    public void displayDVD() {
        displayColumn(21, this.title);
        displayColumn(22, this.category);
        displayColumn(16, this.director);
        String tLength = String.valueOf(this.length);
        if (tLength.equals("0")) {
            tLength = "-";
        }
        displayColumn(10, tLength);
        String tCost = String.valueOf(this.cost);
        if (tCost.equals("0.0")) {
            tCost = "-";
        }
        displayColumn(16, tCost);
        System.out.println("");
    }
}
