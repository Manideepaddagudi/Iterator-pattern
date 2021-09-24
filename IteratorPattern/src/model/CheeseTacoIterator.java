package model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheeseTacoIterator implements Iterable<MXStyleCheeseTaco>{

	  List<MXStyleCheeseTaco> avail_taco_list;
	  
	    public CheeseTacoIterator() {
	    	avail_taco_list = new ArrayList<MXStyleCheeseTaco>();
	    }
	 
	    public void addTaco(MXStyleCheeseTaco taco) {
	    	avail_taco_list.add(taco);
	    }
	 
	    public Iterator<MXStyleCheeseTaco> iterator() {
	        return (Iterator<MXStyleCheeseTaco>) new TacoItemIterator();
	    }
	 
	    class TacoItemIterator implements Iterator<MXStyleCheeseTaco> {
	        int currentIndex = 0;
	 
	        @Override
	        public boolean hasNext() {
	            if (currentIndex >= avail_taco_list.size()) {
	                return false;
	            } else {
	                return true;
	            }
	        }
	 
	        @Override
	        public MXStyleCheeseTaco next() {
	            return avail_taco_list.get(currentIndex++);
	        }
	 
	        @Override
	        public void remove() {
	        	avail_taco_list.remove(--currentIndex);
	        }

	    }
}

