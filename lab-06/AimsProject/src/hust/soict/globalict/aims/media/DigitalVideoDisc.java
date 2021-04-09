package hust.soict.globalict.aims.media;

import java.time.LocalDate;

public class DigitalVideoDisc extends Media {

	private String director;
	private int length;
	//Generate Getters and Setters

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Create a DVD object by title
	public DigitalVideoDisc(String title) {
		super(title);
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}

	//Create a DVD object by category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	//Create a DVD object by director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	//Create a DVD object by all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
		this.dateAdded= LocalDate.now();
		nbMedias++;
		this.id = nbMedias;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super(id,title, category, cost);
		this.director = director;
		this.length = length;
		this.dateAdded= LocalDate.now();
		this.id = id;
	}

// ------------------------------ ------------------------------
// ------------------------------ ------------------------------
	@Override
	public String viewInStore() {
		return ("DVD - " + this.id + ". " + this.title + " - " + this.director);
	}
	@Override
	public String getDetail() {
		return ("ID:" + this.id + " - DVD - " + this.title+ " - " + this.category + " - " +
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
