public class CarInsurance {
    static final int MIN_INSURANCE = 210;

    public static int CountInsurance (double experience, double accident, int power) throws IllegalArgumentException {

        if (experience > 81) {
            throw new IllegalArgumentException("Impossible"); }
            else if (experience  >= 5 && experience <=81) {
            experience = 100;
            Log.info("Add 100 rub");

        } else if (experience > 1 && experience < 5) {
            experience = 200;
            Log.info(" Add 200 rub");
        }
        if (experience <= 0) throw new IllegalArgumentException("Impossible");
        else if (experience <= 1) {
            experience = 300;
            Log.info(" Add 300 rub ");
        }

        if (accident < 0) {
            throw new IllegalArgumentException("Impossible"); }
            else if  (accident == 0) {
                accident = (int) (experience * 0.9);
                Log.info("Number of accidents is 0  -  multiply 0.9 index ");
            } else if (accident == 1) {
                accident = (int) (experience * 1.5);
                Log.info("Number of accidents is 1  -  multiply 1.5 index ");
            } else if (accident == 2) {
                accident = (int) (experience * 2.5);
                Log.info("Number of accidents is 2  -  multiply 2.5 index ");
            } else if (accident > 2) {
                accident = experience * 4;
                Log.info("Number of accidents more than 2  -  multiply 4 index ");
            }

            if (power <= 0) throw new IllegalArgumentException("Impossible");
            if (power >  800 ) throw new IllegalArgumentException("Impossible");
            else if (power <= 50) {
                power = (int) (accident * 0.6);
                Log.info("Power of vehicle less or equal 50  -  multiply 0.6 index ");
            } else if (power > 50 && power <= 100) {
                power = (int) accident;
                Log.info("Power of vehicle more 50 and less or equal 100  -  doesn't multiply index ");
            } else if (power > 100 && power <= 150) {
                power = (int) (accident * 1.4);
                Log.info("Power of vehicle more 100 and less or equal 150  -  multiply 1.4 index ");
            } else if (power > 150) {
                power = (int) (accident * 1.6);
                Log.info("Power of vehicle more 150   -  multiply 1.6 index ");
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

