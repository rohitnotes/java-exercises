package _g_data_structures._g_2_Collections._g_2_1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    // .add adds at the end of a list
    List<Integer> list1 = new ArrayList<>();
    list1.add(5);
    list1.add(4567);
    list1.add(-87);

    List<Integer> list2 = new ArrayList<>();
    list2.add(35);
    list2.add(-6);

    list1.addAll(list2);

    List<Integer> list3= new LinkedList<>();
    list3.add(2,3);
    list3.add(0, 7890);

    list1.addAll(1,list3);  // starting from second position ->
                            // list  added to list1

   public void  displayList1Value(){
        for(var element:lis1){
            System.out.println(element);
        }
    }

    public static displayPreciseValue(){
        System.out.println(list1.get(0));  //  0 is an index
        System.out.println(list1.get(3));
    }
}
