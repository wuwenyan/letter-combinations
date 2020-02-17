package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: test
 * @description: 电话号码字母组合
 * @author: wenyan
 * @create: 2020-02-17 16:51
 */
class Solution {
    public static List<String> letterCombinations(int[] arr) {
        HashMap<Integer, String> map = new HashMap<>(16);
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");


        List<String> resultList = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return resultList;
        }

        resultList.add("");

        for (int i = 0; i < arr.length; i++) {
            ArrayList<String> temp = new ArrayList<>();
            String option = map.get(arr[i]);
            if (option != null) {
                for (int j = 0; j < resultList.size(); j++) {
                    for (int p = 0; p < option.length(); p++) {
                        temp.add(new StringBuilder(resultList.get(j)).append(option.charAt(p)).toString());
                    }
                }
            }

            resultList.clear();
            resultList.addAll(temp);
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(letterCombinations(arr));
    }
}
