package Collection;

import java.util.Collections;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Comparable <Student>
{
	int rollno,age;
	String name;
	
	Student(int rollno,String name,int age)
	{
		super();
		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}



	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age<st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableInterface
{

	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(1,"lonkar",88));
		al.add(new Student(2,"onkar",82));
		al.add(new Student(3,"patil",83));
		
		
		Collections.sort(al);
		
		for(Student st:al)
		{
			System.out.println(st);
		}
		
		
	}
}
