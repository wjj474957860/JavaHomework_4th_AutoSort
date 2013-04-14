//这是个测试类，有两个成员函数，分别是compare_count（），返回是比较次数；
//exchange_count()，返回的是交换的次数
//并把该类放入spy.Test中

package spy.Test;    //把该类放入spy.Test中

public class Test{
	private int compareCount = 0;
	private int exchangeCount =0;
	
	//比较次数
	public int compare_count(){
		compareCount ++;
		return compareCount;
	}
	
	//交换次数
	public int exchange_count(){
		exchangeCount ++;
		return exchangeCount;
	}
	
	//交换数组中两个元素
	public void exchange_element(int number[],int i,int j){
	
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
}