//���Ǹ������࣬�õ���ð���㷨��
//��������Ա�������ֱ���sort��int number[]����
//���бȽϴ����ͽ��������ļ��㣻
//��һ���������ӡ�����������Ӧ�Ľ����ӡ����
//���Ѹ������spy.MySort��

package spy.MySort;        //�Ѹ������spy.MySort��

import spy.Test.Test;      //����Test��İ�

public class Bubble_Sort{

	public int CompareCount;
	public int ExchangeCount;
	
	//���бȽϴ����ͽ��������ļ���
	public void sort(int number[]){
	
		Test test = new Test();
		
		for(int i = 0;i < number.length;i++){
			for(int j = i + 1;j < number.length;j++){
				
				CompareCount = test.compare_count();   //����Ƚϴ���
				
				if(number[i] > number[j]){
				
					ExchangeCount = test.exchange_count();   //���㽻������
					
					test.exchange_element(number,i,j);     //��������ֵ
				}
			}
		}
	}
	//�����Ӧ�Ľ����ӡ����
	public String toString(int number[]){
		String result = "";
		for(int i = 0;i < number.length;i++){
		result = result + number[i]+" ";
		}
		
		result = result + "\n\n�Ƚϴ���Ϊ" + CompareCount + "\n��������Ϊ:" + ExchangeCount;
		return result;
	}

}