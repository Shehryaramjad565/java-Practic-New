package InterfaceDay6;

interface Sortable{
	
	public void sort( int[] array);
}

class ApplySorting implements Sortable{

	@Override
	public void sort(int[] nuNum) {
		// TODO Auto-generated method stub
		
		//reverse the array
//		int get = 0;
//		for(int i=0; nuNum.length>i; i++) {
//			nuNum[i]=get;
//			if(nuNum[i])
//		}
		for(int i = 0; i < nuNum.length / 2; i++)
		{
		    int temp = nuNum[i];
		    nuNum[i] = nuNum[nuNum.length - i - 1];
		    nuNum[nuNum.length - i - 1] = temp;
		}
		
		for(int item: nuNum) {
			System.out.println(item);
		}
		
	}
	
}

public class StringSorterMain11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNum = {10, 20, 30, 40};
		
		ApplySorting obj = new ApplySorting();
		obj.sort(myNum);
		

	}

}
