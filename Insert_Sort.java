//这是个排序类，用的是冒泡算法，
//有两个成员函数，1是sort（int number[]），
//进行比较次数和交换次数的计算；
//2是print（int number[]）把结果打印出来
//并把该类放入spy.MySort中

package spy.MySort;        //把该类放入spy.MySort中

import spy.Test.Test;      //导入Test类的包

public class Insert_Sort{

	public int CompareCount;
	public int ExchangeCount;
	
	//进行比较次数和交换次数的计算
	public void sort(int number[]){
	
		Test test = new Test();
		
		int temp;
		int j;
		for(int i = 1; i < number.length;i++){
			temp = number[i];
			j = i - 1;
			while(( j >= 0)&&(number[j] > temp)){
				CompareCount = test.compare_count();   //计算比较次数
				number[j+1] = number[j];
				ExchangeCount = test.exchange_count();   //计算交换次数
				j = j - 1;
			}
			number[j+1] = temp;
		}
	}
	
	//把相对应的结果打印出来
	public String toString(int number[]){
		String result = "";
		for(int i = 0;i < number.length;i++){
		result = result + number[i]+" ";
		}
		
		result = result + "\n\n比较次数为" + CompareCount + "\n交换次数为:" + ExchangeCount;
		return result;
	}
}