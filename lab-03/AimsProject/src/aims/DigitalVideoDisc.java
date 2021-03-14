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
    public void showOrder(int blank, String str) {
        int cBlank = blank - str.length();
        if (cBlank % 2 == 0) {
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(str);
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(str);
            for (int i = 1; i <= cBlank / 2 + 1; i++) {
                System.out.print(" ");
            }
        }
    }

    public void displayColumn(int blank, String str) {
        if (str == null) {
            str = "-";
        }
        showOrder( blank, str);
        System.out.print("|");
    }
    public void displayBlank() {
        String Cost = String.valueOf(this.cost);
        if (Cost.equals("0.0")) {
            Cost = "-";
        }
        displayColumn(16, Cost);
        String Length = String.valueOf(this.length);
        if (Length.equals("0")) {
            Length = "-";
        }
        displayColumn(10, Length);
    }

    public void displayDVD() {
        displayColumn(21, this.title);
        displayColumn(22, this.category);
        displayColumn(16, this.director);
        displayBlank();
        System.out.println("");
    }
}
