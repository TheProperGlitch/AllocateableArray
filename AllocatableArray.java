public class AllocatableArray {
    int[] Ar = new int[10];
    int max = 9;
    int min = 0;

    AllocatableArray () {

    }

    void set(int location, int input){
        if(location > max){
            max = location;
            int[] newAr = new int[max + Math.abs(min) + 1];
            for (int i = 0 ; i < Ar.length ; i++){
                newAr[i] = Ar[i];
            }
            Ar = newAr;
        }

        if(location < min) {
            min = location;
            int[] newAr = new int[max + Math.abs(min) + 1];
            for (int i = 0 ; i < Ar.length ; i++){
                newAr[i] = Ar[i];
            }
            Ar = newAr;
        }

        Ar[location + Math.abs(min)] = input;
    }

    int get(int location) {
        return Ar[location + Math.abs(min)];
    }
}
