/**
 * Class Employee that inherits from abstract person
 * @author: Gavin Crowley
 * @version: 01
 */
public class Employee extends Person{
    //data members
    private String position;
    private double salary;
    /**
     * default constructor that overrides the Person constuctor
     */
    public Employee(){
        super();
        position = "staff";
        salary = 0.0;
    }
    /**
     * Constructor with seven parameters
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param position initial value for the position held
     * @param salary initial value for the salary 
     */
    public Employee(int id, String name, String address, String phone, String email, String position, double salary){
        super(id, name, address, phone, email);
        this.position = position;
        this.salary = salary;
    }
    /**
     * accessor for the position
     * @return value of the position
     */
    public String getPosition(){return position;}
    /**
     * accessor for the salary
     * @return value of the salary
     */
    public double getSalary(){return salary;}
    /**
     * mutator for the position
     * @param p value of the position 
     */
    public void setPosition(String p){position = p;}
    /**
     * mutator for the salary
     * @param s value of the position
     */
    public void setSalary(double s){salary = s;}
    /**
     * Accessor for the Employeee attributes
     * @return formatted string with the object attributes
     */
    public String toString(){
        return super.toString() + String.format("Position: %s\nSalary: $%.2f\n", position, salary);
    }
}