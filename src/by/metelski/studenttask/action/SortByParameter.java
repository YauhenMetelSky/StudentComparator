package by.metelski.studenttask.action;

import java.util.Comparator;
import java.util.List;

import by.metelski.studenttask.entity.Person;
import by.metelski.studenttask.entity.Student;

public class SortByParameter {

	  public void sortById(List<Student> persons, Comparator<Person> comparator) {
		  persons.sort(comparator);
	  }
}
