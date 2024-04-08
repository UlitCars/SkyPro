public class Book {
    public Book(String nameBook, Author author, int years) {
        this.nameBook = nameBook;
        this.author = author;
        this.years = years;
    }

    private String nameBook;
    Author author;
    private int years;

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYears() {
        return this.years;
    }

    public void setNameBook() {
        this.nameBook = nameBook;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
