import java.util.Objects;

public class Book {
    public Book(String nameBook, Author author, int years) {
        this.nameBook = nameBook;
        this.author = author;
        this.years = years;
    }

    private String nameBook;
    private Author author;
    private int years;

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYears() {
        return this.years;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String toStringBook (){
        return author.toStringName() + "Название книги " + getNameBook() + " Год выпуска : " + getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return years == book.years && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameBook);
    }
}
