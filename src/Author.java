import java.util.Objects;

public class Author {
    private String firstName;
    private String midName;
    private String lostName;

    public Author(String firstName, String midName, String lostName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lostName = lostName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMidName() {
        return this.midName;
    }

    public String getLostName() {
        return this.lostName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setLostName(String lostName) {
        this.lostName = lostName;
    }

    @Override
    public String toString (){
        return "Автор " + firstName + " " + midName + " " + lostName + " ";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(midName, author.midName) && Objects.equals(lostName, author.lostName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midName, lostName);
    }
}
