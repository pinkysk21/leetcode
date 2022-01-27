package Leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class MaximumUnitsInATruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{2,1},{4,4},{3,1},{4,1},{2,4},{3,4},{1,3},{4,3},{5,3},{5,3}};
		System.out.println(new MaximumUnitsInATruck().maximumUnits(a, 4));

	}
	
	
	 public int maximumUnits(int[][] boxTypes, int truckSize) {
	        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
	        for(int i=0;i<boxTypes.length;i++) {
	        	if(map.containsKey(boxTypes[i][1]))
	        	map.put(boxTypes[i][1], map.get(boxTypes[i][1])+boxTypes[i][0]);
	        	else
	        		map.put(boxTypes[i][1], boxTypes[i][0]);
	        	
	        }
	        
	        Set<Map.Entry<Integer,Integer>> entries= map.entrySet();
            
 
        // Way 1
        // Using for loops
	        int units=0;
        for (Map.Entry<Integer, Integer> entry : entries) {

Integer val=entry.getKey();
Integer val1=entry.getValue();
if(truckSize<=val1) {
	units=units+(truckSize*val);
	break;
}
else {
	units=units+(val1*val);
	truckSize=truckSize-val1;
	
}
        }
        return units;
	    }

}


//leetcode

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int unitCount = 0;
        for (int[] boxType : boxTypes) {
            int boxCount = Math.min(truckSize, boxType[0]);
            unitCount += boxCount * boxType[1];
            truckSize -= boxCount;
            if (truckSize == 0)
                break;
        }
        return unitCount;
    }
}




class Solution1 {
public
    int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->b[1] - a[1]);
        queue.addAll(Arrays.asList(boxTypes));
        int unitCount = 0;
        while (!queue.isEmpty()) {
            int[] top = queue.poll();
            int boxCount = Math.min(truckSize, top[0]);
            unitCount += boxCount * top[1];
            truckSize -= boxCount;
            if(truckSize == 0)
                break;
        }
        return unitCount;
    }
}