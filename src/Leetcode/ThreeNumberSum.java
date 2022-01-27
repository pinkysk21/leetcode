package Leetcode;
import java.util.*;

public class ThreeNumberSum {

	public static void main(String args[]) {
		int nums[] = { 0,0,0 };
		System.out.println(new ThreeNumberSum().threeSum(nums));
	}
	
	public List<List<Integer>> threeSum(int numbers[]) {
		Arrays.sort(numbers);
		Map<Integer,List<Integer>> map=new HashMap<>();
		Set<List<Integer>> list=new HashSet<>();
		for(int i=0;i<numbers.length;i++) {
			if(map.containsKey(numbers[i])) {
				map.get(numbers[i]).add(i);
			}
			List<Integer> lp=new ArrayList<>();
			lp.add(i);
			map.put(numbers[i],lp);
		}
		
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
		for(int i=0;i<numbers.length-2;i++) {
			for(int j=i+1;j<numbers.length-1;j++) {
				Integer sum=0-numbers[i]-numbers[j];
				if(map.containsKey(sum)) {
					List<Integer> p=map.get(sum);
					for(Integer position:p) {
					if(position!=i&&position!=j&&position>i&&position>j) {
						List<Integer> listNew=Arrays.asList(numbers[i],numbers[j],sum);
						list.add(listNew);
						break;
					}
					
					}
					
					
				}
			}
		}
		List<List<Integer>> l=new ArrayList<>(list);
		return l;
	}
}


