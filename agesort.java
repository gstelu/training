package practice1;

public class agesort {
	private String name;
	private int age;
	private double salary;
  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
 public agesort(String n,int a,double s) {
	 this.name=n;
	 this.age=a;
	 this.salary=s;	 
 }
public static void main(String[] args) {
	agesort d[]=new agesort[4];
	  agesort d0= new agesort("sankar",21,50000);
	  agesort d1= new agesort("pravali",19,65435);
	  agesort d2= new agesort("shiva",24,77975);
	  agesort d3= new agesort("parvathi",22,77697);
	  d[0]=d0;
	  d[1]=d1;
	  d[2]=d2;
	  d[3]=d3;
	  for(int i=0;i<d.length-1;i++)
	  {
		  for(int j=i+1;j<d.length;j++)
		  {
			  if(d[i].getAge()>d[j].getAge())
			  {
				  agesort temp = d[i];
				  d[i]=d[j];
				  d[j]=temp;
			  }
		  }
	  }
	
	  for(agesort emp:d)
	  {
		  System.out.println(emp.getName() + " "+ emp.getAge()+" "+emp.getSalary());
	  }
	
  }
}

