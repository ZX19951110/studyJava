import java.util.ArrayList;

public class ChooseSort {
    public ChooseSort(ArrayList<Integer> sortList){
        Integer min = sortList.get(0);
        Integer count = sortList.size();
        ArrayList<Integer> resList = new ArrayList<Integer>();
        for (;resList.size() < count;){
            min = sortList.get(0);
            for (int i = 0; i<sortList.size(); i++) {
                if (min > sortList.get(i)) {
                    min = sortList.get(i);
                }
            }
                resList.add(min);
                for (int j = 0;j < sortList.size();j++){
                    if (sortList.get(j) == min){
                        sortList.remove(j);
                }
            }
        }
        for (int k = 0;k < resList.size();k++){
            System.out.println(resList.get(k));
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> sortArr = new ArrayList<Integer>();
        sortArr.add(3);
        sortArr.add(5);
        sortArr.add(1);
        sortArr.add(10);
        sortArr.add(555);
        sortArr.add(90);
        new ChooseSort(sortArr);
    }
}
