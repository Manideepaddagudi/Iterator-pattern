package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class VeggieTacoIterator implements Iterable<MXStyleVeggieTaco> {

	List<MXStyleVeggieTaco> avail_taco_list;

	public VeggieTacoIterator() {
		avail_taco_list = new ArrayList<MXStyleVeggieTaco>();
	}

	public void addTaco(MXStyleVeggieTaco taco) {
		avail_taco_list.add(taco);
	}

	public Iterator<MXStyleVeggieTaco> iterator() {
		return (Iterator<MXStyleVeggieTaco>) new TacoItemIterator();
	}

	class TacoItemIterator implements Iterator<MXStyleVeggieTaco> {
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
		public MXStyleVeggieTaco next() {
			return avail_taco_list.get(currentIndex++);
		}

		@Override
		public void remove() {
			avail_taco_list.remove(--currentIndex);
		}

	}
}
