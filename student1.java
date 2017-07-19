package guvi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class student {
		 String name;
		 int mark1;
		 int mark2;
		 int mark3;
		 int mark4,mark5,mark6;
		 int total;
		student(String name,int mark1,int mark2,int mark3)
		{
			this.name=name;
			this.mark1=mark1;
			this.mark2=mark2;
			this.mark3=mark3;
			this.total=mark1+mark2+mark3;
		}

		public static void main(String[] args)
		{
			int max=0;
			student s1= new student ("dhivya",90,78,90);
			student s2= new student("hanifa",89,56,90);
			student s3=new student("sathish",74,99,90);
			ArrayList<student> st=new ArrayList<student>();
			st.add(s1);
			st.add(s2);
			st.add(s3);
			Iterator i1=st.iterator();
			Iterator i2=st.iterator();
			while(i1.hasNext())
			{
				student s=(student)i1.next();
				if(s.total>max)
				{
					max=s.total;
				}
				System.out.println(s.total+" "+s.name);
			}
				while(i2.hasNext())
				{
					student st1=(student)i2.next();
					if(max==st1.total)
					{
						System.out.println(st1.name);
			           
			}

		}
		}



}
