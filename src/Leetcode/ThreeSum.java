package Leetcode;

import java.util.*;

public class ThreeSum {
	
	
	//leetcode
	
	 public List<List<Integer>> threeSum1(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> res = new ArrayList<>();
	        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
	            if (i == 0 || nums[i - 1] != nums[i]) {
	                twoSum(nums, i, res);
	            }
	        return res;
	    }
	    void twoSum(int[] nums, int i, List<List<Integer>> res) {
	        var seen = new HashSet<Integer>();
	        for (int j = i + 1; j < nums.length; ++j) {
	            int complement = -nums[i] - nums[j];
	            if (seen.contains(complement)) {
	                res.add(Arrays.asList(nums[i], nums[j], complement));
	                while (j + 1 < nums.length && nums[j] == nums[j + 1])
	                    ++j;
	            }
	            seen.add(nums[j]);
	        }
	    }

	    
	    //leetcode
	    
	    
	    public List<List<Integer>> threeSum2(int[] nums) {
	        Set<List<Integer>> res = new HashSet<>();
	        Set<Integer> dups = new HashSet<>();
	        Map<Integer, Integer> seen = new HashMap<>();
	        for (int i = 0; i < nums.length; ++i)
	            if (dups.add(nums[i])) {
	                for (int j = i + 1; j < nums.length; ++j) {
	                    int complement = -nums[i] - nums[j];
	                    if (seen.containsKey(complement) && seen.get(complement) == i) {
	                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
	                        Collections.sort(triplet);
	                        res.add(triplet);
	                    }
	                    seen.put(nums[j], i);
	                }
	            }
	        return new ArrayList(res);
	    }
	    
	    
	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> l = new ArrayList<>();
		HashMap<Integer, Integer> hmap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			hmap.put(i, nums[i]);
		}

		for (int i = 0; i < nums.length - 2; i++) {
			int sum = 0 - nums[i];
			for (int j = i + 1; j < nums.length - 1; j++) {
				int newsum = sum - nums[j];
				if (hmap.containsValue(newsum)) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(newsum);
					Collections.sort(list);
					if (!l.contains(list))
						l.add(list);
				}
			}
		}
		return l;
	}
	
	public List<List<Integer>> threeSum_1(int[] nums) {

		List<List<Integer>> output = new ArrayList<>();
		HashMap<Integer, List<Integer>> hmap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if(hmap.containsKey(nums[i]))
			{
				hmap.get(nums[i]).add(i);
			}
			else
			{
				var temp = new ArrayList<Integer>();
				temp.add(i);
				hmap.put(nums[i], temp);
			}
		}
		
		var uniqueNum = hmap.keySet().toArray();
		for (int i = 0; i < uniqueNum.length - 2; i++) {
			for (int j = i + 1; j < uniqueNum.length - 1; j++) {
				
				int reqNum = ((int)uniqueNum[i] + (int)uniqueNum[j])*-1;
				if (hmap.containsKey(reqNum)) {
					var indexes = hmap.get(reqNum);
					if(indexes.get(1) < j)
						continue;
					
							List<Integer> list = new ArrayList<>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(reqNum);
							output.add(list);
							break;
						
				}
			}
		}
		return output;
	}

	public static void main(String args[]) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(new ThreeSum().threeSum_1(nums));

	}
}
