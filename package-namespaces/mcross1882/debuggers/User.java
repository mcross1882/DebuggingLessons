package mcross1882.debuggers;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {   
        return age;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s (%d)", firstName, lastName, age);
    }
}

