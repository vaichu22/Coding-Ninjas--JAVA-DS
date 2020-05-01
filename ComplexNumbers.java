package com;

//import com.ComplexNumberUse.ComplexNumbers;

public class ComplexNumbers {
	
		// Complete this class
	    public int real;
	    public int imaginary;
	    
	    public ComplexNumbers(int real,int imaginary)
	    {
	        this.real=real;
	        this.imaginary= imaginary;
	    }
		public void plus(ComplexNumbers c2)
	    {
	        real= this.real+c2.real;
	        imaginary= this.imaginary+c2.imaginary;
	        System.out.println(this.real);
	        System.out.println(this.imaginary);
	        
	    }
	    public void multiply(ComplexNumbers c2)
	    {
	        int newReal=(this.real*c2.real)+(-(this.imaginary*c2.imaginary));
	        int newImaginary=(this.real*c2.imaginary)+(this.imaginary*c2.real);
	       this.real=newReal;
	       this.imaginary=newImaginary;
	    }
	    public void print()
	    {
	        System.out.println(this.real+" + i"+this.imaginary);
	    }
	}


