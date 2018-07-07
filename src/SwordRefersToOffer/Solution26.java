package SwordRefersToOffer;

public class Solution26 {


    public static int MoreThanHalfNum_Solution(int[] array){
        if(array==null||array.length==0){
            throw new IllegalArgumentException("array length must large than 0");
        }

        int result = array[0];
        int count = 1;

        //找出出现次数超过一半的值
        for(int i=1;i<array.length;i++){
            if(count==0){
                result = array[i];
                count = 1;
            }else if(array[i]==result){
                count++;
            }else{
                count--;
            }
        }

        //统计result的值在数组中出现的次数
        count = 0;
        for(int num:array){
            if(num==result){
                count++;
            }
        }
        //如果count的值未超过数组的一般则表示输入的数组不合法
        if(count<array.length/2){
            throw new IllegalArgumentException("invalid input");
        }

        return result;
    }

    public static void main(String args[]){
        int[] array = new int[]{1,2,3,4,2,2,2};
        int result = MoreThanHalfNum_Solution(array);
        System.out.println(result);

    }
}
