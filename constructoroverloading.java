
class Student1
{
  String name;
   int age;
	
	public Student1()
	
	{
	
		name="Ashutosh";
		age=21;
	}
    
	public Student1(String name)
	{
		this.name=name;
		age=20;
	}
	 
	public Student1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
  }

 public class constructoroverloading{
	 public static void main (String args[]) {
	
		 Student1 stu1= new Student1();
	      stu1.disp();
		 Student1 stu2= new Student1("Sanjay");
		  stu2.disp();
		 Student1 stu3= new Student1("Shelke",23);
		  stu3.disp();
		 
	 }
	 
 }