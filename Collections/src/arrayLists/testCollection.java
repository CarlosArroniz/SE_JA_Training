package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class testCollection 
{
	public static void main(String[] args)
	{
		//Creating user-defined class objects
		
		Student s1 = new Student(101, "Estudiante 1", 10);
		Student s2 = new Student(102, "Estudiante 2", 20);
		Student s3 = new Student(103, "Estudiante 3", 30);
		
		//Creating arrayList
		
		ArrayList<Student> student_al = new ArrayList<Student>();
		
		student_al.add(s1);//adding Student class object
		student_al.add(s2);
		student_al.add(s3);
		
		//Getting Iterator
		Iterator itr=student_al.iterator();
		
		//traversing elements of arraylist object
		
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
