public class CarInsurance {
    static final int MIN_INSURANCE = 210;

    public static int CountInsurance (double experience, double accident, int power) throws IllegalArgumentException {

        if (experience > 81) {
            throw new IllegalArgumentException("Impossible"); }
            else if (experience  >= 5 && experience <=81) {
            experience = 100;
        } else if (experience > 1 && experience < 5) {
            experience = 200;
        }
        if (experience <= 0) throw new IllegalArgumentException("Impossible");
        else if (experience <= 1) {
            experience = 300;
        }

        if (accident < 0) {
            throw new IllegalArgumentException("Impossible"); }
            else if  (accident == 0) {
                accident = (int) (experience * 0.9);
            } else if (accident == 1) {
                accident = (int) (experience * 1.5);
            } else if (accident == 2) {
                accident = (int) (experience * 2.5);
            } else if (accident > 2) {
                accident = experience * 4;
            }

            if (power <= 0) throw new IllegalArgumentException("Impossible");
            if (power >  800 ) throw new IllegalArgumentException("Impossible");
            else if (power <= 50) {
                power = (int) (accident * 0.6);
            } else if (power > 50 && power <= 100) {
                power = (int) accident;
            } else if (power > 100 && power <= 150) {
                power = (int) (accident * 1.4);
            } else if (power > 150) {
                power = (int) (accident * 1.6);
                          }

            if (power < MIN_INSURANCE) {
               power = MIN_INSURANCE;
                System.out.println("Your Insurance = " + power);
            } else if (power > MIN_INSURANCE) {
                System.out.println("Your Insurance = " + power);
            }
            return (int) power;
        }
    }

