package aims;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
	private int id;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public DigitalVideoDisc() {
    } 

    public DigitalVideoDisc( String title) {
        this.title = title;
    }
    public DigitalVideoDisc(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

    public String getDetail() {
		return ("DVD - " + this.title+ " - " + this.category + " - " +
				this.director + " - "+ this.length + ": " + this.cost + "$");
	}
}

//     public void showOrder(int blank, String str) {
//         int cBlank = blank - str.length();
//         if (cBlank % 2 == 0) {
//             for (int i = 1; i <= cBlank / 2; i++) {
//                 System.out.print(" ");
//             }
//             System.out.print(str);
//             for (int i = 1; i <= cBlank / 2; i++) {
//                 System.out.print(" ");
//             }
//         } else {
//             for (int i = 1; i <= cBlank / 2; i++) {
//                 System.out.print(" ");
//             }
//             System.out.print(str);
//             for (int i = 1; i <= cBlank / 2 + 1; i++) {
//                 System.out.print(" ");
//             }
//         }
//     }

//     public void displayColumn(int blank, String str) {
//         if (str == null) {
//             str = "-";
//         }
//         showOrder( blank, str);
//         System.out.print("|");
//     }
//     public void displayBlank() {
//         String Cost = String.valueOf(this.cost);
//         if (Cost.equals("0.0")) {
//             Cost = "-";
//         }
//         displayColumn(16, Cost);
//         String Length = String.valueOf(this.length);
//         if (Length.equals("0")) {
//             Length = "-";
//         }
//         displayColumn(10, Length);
//     }

//     public void  orderedBill(){
//         displayColumn(40, this.title);
//         displayColumn(22, this.category);
//         displayColumn(16, this.director);
//         displayBlank();
//         System.out.println("");
//     }
// }
