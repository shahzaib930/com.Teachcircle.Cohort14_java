package day28_Review_Encapslation;


	public class Fraction {
	    private int numerator;
	    private int denominator;

	    public Fraction(int numerator, int denominator) {
	        this.numerator = numerator;
	        this.denominator = denominator;
	    }

	    public int getNumerator() {
	        return numerator;
	    }

	    public void setNumerator(int numerator) {
	        this.numerator = numerator;
	    }

	    public int getDenominator() {
	        return denominator;
	    }

	    public void setDenominator(int denominator) {
	        this.denominator = denominator;
	    }

	    public Fraction add(Fraction other) {
	        int resultNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
	        int resultDenominator = this.denominator * other.denominator;
	        return new Fraction(resultNumerator, resultDenominator);
	    }

	    public Fraction multiply(Fraction other) {
	        int resultNumerator = this.numerator * other.numerator;
	        int resultDenominator = this.denominator * other.denominator;
	        return new Fraction(resultNumerator, resultDenominator);
	    }

	    public static void main(String[] args) {
	        Fraction fraction1 = new Fraction(1, 2);
	        Fraction fraction2 = new Fraction(3, 4);

	        Fraction sum = fraction1.add(fraction2);
	        Fraction product = fraction1.multiply(fraction2);

	        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
	        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
	    }
	}


