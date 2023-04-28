public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator)
    {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = getGCD(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int lcm = getLCM(denominator, other.denominator);
        int newNumerator = numerator * (lcm / denominator) + other.numerator * (lcm / other.denominator);
        return new RationalNumber(newNumerator, lcm);
    }

    public RationalNumber subtract(RationalNumber other) {
        int lcm = getLCM(denominator, other.denominator);
        int newNumerator = numerator * (lcm / denominator) - other.numerator * (lcm / other.denominator);
        return new RationalNumber(newNumerator, lcm);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public int compareTo(RationalNumber other) {
        int lcm = getLCM(denominator, other.denominator);
        int thisNumerator = numerator * (lcm / denominator);
        int otherNumerator = other.numerator * (lcm / other.denominator);
        return Integer.compare(thisNumerator, otherNumerator);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        int newNumerator = Math.abs(numerator);
        int newDenominator = Math.abs(denominator);
        return new RationalNumber(newNumerator, newDenominator);
    }

    private int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    private int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide four integers as input.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int denom1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int denom2 = Integer.parseInt(args[3]);

        RationalNumber rn1 = new RationalNumber(num1, denom1);
        RationalNumber rn2 = new RationalNumber(num2, denom2);

        System.out.println("Rational number 1: " + rn1.getNumerator() + "/" + rn1.getDenominator());
        System.out.println("Rational number 2: " + rn2.getNumerator() + "/" + rn2.getDenominator());

        // You can call the functions like this:
        RationalNumber sum = rn1.add(rn2);
        RationalNumber difference = rn1.subtract(rn2);
        RationalNumber product = rn1.multiply(rn2);
        RationalNumber quotient = rn1.divide(rn2);
        int comparison = rn1.compareTo(rn2);
        double decimalValue = rn1.toDouble();
        RationalNumber absValue = rn1.abs();

        // Then you can print the results like this:
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());
        System.out.println("Comparison result: " + comparison);
        System.out.println("Decimal value of rational number 1: " + decimalValue);
        System.out.println("Absolute value of rational number 1: " + absValue.getNumerator() + "/" + absValue.getDenominator());
    }
}
