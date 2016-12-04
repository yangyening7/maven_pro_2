package Basic_Utilities;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.List;

/**
 * Created by yangyening on 2016/12/4.
 * Ordering排序器的使用
 * 排序器[Ordering]是Guava流畅风格比较器[Comparator]的实现，
 * 它可以用来为构建复杂的比较器，以完成集合排序的功能。
 从实现上说，Ordering实例就是一个特殊的Comparator实例。
 Ordering把很多基于Comparator的静态方法（如Collections.max）包装为自己的实例方法（非静态方法），
 并且提供了链式调用方法，来定制和增强现有的比较器。
 */
public class Basic_Ordering {
    public  static void main(String[] args){
        List<String> stringList= Lists.newArrayList("b","a","h","z","d","e","3","1","k","a","9","m","k");
        System.out.println(Ordering.natural().max(stringList));
        System.out.println(Ordering.natural().min(stringList));

        List<String> stringList1 = Lists.newArrayList("b","a","h","z","d","e","3","1",null,"k","a","9","m","k");
        System.out.println(stringList1);
        List<String> stringList2=Ordering.natural().nullsFirst().sortedCopy(stringList1);
        System.out.println(stringList2);
        List<String> stringList3=Ordering.usingToString().nullsFirst().sortedCopy(stringList1);
        System.out.println(stringList3);
        List<String> stringList4 = Lists.newArrayList("ba","addd","hdd","z","d2243","e5","3325235","1262",null,"k3","a1","9","m3","k333");
        System.out.println(stringList4);
        Ordering<String> ordering =new Ordering<String>() {
            @Override
            public int compare(String s, String t1) {
                return Ints.compare(s.length(),t1.length());
            }
        };
        List<String> stringList5 = ordering.nullsFirst().reverse().sortedCopy(stringList4);
        System.out.println("自定义排序：" + stringList5);

        System.out.println("是否是有序的？：" + ordering.nullsFirst().reverse().isOrdered(stringList5));
        // 取出最大和最小的的3个
        List<String> stringList6 = ordering.nullsFirst().reverse().greatestOf(stringList4, 3);
        List<String> stringList7 = ordering.nullsFirst().reverse().leastOf(stringList4, 3);
        System.out.println(stringList6);
        System.out.println(stringList7);
    }
}
