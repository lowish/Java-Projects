package OOP.Methods;

public class Book {
    
    private String title;
    private String author;
    private int currentPage;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.currentPage = 1;
    }
    
    public void displayInfo(){
        System.out.println("Title: " + title + ", Author: " + author);
    }
    
    public void turnPage(){
        currentPage++;
    }
    
    public int getCurrentPage(){
        return currentPage;
    }
    
}
