//这是个排序类，用的是选择算法，
//有两个成员函数，1是sort（int number[]），
//进行比较次数和交换次数的计算；
//2是print（int number[]）把结果打印出来
//并把该类放入spy.MySort中

package spy.MySort;        //把该类放入spy.MySort中

import spy.Test.Test;      //导入Test类的包

public class Select_Sort{

	public int CompareCount;
	public int ExchangeCount;
	
	//进行比较次数和交换次数的计算
	public void sort(int number[]){
	
		Test test = new Test();
	
		for(int i = 0;i < number.length-1;i++){
			int k = i;
			for(int j =i + 1;j < number.length;j++){
			
				CompareCount = test.compare_count();   //计算比较次数
				
				if( number[k]> number[j]){
					k = j;
				}
			}			
			if( k != i ){
				ExchangeCount = test.exchange_count();   //计算交换次数
				test.exchange_element(number,i,k);     //交换两个值
			}
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