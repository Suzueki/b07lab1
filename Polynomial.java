public class Polynomial {
    private double[] coeffs;

    public Polynomial() {
        this.coeffs = new double[]{0};
    }

    public Polynomial(double[] input) {
        this.coeffs = new double[input.length];
        for (int i = 0; i < input.length; i++) {this.coeffs[i] = input[i];}
    }

    public Polynomial add(Polynomial x) {
        double[] result = new double[Math.max(this.coeffs.length, x.coeffs.length)];

        for (int i = 0; i < Math.max(this.coeffs.length, x.coeffs.length); i++) {
            double a,b;
            if (i < this.coeffs.length) {a = this.coeffs[i];} 
            else {a = 0;}

            if (i < x.coeffs.length) {b = x.coeffs[i];}
            else {b = 0;}
            result[i] = a + b;
        }
        return new Polynomial(result);
    }


    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < this.coeffs.length; i++) {result = result + this.coeffs[i] * Math.pow(x, i);}
        return result;
    }

    public boolean hasRoot(double x) {
        return this.evaluate(x) == 0;
    }
}
