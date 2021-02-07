package Iterator;

/**
 *
 * @author MSI
 */
public class patientDemo {

    
    public static void main(String[] args) {
        patientListIterator iterator = new patientListIterator();
        
        for(Iterator iteratorPattern = iterator.getIterator();iteratorPattern.hasNext();){
            String nameOfPatient = (String) iteratorPattern.next();
            System.out.println("Name of patient: " + nameOfPatient);
        }
    }
    
}
