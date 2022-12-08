package desafios.leetCode;

import java.lang.reflect.Array;
import java.util.*;

public class twoSum {
    /**
     *
     * @param nums
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @return devuelve el arraylist con los valores añadidos
     */
    public ArrayList setElements(ArrayList<Integer>nums,int num1,int num2, int num3, int num4){
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
        return nums;
    }

    /**
     *
     * @param nums
     * @param target
     * @return numeros_suma
     */
    public ArrayList<Integer> nums_equal_target(ArrayList<Integer>nums, int target){
        int suma = 0;
        ArrayList<Integer>numeros_suma = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if(suma+nums.get(i)==target){
                numeros_suma.add(nums.get(i));
                return numeros_suma;
            }else if(suma+nums.get(i)>target){
                return numeros_suma;
            }
            suma += nums.get(i);
            numeros_suma.add(nums.get(i));
        }
        return numeros_suma;
    }

    public static void main(String[] args) {
        twoSum t = new twoSum();
        ArrayList<Integer>nums = new ArrayList<>();
        t.setElements(nums,2,7,11,15);
        System.out.println(t.nums_equal_target(nums,9));
    }
}
