/**
 * Class Faculty that inherits from Employee which inherits from abstract Person
 * @author: Gavin Crowley
 * @version: 01
 */
public class Faculty extends Employee{
    //data member
    private String rank;
    /**
     * default constructor that overrides the Employee constuctor
     */
    public Faculty(){
        super();
        rank = "Assistant Professor";
    }
    /**
     * Constructor with 8 parameters
     * @param id initial value for the id
     * @param name initial value for the name
     * @param address initial value for the address
     * @param phone initial value for the phone number
     * @param email initial value for the email address
     * @param position initial value for the position held
     * @param salary initial value for the salary 
     * @param rank initial value for the rank
     */
    public Faculty(int id, String name, String address, String phone, String email, String position, double salary, String rank){
        super(id, name, address, phone, email, position, salary);
        this.rank = rank;
    }
     /**
     * accessor for the rank
     * @return value of the rank
     */
    public String getRank(){return rank;}
     /**
     * mutator for the rank
     * @param r value of the rank
     */
    public void setRank(String r){rank = r;}
    /**
     * Accessor for the Faculty attributes
     * @return formatted string with the object attributes
     */
    public String toString(){
        return super.toString() + String.format("Rank: %s\n", rank);
    }
}