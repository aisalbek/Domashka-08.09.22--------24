import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        HashSet<Integer> b = new HashSet<>();
        b.add(0);
        b.add(1);
        b.add(2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(symmetricDifference(a, b));
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> set0 = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {  //1,2,3    0,1,2
                set0.add(i);
            }
        }
        for (Integer j : set2) {
            if (!set1.contains(j)) {  //1,2,3    0,1,2
                set0.add(j);
            }
        }
        return set0;
    }
}


