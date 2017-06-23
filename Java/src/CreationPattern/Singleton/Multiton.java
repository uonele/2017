package CreationPattern.Singleton;

import java.util.Random;

import java.util.*;

public class Multiton {
        private static Multiton [] multitons = {new Multiton(),new Multiton()};
        public static int j = 1;
        public Multiton(){
                j++;
        }
        public static void showNumbers() {
                System.out.println( "create "+j +" multition");
        }
        public static Multiton getInstence() {
                return multitons[random()];
        }
        private static int random() {
                // TODO Auto-generated method stub
                Date data = new Date();
                Random random = new Random();
                int value = Math.abs(random.nextInt());
                value = value % multitons.length;
                return value;
        }

}
