package javaPrograms;

public class Fabonacci {

	public static void main(String[] args) {
		System.out.println(fibo(12)+"");
		fibonacci(13);
	}

	 //kuuiui
	public static int fibo(int x) {
		int fabonacci=0;
		if(x==1||x==2)
			return 1;
		int fab1=1,fab2=1;
		for(int y=3;y<=x;y++) {
			fabonacci= fab1+fab2;
			fab1=fab2;
			fab2=fabonacci;
		}
		
		return fabonacci;
	}
	
	  //jhhlkhdrder
	

		public static int fibonacci(int number){
      if(number == 1 || number == 2){
    	  return 1; 
    	}
      int z= fibonacci(number-1) + fibonacci(number -2);
      System.out.println(z);
      	return z; 
      			
      }

		
	
	
	
	
}
