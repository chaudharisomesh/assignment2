package assignment2;

import java.util.* ;

class shallow {
    private int[] my_data;
    public shallow(int[] my_vals){
        my_data = my_vals;
    }
    public void display_data(){
        System.out.println("shallow copy: " + Arrays.toString(my_data) );
    }

}
class deepcopy{
    private int[] my_data;
    public deepcopy(int[] my_vals1){
        my_data = new int[my_vals1.length];
        for (int i = 0; i < my_data.length; i++){
            my_data[i] = my_vals1[i];
        }
    }
    public void  display1(){
        System.out.println("Deep copy: " + Arrays.toString(my_data));
    }

}

public class Shallowanddeep {

    public static void main(String[] args) {
        int[] my_vals = {89, 56, 52};
        shallow my_inst = new shallow(my_vals);
        my_inst.display_data();
        my_vals[0] = 65;
        my_inst.display_data();

        int[] my_vals1 = {56, 89, 91};
        deepcopy my_inst1 = new deepcopy(my_vals1);
        my_vals[0] = 65;
        my_inst1.display1() ;


    }
}