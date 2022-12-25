package person;

/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/24/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen(){
        return (this.age>12 && this.age<20);
    }

    public String getFullName(){
        return (getFirstName().isEmpty() && getLastName().isEmpty()) ? "" :
               ( getFirstName().isEmpty())? getLastName()  : (getLastName().isEmpty())? getFirstName() : getFirstName()+" "+getLastName();
    }

}
