package testjavawrite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: design-study
 * @description: lamboda 表达式 排序写法
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-01-24 15:55
 **/
public class SortLamboda {

    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
        int[][] nums = {{4,7},{5,6},{9,4}};
        Arrays.sort(nums, (o1, o2) -> o1[0] - o2[0]);
    }
}
