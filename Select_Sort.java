//���Ǹ������࣬�õ���ѡ���㷨��
//��������Ա������1��sort��int number[]����
//���бȽϴ����ͽ��������ļ��㣻
//2��print��int number[]���ѽ����ӡ����
//���Ѹ������spy.MySort��

package spy.MySort;        //�Ѹ������spy.MySort��

import spy.Test.Test;      //����Test��İ�

public class Select_Sort{

	public int CompareCount;
	public int ExchangeCount;
	
	//���бȽϴ����ͽ��������ļ���
	public void sort(int number[]){
	
		Test test = new Test();
	
		for(int i = 0;i < number.length-1;i++){
			int k = i;
			for(int j =i + 1;j < number.length;j++){
			
				CompareCount = test.compare_count();   //����Ƚϴ���
				
				if( number[k]> number[j]){
					k = j;
				}
			}			
			if( k != i ){
				ExchangeCount = test.exchange_count();   //���㽻������
				test.exchange_element(number,i,k);     //��������ֵ
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