package Iterator;


public class patientListIterator implements patientDetails{
    
    public String nameOfPatient[] = {"Chamara","Sanduni","Dushan","Nadun"};
    
    public Iterator getIterator(){
        return (Iterator) new Details();
    }
    
    private class Details implements Iterator {

        int patientIndex;
        
        @Override
        public boolean hasNext() {
            if(patientIndex < nameOfPatient.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return nameOfPatient[patientIndex++];
            }
            return null;
        }
        
    }
    
    
}
