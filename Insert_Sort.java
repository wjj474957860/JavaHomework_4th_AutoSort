//���Ǹ������࣬�õ���ð���㷨��
//��������Ա������1��sort��int number[]����
//���бȽϴ����ͽ��������ļ��㣻
//2��print��int number[]���ѽ����ӡ����
//���Ѹ������spy.MySort��

package spy.MySort;        //�Ѹ������spy.MySort��

import spy.Test.Test;      //����Test��İ�

public class Insert_Sort{

	public int CompareCount;
	public int ExchangeCount;
	
	//���бȽϴ����ͽ��������ļ���
	public void sort(int number[]){
	
		Test test = new Test();
		
		int temp;
		int j;
		for(int i = 1; i < number.length;i++){
			temp = number[i];
			j = i - 1;
			while(( j >= 0)&&(number[j] > temp)){
				CompareCount = test.compare_count();   //����Ƚϴ���
				number[j+1] = number[j];
				ExchangeCount = test.exchange_count();   //���㽻������
				j = j - 1;
			}
			number[j+1] = temp;
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