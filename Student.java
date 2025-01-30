/**
 * Class Student that inherits from abstract person
 * @author: Gavin Crowley
 * @version: 01
 */
public class Student extends Person{
    //data member
    private String major;
    /**
     * default constructor that overrides the Person constuctor
     */
    public Student(){
        super();
        major = "Undefined";
    }
     /**
     * Constructor with six parameters
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param major initial value for the student's major
     */
    public Student(int id, String name, String address, String phone, String email, String major){
        super(id, name, address, phone, email);
        this.major = major;
    }
    /**
     * accessor for the major
     * @return value of the major
     */
    public String getMajor(){ return major;}
    /**
     * mutator for the major
     * @param major value of the major
     */
    public void setMajor(String m){major = m;}
     /**
     * Accessor for the Student attributes
     * @return formatted string with the object attributes
     */
    public String toString(){
        return super.toString() + String.format("Major: %s\n", major);
    }
}