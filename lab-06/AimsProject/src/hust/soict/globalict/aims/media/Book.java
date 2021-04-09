package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    private String content;

    public List<String> getAuthors() {
        return authors;
    }

    public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
// ------------------------------
    public void addAuthor(String authorName){
        if(authors.contains(authorName) == false){
            authors.add(authorName);
        }
        else System.out.println("Already exist");
    }

    public void removeAuthor(String authorName){
        if(authors.contains(authorName)){
            authors.remove(authorName);
        } else System.out.println("Does not exist");
    }
// ------------------------------
    public Book(String title){
        super(title);
    }

    public Book(String title, String category){
        super(title, category);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

	public Book(String title, String category, String content, float cost) {
        super(title, category,cost);
        this.content = content;
    }

    public Book(String title, String category, List<String> authors, String content, float cost, int id) {
        super(title, category, cost);
        this.authors = authors;
        this.content = content;
    }
// ------------------------------
    @Override
    public String getDetail() {
        return ("Book - ID: " + this.id +  "- Title: " + this.title + ", Category: " + this.category + ", Cost: " + this.cost + ", Authors: " + this.authors);
    }
    @Override
    public String viewInStore() {
		return ("Book - " + this.id + ". " + this.title + " - " + this.authors);
	}

}
