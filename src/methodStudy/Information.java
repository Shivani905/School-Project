//With Parameter

package methodStudy;

public class Information {

	public static void main(String[] args) 
	{
		detail("Velocity",1215,12.05f,'m',"ENG");
	    Information i=new Information();
		i.details("Nagpur", "civil line", 9874563210l);
		
		Information12 i2=new Information12();
		i2.parking("girls", 140.25f);
		i2.openarea(21, "okok");
	
	}
	
	 public static void detail(String name,int PRN,float weight,char gender,String dept) 
	 {
		 System.out.println("Name is "+name);
		 System.out.println("PRN number is "+PRN);
		 System.out.println("Weight is "+weight);
		 System.out.println("Gender is "+gender);
		 System.out.println("Department is "+dept);
	 }
	 
     public void details(String name,String area,long mob)
     {
    	 System.out.println("Name is"+name);
    	 System.out.println("Area name is"+name);
    	 System.out.println("Mobile number is "+mob);
     }
	

}
