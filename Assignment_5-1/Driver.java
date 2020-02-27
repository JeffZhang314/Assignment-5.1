public class Driver {
    public static void main(String[] args) {
        System.out.println("0/1 = " + new Fraction());
        Fraction fraction1 = new Fraction("-2/-4");
        System.out.println("-1/-2 = " + fraction1);
        Fraction fraction2 = new Fraction(-2, -4);
        System.out.println("-1/-2 = " + fraction2);
        System.out.println("-1 = " + fraction1.getNum());
        double denom11 = fraction1.getDenom();
        System.out.println("-2.0 = " + denom11);
        System.out.println("-1/-2 = " + fraction1.toString());
        System.out.println("0.5 = " + fraction1.toDouble());
        System.out.println("-1 = " + fraction1.setNum(12));
        System.out.println("6/-1 = " + fraction1);
        int denom12 = fraction1.setDenom(10);
        System.out.println("-1 = " + denom12);
        System.out.println("3/5 = " + fraction1);
        System.out.println("26/49 = " + Fraction.multiply(new Fraction("-39/35"), new Fraction(-10, 21)));
        Fraction fraction3 = new Fraction("-39/35");
        System.out.println("-39/35 = " + fraction3.multiply(new Fraction(-10, 21)));
        System.out.println("26/49 = " + fraction3);
        System.out.println("-117/-50 = " + Fraction.divide(new Fraction("-39/35"), new Fraction(-10, 21)));
        Fraction fraction4 = new Fraction("-39/35");
        System.out.println("-39/35 = " + fraction4.divide(new Fraction(-10, 21)));
        System.out.println("-117/-50 = " + fraction4);
        System.out.println("-167/105 = " + Fraction.add(new Fraction("-39/35"), new Fraction(-10, 21)));
        Fraction fraction5 = new Fraction("-39/35");
        System.out.println("-39/35 = " + fraction5.add(new Fraction(-10, 21)));
        System.out.println("-167/105 = " + fraction5);
        System.out.println("-67/105 = " + Fraction.subtract(new Fraction("-39/35"), new Fraction(-10, 21)));
        Fraction fraction6 = new Fraction("-39/35");
        System.out.println("-39/35 = " + fraction6.subtract(new Fraction(-10, 21)));
        System.out.println("-67/105 = " + fraction6);
    }
}