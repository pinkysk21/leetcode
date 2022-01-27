package Leetcode;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution11 sol=new Solution11();
		int[] nums31= {1,2,3,0,0,0};
		
		  int m1=3; int n1=3; int[] nums4= {2,5,6};
		 sol.merging(nums31, m1, nums4, n1);
		int nums1[]= {0};
		int m=0;
		int n=1;
		int nums2[]= {1};
		
		sol.merge(nums1, m, nums2, n);
		int nums3[]= {2};
		nums3=nums2;
		System.out.println(Arrays.toString(nums3));
		System.out.println(Arrays.toString(nums31));
		
	}

}

class Solution11 {
	
	public void merging(int[] nums1, int m, int[] nums2, int n) {
		int p1=m-1;
		int p2=n-1;
		
		for(int p=m+n-1;p>=0;p--) {
			if(p2<0)
				break;
			else
			{
				if(nums1[p1]>nums2[p2]&&p1>=0) {
					nums1[p]=nums1[p1];
					p1--;
				}
				else {
					nums1[p]=nums2[p2];
					p2--;
				}
			}
		}
	}
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	for(int i=0;i<n;i++) {
    		nums1[m+i]=nums2[i];
    	}
    	Arrays.sort(nums1);
    	
      /*
    	if(m==0){
           for(int i=0;i<(m+n);i++) {
        	   nums1[i]=nums2[i];
           }
            return;
        }
        else if(n==0){
            return;
        }
        else{
        	int pos=m;
            Solution11 s=new Solution11();
            int i=0;
            int j=0;
            for( ;i<m;i++){
                if(nums1[i]>nums2[j])
                {   combine(nums1,m,n,nums2[j],i);
                    j++;
                    pos++;
                }
            }
            
            if(j<n) {
            	int diff=n-j;
            	for(int p=0;p<diff;p++,pos++,j++) {
            		nums1[pos]=nums2[j];
            	}
            	
            }
            
        }
        
        */
    }
    /*
    public static void combine(int[] nums1,int m, int n, int val,int position){
        int k=nums1[position];
        for(int i=position;i<(m+n);i++){
            nums1[position]=val;
            val=k;
            if(position+1<(m+n))
                k=nums1[++position];
        }
    }
    */
}