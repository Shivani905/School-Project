package methodStudy;

public class Familyinfo {

	public static void main(String[] args)
	{
		familyinfo1();
		Familyinfo f =new Familyinfo();
		f.familyinfo2();
		familyinfo3(3, "Tundalwar", 1, 5.9f, 'm');
		f.familyinfo4(3, "Tundalwar", 1, 5.9f, 'm');
    }
	 public static void familyinfo1()
	   {
		 int family_members =3;
		 String surname ="Tundalwar";
		 int smallest_mem_age = 1;
		 float tallest_mem_height = 5.9f;
		 char gender ='M';
		 
		 System.out.println("Static without parameter");
		 System.out.println("                        ");
		 System.out.println("Total family member is "+family_members);
		 System.out.println("Surname is "+surname);
		 System.out.println("The smallest member age is "+smallest_mem_age);
		 System.out.println("The tallest member height is "+tallest_mem_height);
		 System.out.println("The head member gender is "+gender);
		 System.out.println("                        ");
	 }
	 
	   public void familyinfo2()
	    {
		 int family_members =3;
		 String surname ="Tundalwar";
		 int smallest_mem_age = 1;
		 float tallest_mem_height = 5.9f;
		 char gender ='M';
		 
		 System.out.println("Non-static without parameter");
		 System.out.println("                        ");
		 System.out.println("Total family member is "+family_members);
		 System.out.println("Surname is "+surname);
		 System.out.println("The smallest member age is "+smallest_mem_age);
		 System.out.println("The tallest member height is "+tallest_mem_height);
		 System.out.println("The head member gender is "+gender);
		 
	   }
	   public static void familyinfo3(int family_members, String surname,int smallest_mem_age, float tallest_mem_height,char gender)
	    {
		 System.out.println("static with parameter");
	     System.out.println("                        ");
	     System.out.println("Total family member is "+family_members);
	     System.out.println("Surname is "+surname);
	     System.out.println("The smallest member age is "+smallest_mem_age);
	     System.out.println("The tallest member height is "+tallest_mem_height);
	     System.out.println("The head member gender is "+gender);
		 
	     }
	   public void familyinfo4(int family_members, String surname,int smallest_mem_age, float tallest_mem_height,char gender)
	   {
		   System.out.println("Non-static with parameter");
			 System.out.println("                        ");
			 System.out.println("Total family member is "+family_members);
			 System.out.println("Surname is "+surname);
			 System.out.println("The smallest member age is "+smallest_mem_age);
			 System.out.println("The tallest member height is "+tallest_mem_height);
			 System.out.println("The head member gender is "+gender);
		   
	   }
}
