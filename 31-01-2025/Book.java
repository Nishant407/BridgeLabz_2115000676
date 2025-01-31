class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("--------------------"); 
    }


    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 25.99);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 19.95);
        Book book3 = new Book("1984", "George Orwell", 15.50);


        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();


        
        book1.price = 29.99; 
        book1.displayBookDetails(); 

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
