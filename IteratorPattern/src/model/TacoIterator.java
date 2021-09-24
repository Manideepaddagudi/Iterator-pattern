package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TacoIterator implements Iterable<Taco> {

	List<Taco> avail_taco_list;

	public TacoIterator() {
		avail_taco_list = new ArrayList<Taco>();
	}

	public void addTaco(Taco taco) {
		avail_taco_list.add(taco);
	}

	public Iterator<Taco> iterator() {
		return (Iterator<Taco>) new TacoItemIterator();
	}

	class TacoItemIterator implements Iterator<Taco> {
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
		public Taco next() {
			return avail_taco_list.get(currentIndex++);
		}

		@Override
		public void remove() {
			avail_taco_list.remove(--currentIndex);
		}

	}
}
