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

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setMidName() {
        this.midName = midName;
    }

    public void setLostName() {
        this.lostName = lostName;
    }
}
