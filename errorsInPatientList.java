package Iterator;

/**
 *
 * @author MSI
 */
public class errorsInPatientList implements Iterator{
    
    public errorsInPatientList(){
        
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
}
