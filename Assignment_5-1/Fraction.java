public class Fraction {
    private int num, denom;
    Fraction() {
        num = 0;
        denom = 1;
    }

    Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
        if (denom == 0) {
            System.out.println("num == " + num);
            System.out.println("denom == 0");
            System.out.println("Denom can't be 0.");
            denom = 1;
        }
        this.reduce();
    }

    Fraction(String frac) {
        int iSlash = frac.indexOf("/");
        num = Integer.parseInt(frac.substring(0, iSlash));
        denom = Integer.parseInt(frac.substring(iSlash + 1));
        if (denom == 0) {
            System.out.println("num == " + num);
            System.out.println("denom == 0");
            System.out.println("Denom can't be 0.");
            denom = 1;
        }
        this.reduce();
    }

    Fraction(Fraction frac) {
        num = frac.getNum();
        denom = frac.getDenom();
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    public String toString() {
        return num + "/" + denom;
    }

    public double toDouble() {
        return (double) num/denom;
    }

    private void reduce() {
        int gcdenominator = gcf(num, denom);
        num /= gcdenominator;
        denom /= gcdenominator;
    }

    public int setNum(int num) {
        int _num = this.num;
        this.num = num;
        this.reduce();
        return _num;
    }

    public int setDenom(int denom) {
        int _denom = this.denom;
        this.denom = denom;
        if (denom == 0) {
            System.out.println("num == " + num);
            System.out.println("denom == 1");
            System.out.println("Denom can't be 0.");
            denom = 1;
        }
        this.reduce();
        return _denom;
    }

    public static Fraction multiply(Fraction factor1, Fraction factor2) {
        return new Fraction(factor1.getNum() * factor2.getNum(), factor1.getDenom() * factor2.getDenom());
    }

    public Fraction multiply(Fraction factor) {
        int _num = num;
        int _denom = denom;
        Fraction thisPrime = Fraction.multiply(this, factor);
        num = thisPrime.getNum();
        denom = thisPrime.getDenom();
        return new Fraction(_num, _denom);
    }

    public static Fraction divide(Fraction dividend, Fraction divisor) {
        return new Fraction(dividend.getNum() * divisor.getDenom(), dividend.getDenom() * divisor.getNum());
    }

    public Fraction divide(Fraction divisor) {
        int _num = num;
        int _denom = denom;
        Fraction thisPrime = Fraction.divide(this, divisor);
        num = thisPrime.getNum();
        denom = thisPrime.getDenom();
        return new Fraction(_num, _denom);
    }

    public static Fraction add(Fraction addend1, Fraction addend2) {
        int denom1 = addend1.getDenom();
        int denom2 = addend2.getDenom();
        return new Fraction(addend1.getNum() * denom2 + addend2.getNum() * denom1, denom1 * denom2);
    }

    public Fraction add(Fraction addend) {
        int _num = num;
        int _denom = denom;
        Fraction thisPrime = Fraction.add(this, addend);
        num = thisPrime.getNum();
        denom = thisPrime.getDenom();
        return new Fraction(_num, _denom);
    }

    public static Fraction subtract(Fraction minuend, Fraction subtrahend) {
        int denomMinuend = minuend.getDenom();
        int denomSubtrahend = subtrahend.getDenom();
        return new Fraction(minuend.getNum() * denomSubtrahend - subtrahend.getNum() * denomMinuend, denomMinuend * denomSubtrahend);
    }

    public Fraction subtract(Fraction subtrahend) {
        int _num = num;
        int _denom = denom;
        Fraction thisPrime = Fraction.subtract(this, subtrahend);
        num = thisPrime.getNum();
        denom = thisPrime.getDenom();
        return new Fraction(_num, _denom);
    }

    private int gcf(int multiple1, int multiple2) {
        while (multiple1 != 0 && multiple2 != 0) {
            multiple1 %= multiple2;
            int newMultiple2 = multiple1;
            multiple1 = multiple2;
            multiple2 = newMultiple2;
        }
        return Math.abs(multiple1 + multiple2);
    }
}