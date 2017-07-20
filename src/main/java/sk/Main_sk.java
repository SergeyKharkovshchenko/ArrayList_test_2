package sk;

/**
 * Created by SK on 10.07.2017.
 */
public class Main_sk {

    public static void main(String[] args) {
        Singleton x = new Singleton ();
//        x.getInstance();
        x.populate();
        System.out.println("Random arrayList value: " + x.get());
        x.change(25,"Fail");

    }

}
