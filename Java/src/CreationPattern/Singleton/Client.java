package CreationPattern.Singleton;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Multiton m1,m2,m3,m4;
        m1 = Multiton.getInstence();
        m2 = Multiton.getInstence();
        m3 = Multiton.getInstence();
        m4 = Multiton.getInstence();
        Multiton.showNumbers();
        System.out.println(m1 == m2);
        System.out.println(m2 == m3);
        System.out.println(m3 == m4);
        }

}
