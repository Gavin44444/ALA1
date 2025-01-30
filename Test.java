/**
 * Class Test used to run the code 
 * @author: Gavin Crowley
 * @version: 01
 */
public class Test{
    //main method
    public static void main(String[] args){ 
        //creating an array of 3 people and inputing their attributes 
        Person[] people = new Person[3];
        people[0] = new Student(123456789, "Paul Leister", "972 4th Street, Allentown", "610-331-7177", "pleister@gmail.com", "CSE");
        people[1] = new Employee(334422110, "Beth Down", "234 Main Street, Philadelphia", "484-222-4433", "bdown@gmail.com", "System Administrator", 75000.00);
        people[2] = new Faculty(222222222, "Mark Jones", "21 Orchid Street, Bethlehem", "610-333-2211", "mjones@gmail.com", "Faculty", 100000.00, "Associate Professor");
        //print original list
        System.out.println("Original list:");
        printArray(people);
        //print list sorted by name
        System.out.println("Sorted list (name):");
        printArray(sortArray(people, true));
        //print list sorted by ID
        System.out.println("Sorted list (ID):");
        printArray(sortArray(people, false));
    }
    /**
     * Prints the information of each person in the array.
     * 
     * @param list An array of Person objects to print
     */
    public static void printArray(Person[] list){
        for(Person p: list){
            System.out.println(p.toString());
        }
    }
    /**
     * Sorts the array of Person objects by name or id
     * If idOrName is true, the list is sorted by name; otherwise, it is sorted by ID.
     * @param list An array of Person objects
     * @param idOrName A boolean used to determine what we are sorting based on (true for name, false for ID)
     * @return A sorted array of Person objects
     */
    public static Person[] sortArray(Person[] list, boolean idOrName){
        for(int i=0; i<list.length; i++){
      		int minIndex = i;
      		for(int j=i+1; j<list.length; j++)  
                if(idOrName){
                    if(list[j].getName().compareTo(list[minIndex].getName()) < 0)
                        minIndex=j;
                } else{
                    if (list[j].getID() < list[minIndex].getID())
                        minIndex=j;
                }
                Person temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;    
    	}
        return list;
    }
}
