package Zadaci_22_08_2016;

public class LinearEquations {

	private double a,b,c,d,e,f;
	public LinearEquations(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
	}
	double getA(){
		return a;
	}
	double getB(){
		return b;
	}
	double getC(){
		return c;
	}
	double getD(){
		return d;
	}
	double getE(){
		return e;
	}
	double getF(){
		return f;
	}
	boolean isSolvable(){
		if((a*d - b*c)==0){
			return false;
		}else{
			return true;
		}
	}
	double getX(){
		double x = ((e*d)-(b*f))/((a*d)-(b*c));
		return x;
	}
	double getY(){
		double y = ((a*f)-(e*c))/((a*d)-(b*c));
		return y;
	}
	void printResult(){
		if(isSolvable()==false){
			System.out.println("The equations has no solutions.");
		}
		else{
			System.out.println("Rijesenje x je: "+getX()+"\nRijesenje y je: "+getY());
		}
	}
	public static void main(String[] args) {
		LinearEquations obj = new LinearEquations(1, 13, 4, 12, 5, 3);
		obj.printResult();

	}

}

