package collection_questions;

import java.util.HashSet;
import java.util.Iterator;

public class Question_9 {

    public static void main(String[] args) {
        
        HashSet<String> employeeNames = new HashSet<>();

      
        employeeNames.add("Bharath");
        employeeNames.add("Pobbathi");
        employeeNames.add("Sahithi");
        employeeNames.add("Paluru");
        employeeNames.add("Revathi");

        
        System.out.println("Employee Names (using Iterator):");
        Iterator<String> it = employeeNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
