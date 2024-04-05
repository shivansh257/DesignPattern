package facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(900.00);
        accessingBank.depositCash(500.00);

        BankAccountFacade accessingBank2 = new BankAccountFacade(12345678, 1234);
        accessingBank2.withdrawCash(500.00);
        accessingBank2.withdrawCash(990.00);

        List<String> list = new ArrayList<>(Arrays.asList("12","112","321"));
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove("12"));
        System.out.println(list);
//        Integer[] object = (Integer[]) list.toArray();
//        Integer arr[] = new Integer[10];
//        arr = (Integer[]) list.toArray();


        Map<Integer, String> mp = new HashMap<>(Map.of(1,"one",2,"two",3,"three"));
        System.out.println(mp.get(1) + " " + mp.get(5) + mp.getOrDefault(2,"not found") + " " + mp.getOrDefault(5,"NF"));
        System.out.println(mp.containsKey(1) + " " + mp.containsKey(5));
        System.out.println(mp.remove(4) + " " + mp);
        mp.put(2,"seven");
        System.out.println(mp);
        Map<Integer, Integer> mp1 = new HashMap<>(Map.of(1,3,2,423,3,63));



        // stream, toArray
        Set<String> set = new HashSet<>(Set.of("1","2","3","4"));
        System.out.println(set.iterator().next());
//        System.out.println(set + " " + set.remove("1") + " " + set);
//        Map<Integer, String> ht = new Hashtable<>(Map.of(1,"one",2,"two",3,"three"));
//        for(Map.Entry<Integer,String> h: ht.entrySet()) {
//            h.
//        }
    }
}
