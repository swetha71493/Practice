package sorrting;

public class ExchangeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int arr[]={1,4,3,8,9,2,4,5};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After Sorting---->");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
