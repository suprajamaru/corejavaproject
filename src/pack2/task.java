package pack2;

public class task {
public int[] makeLast(int nums[]) {
	
int arr[]= new int[]{0,nums[nums.length-1]};
	
	return arr;
	}
public static void main(String[] args) {
	task obj=new task();
	int nums[]= {1,2};
	     int result[]=obj.makeLast(nums);
	     System.out.println(result);
}
}
