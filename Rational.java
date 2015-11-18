public class Rational{
    private int numerator;
    private int denominator;

    public Rational(){
	numerator = 0;
	denominator = 1;
    }

    public Rational(int a ,int b){
	if (b == 0){
	    System.out.println("Only non-zero intergers for the denominator");	
	    numerator = 0;
	    denominator = 1;
	}
	else{
	    numerator = a;
	    denominator = b;
	}
    }

    public String toString(){
	return numerator + "/" + denominator;
    }

    public double floatValue(){
	return numerator / denominator;
    }

    public void multiply(Rational n){
	int newnum = numerator * n.numerator;
	int newdom = denominator * n.denominator;
	numerator = newnum;
	denominator = newdom;
    }

    public void divide(Rational n){
	int newnum = numerator * n.denominator;
	int newdom = denominator * n.numerator;
	numerator = newnum;
	denominator = newdom;
    }

    public static void main(String args[]){
        Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	r.multiply(s); //Multiplies r by s, changes r to 2/6.
	Rational d = new Rational(10,9); //Stores the rational number 10/9
	Rational f = new Rational(2,7); //Stores the rational number 2/7
	d.divide(f); //Divides d by f 
	System.out.println(d.toString());
    }	
}
