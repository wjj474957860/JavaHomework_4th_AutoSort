//���Ǹ������࣬��������Ա�������ֱ���compare_count�����������ǱȽϴ�����
//exchange_count()�����ص��ǽ����Ĵ���
//���Ѹ������spy.Test��

package spy.Test;    //�Ѹ������spy.Test��

public class Test{
	private int compareCount = 0;
	private int exchangeCount =0;
	
	//�Ƚϴ���
	public int compare_count(){
		compareCount ++;
		return compareCount;
	}
	
	//��������
	public int exchange_count(){
		exchangeCount ++;
		return exchangeCount;
	}
	
	//��������������Ԫ��
	public void exchange_element(int number[],int i,int j){
	
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
}