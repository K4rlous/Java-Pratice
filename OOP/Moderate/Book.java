package Moderate;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.isEmpty()){
            System.out.println("[ERROR] The author can't be empty or null");
        } else {
            this.author = author;
        }
    }

    @Override
    String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }
}
