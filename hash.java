package cse;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class hash {
	public static void main(String[]args)
	{
		Set<Integer> hs=new HashSet<>();
		hs.add(52);
		hs.add(96);
		hs.add(92);
		hs.add(3);
		hs.add(1);
		hs.add(96);
		hs.remove(1);
		System.out.println(hs);
		Set<Integer> li=new LinkedHashSet<>();
		li.add(33);
		li.addAll(hs);
		System.out.println(li);
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(li);
		System.out.println("this is tree" +ts);
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(01,"sravan");
		hm.put(02,"bharath");
		hm.put(03,"");
		System.out.println("this is from class" +hm);
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(02,"ammai");
		tm.put(04,"chinnu");
		tm.put(9,"ashu");
		tm.put(05,"janvi");
		tm.put(8,"ayesha");
		System.out.println(" treeset class" +tm);
		for(Map.Entry<Integer,String> d:tm.entrySet())
		{
			System.out.println(d.getKey()+" "+d.getValue());
		}
		LinkedHashMap<Integer,String> lk=new LinkedHashMap<>();
		lk.put(1," ");
		lk.put(2," ");
		lk.put(2,"chinnu");
		System.out.println("linked" +lk);
	}

}
