package test.metelski.studenttask.action;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.metelski.studenttask.action.SortByParameter;
import by.metelski.studenttask.comparator.PersonByIdComparator;
import by.metelski.studenttask.entity.Student;

public class SortByParameterTest extends Assert {
	List<Student> expectedResult;
	List<Student> actualResult;
	List<Student> studentsTestList;
	SortByParameter sorter;
	PersonByIdComparator comparator;

	@BeforeTest
	public void setUp() {
		sorter = new SortByParameter();
		comparator = new PersonByIdComparator();
		Student student1 = new Student(1, "Ivan");
		Student student2 = new Student(7, "Petr");
		Student student3 = new Student(2, "Simon");
		Student student4 = new Student(5, "Natali");
		Student student5 = new Student(3, "Paul");
		Student student6 = new Student(4, "Alex");
		Student student7 = new Student(6, "Irin");
		studentsTestList = new ArrayList<>();
		studentsTestList.add(student1);
		studentsTestList.add(student2);
		studentsTestList.add(student3);
		studentsTestList.add(student4);
		studentsTestList.add(student5);
		studentsTestList.add(student6);
		studentsTestList.add(student7);
		expectedResult = new ArrayList<>();
		expectedResult.add(student1);
		expectedResult.add(student3);
		expectedResult.add(student5);
		expectedResult.add(student6);
		expectedResult.add(student4);
		expectedResult.add(student7);
		expectedResult.add(student2);		
	}
	@AfterTest
	public void tearDown() {
		expectedResult=null;
		actualResult=null;
		comparator=null;
		sorter=null;
		studentsTestList=null;
	}
	@Test
	public void testSortById() {
		sorter.sortById(studentsTestList, comparator);
		actualResult=studentsTestList;
		assertEquals(actualResult, expectedResult);
	}
}
