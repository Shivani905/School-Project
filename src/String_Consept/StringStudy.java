package String_Consept;

public class StringStudy
{

	public static void main(String[] args)
	{
		//1.Length method()
	  String s = "Tundalwars";
	  
	  //1st way just to print the length
	  System.out.println("String length is "+s.length());
	  
	  //2nd way to print string length , we can re-use the length
	  
	  int lengthOfString = s.length();
	  
	 System.out.println(lengthOfString);
	 //=============================================================================
	 
	 String a="Software Testing";
			 
	System.out.println(a.length());
	//==============================================================================
	
	System.out.println("====================================================");
	
	//2.toUpperCase()
	
	System.out.println(s);
	System.out.println(s.toUpperCase());
	
	//Using Reference Variable
	
	String s1 = s.toUpperCase();
	System.out.println(s1);
	System.out.println("===============================");
	
	//===========================================================================
	
	//3.toLowerCase
			
	System.out.println(s);
	System.out.println(s.toLowerCase());
	
	//Using Refrence Variable
	
	String s2 = s.toLowerCase();
	System.out.println(s2);
	System.out.println("=========================================");
	
	//============================================================
	
	///4.equals() method & equalsIgnoreCase
	
	String x="pune";
	String y="pune";
	String p=new String("pune");
	String q=new String("pune");
	String z=new String("PUNE");
	
	System.out.println(x==y);
	System.out.println(x==p);
	System.out.println(p==q);
	System.out.println(x==z);
	
	System.out.println("======");
	
	System.out.println(x.equals(y));
	System.out.println(x.equals(p));
	System.out.println(p.equals(q));
	System.out.println(q.equals(p));
	System.out.println(q.equals(z));
	System.out.println(q.equalsIgnoreCase(z));
	System.out.println("===================");
	
	//======================================================
	
	//5.contains() method
	String s3="Nagpur";
	System.out.println(s3.contains("pune"));
	
	//Using refrence variable
	
	boolean result= s3.contains("e");
	
	System.out.println("Result is "+result);
	System.out.println("=============================");
	//============================================
	
	//6.isEmpty() method
	
	String a1="pune";
	String a2=" ";
	String a3="";
	System.out.println("a1 result is "+a1.isEmpty());
	System.out.println("a2 result is "+a2.isEmpty());
	System.out.println("a3 result is "+a3.isEmpty());
	System.out.println("============================");
	//=====================================
	
	//7.isBlanck() method
	
	System.out.println("a1 result is "+a1.isBlank());
	System.out.println("a2 result is "+a2.isBlank());
	System.out.println("a3 result is "+a3.isBlank());
	System.out.println("=======================");
	
	//================================
	
	//8. charAt() method
	
	String b= "Chandrapur";
	 System.out.println(b.charAt(1));
	 
	 //Using refrence variable
	 
	 char ans =b.charAt(2);
	 System.out.println("Ans is "+ans);
	 
	 System.out.println("===============");
	 //==================================
	 
	// 9. endsWith() AND startsWith() method
	 
	 String k="Maharashtra";
	 
	 System.out.println(k.startsWith("Maha"));
	 System.out.println(k.endsWith("tra"));
	 System.out.println(k.startsWith("aha",1));
	 System.out.println("============================");
	 //======================================
	 
	 //10. substring() method
	 
	 String g="I am in Nagpur";
	 
	 System.out.println(g.substring(5));
	 
	 //Using refrence variable
	 
	 String g1= g.substring(5);
	 
	 System.out.println("Substring is "+g1);
	 
	 System.out.println(g.substring(6, 11));
	
	 
	 System.out.println("=========================");
	 //=========================================
	 
	 //11.concat() method
	 
	 String r1 ="GOOD";
	 String r2 ="MORNING";
	 
	 System.out.println(r1.concat(r2));
	 System.out.println(r1.concat("Night"));
	 System.out.println("================================");
	 //====================================
	 
	 //12. indexOf()
	 
	 String l="Hello Hello";
	 
	 System.out.println(l.indexOf("l"));
	 System.out.println(l.lastIndexOf("o"));
	 System.out.println(l.indexOf("o",5));
	 System.out.println("================================");
	 //============================================
	 
	 //13.replace() method
	 
	 String x1="UnHappy";
	 
	 System.out.println(x1.replace("Un", ""));
	 System.out.println(x1.replace("Un", "Very"));
	 System.out.println("=======================");
	 //================================================
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  

	}

}
