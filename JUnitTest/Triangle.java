package JUnitTest;

public class Triangle {

		 int a;  
		 int b;  
	     int c;    
		
		public Triangle(int a, int b, int c) throws Exception{  
			if(a<=0||b<=0||c<=0)    throw new Exception("Du lieu khong hop le!");   
			this.a = a;   
			this.b = b;   
			this.c = c;  
		} 
		public int CheckTriangle(){   
			boolean isTriangle=false;   
			if(a<b+c&&b<a+c&&c<a+b)    isTriangle=true;   
			if(isTriangle){    
				if(a==b&&b==c)     return 2;//tam giac deu   
				else if(a!=b&&a!=c&&b!=c)     return 0;//tam giac thuong    
				     else     return 1;//tam giac can   
			}   
				return -1;//khong phai tam giac 
		  	
		}
	public static void main(String args[])throws Exception{
		Triangle t=new Triangle(0,0,0);
	}

		
}
