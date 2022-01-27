package Leetcode;

import java.util.*;

public class MinStackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MinStack {
List <List<Integer>> list;
    public MinStack() {
        list=new ArrayList<>();
    }
    
    public void push(int val) {

List<Integer> l=new ArrayList<>();
if(list.isEmpty()) {
	l.add(val);
	l.add(val);
	list.add(l);
}
else {
	int min=list.get(list.size()-1).get(1);
	l.add(val);
	l.add(Math.min(val, min));
}
    }
    
    public void pop() {
        if(!list.isEmpty()){
            list.remove(list.size()-1);
        }
    }
    
    public int top() {
        return list.get(list.size()-1).get(0);
    }
    
    public int getMin() {
       return list.get(list.size()-1).get(1);
    }
    
    public int popMin() {
    	int val=list.get(list.size()-1).get(1);
    	int position=0;
    	for(int i=list.size()-1;i>=0;i--) {
    		List<Integer> l=list.get(i);
    		if(l.get(0)==val) {
    			position=i;
    			list.remove(i);
    		}
    	}
    	int newMin=0;
    	if(position>=0) {
    		newMin=list.get(position-1).get(1);
    		for(int i=position-1;i<list.size();i++) {
        		List<Integer> l2=list.get(i);
        		int min=l2.get(1);
        		l2.re
    		}
    	}
    		
    	}
    	return val;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */