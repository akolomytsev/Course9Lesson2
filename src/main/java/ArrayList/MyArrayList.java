package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> nextList = new ArrayList<>();
        list.add("g");
        list.add(1,"r");
        list.add("p");
        nextList.add("i");
        nextList.add("b");
        list.addAll(2,nextList);
        list.remove("i");
        System.out.println(list.size());
        System.out.println(list);
        list.clear();
        nextList.clear();

        for (char c = 'A';c<= 'z';c++){
            String s = new String();
            s +=c;
            list.add(s);
            //if (c == 'Z') c = 'a'-1;
        }
        System.out.println(list);


        System.out.println(list.indexOf("Q"));
        System.out.println(list.contains("f"));
        System.out.println(list.get(8));
        System.out.println(list.size());

        for (int c = 1;c<= 1000;c++){
            String s = new String();
            s +=c;
            nextList.add(s);
        }
        //почему я могу добавить int в List<String> nextList?
        System.out.println(nextList.size());
        ArrayList<String> copyOfNextList = (ArrayList<String>) ((ArrayList<String>) nextList).clone();
        System.out.println(copyOfNextList);
    }
}
