package by.metelski.studenttask.comparator;

import java.util.Comparator;
import by.metelski.studenttask.entity.Person;

public class PersonByIdComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {		
		return (int)(o1.getId()-o2.getId());
	}
}
