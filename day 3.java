imort java util.*;
class student
{
   public static void main(string[] args)
   {
     int markA=new int[5];
     int i;
	float sum=0;
	float per;
	float avg;
	scanner scan = new Scanner(system.in);
	System.out.println("enter marks");
	for(i=0;i<5;i++)
	{
	  markA[i]=scan.nextInt();
	  sum=sum+markA[i];
	}
    avg=sum/5;
    per=(sum/500)*100;
   System.out.println("\n per="+per+"%");
   System.out.println("grade is");
   if(avg>85)
   { 
     System.out.println("A");
   }
   else if(avg>70&&avg<=85)
   {
     System.out.println("c");
   }
  else if(avg>55&&avg<=70)
   {
	System.out.println("c");
	}
	else
	 {
	    System.out.println("D");
	 }
	}
}
