package com.meafoou.saia.chapter.one;

public class Foo {
    public static void main(String[] args) {
        String joinedString = String.join("-", args);
//        int result1 = add(4, 33);
//        int result2 = add(4, 99);
//        int finalResult = add(result1, result2);
//        System.out.println("RESULT = " + finalResult);

        AK47 ak47 = new AK47();
        Glock glock = new Glock();

        Shooter.takeGun(ak47).pullTrigger();
        Shooter.takeGun(glock).pullTrigger();
    }

    public static class Shooter {
        private Gun gun;
        public Shooter(Gun gun) {
            this.gun = gun;
        }

        public static Shooter takeGun(Gun gun) {
            return new Shooter(gun);
        }

        public void pullTrigger() {
            System.out.println(gun.fire());
        }
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public interface Gun {
        String fire();
    }

    public static class AK47 implements Gun {
        public String fire() {
            return "ak-bang-bang";
        }
    }

    public static class Glock implements Gun {
        public String fire() {
            return "glock-bang";
        }
    }
}
