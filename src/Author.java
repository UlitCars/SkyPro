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

    public String toStringName (){
        return "Автор " + firstName + " " + midName + " " + lostName + " ";
    }

    @Override
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author a2 = (Author) other;
        return lostName.equals(a2.lostName);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(lostName);
    }
}
