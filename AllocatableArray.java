public class AllocatableArray {
    int[] Ar;
    int dis = 0;
    int max;

    AllocatableArray (int length) {
        Ar  = new int[length];
        max = length - 1;
    }

   void set(int loc, int val){
        if (loc < dis) {
            int[] newAr = new int[Ar.length+Math.abs(loc - dis)];
            for(int i = 0 ; i < Ar.length ; i++){
                newAr[i+Math.abs(loc-dis)] = Ar[i];
            }
            Ar = newAr;
            dis = loc;
        }

        if (loc - dis > max){
            max = loc - dis;
            int[] newAr = new int[max - dis + 1];
            for(int i = 0 ; i < Ar.length ; i++){
                newAr[i] = Ar[i];
            }
            Ar = newAr;
        }

        Ar[loc - dis] = val;
   }

   int get(int loc){
    if (loc < dis) {
        int[] newAr = new int[Ar.length+Math.abs(loc - dis)];
        for(int i = 0 ; i < Ar.length ; i++){
            newAr[i+Math.abs(loc-dis)] = Ar[i];
        }
        Ar = newAr;
        dis = loc;
    }
    if (loc > max){
        max = loc - dis;
        int[] newAr = new int[max - dis + 1];
        for(int i = 0 ; i < Ar.length ; i++){
            newAr[i] = Ar[i];
        }
        Ar = newAr;
    }
    return Ar[loc - dis];
   }

    int length(){
        return Ar.length;
    }
    

}
