import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = Arrays.asList(1, 1);
        return getRowHelp(list, 1, rowIndex);

    }

    private List<Integer> getRowHelp(List<Integer> list, int i, int rowIndex) {
        List<Integer> list1 = new ArrayList<>();
        if (rowIndex == 0) {
            list1.add(1);
            return list1;
        } else if (rowIndex == 1) {
            return list;
        }
        if (i == rowIndex) {
            return list;
        }

        list1.add(1);
        for (int in = 1; in < list.size(); in++) {
            int a = list.get(in - 1) + list.get(in);
            list1.add(a);
        }
        list1.add(1);
        return getRowHelp(list1, i + 1, rowIndex);

    }

}
