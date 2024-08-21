/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        boolean[] test = new boolean[5];
        for (int i = 0 ; i < test.length ; i++){
            test[i] = false;
        }

        AllocatableArray henry = new AllocatableArray();
        henry.set(2, 3);
        test[0] = (henry.get(2) == 3);
        System.out.println("Normal setting and getting works is: " + test[0]);
        henry.set(15, 17);
        test[1] = henry.get(15) == 17;
        System.out.println("Setting and getting above max works is: " + test[1]);
        henry.set(-3, 4);
        test[2] = henry.get(-3) == 4;
        System.out.println("Negative getting and setting works is: " + test[2]);
        test[3] = henry.get(2) == 3;
        System.out.println("Original values still works is: " + test[3]);
        test[4] = henry.get(9) == 0;
        System.out.println("Original values still works is: " + test[4]);
        System.out.println(henry.length());
        System.out.println(henry.get(-3));
        for(int i = -3 ; i < 20 ; i++) {
            System.out.print(i);
            henry.get(i);
        }
        

    }
}