package demo;

public class sort_1 {
void sort(int arr[]) {
	for(int i=1; i<arr.length; i++) {
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key){
			arr[j+1]=arr[j];
			j-=1;
		}
		arr[j+1]=key;
	}
}
void display(int arr[]) {
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {26,37,38,29,16,30};
		sort_1 obj=new sort_1();
		obj.sort(arr);
		obj.display(arr);
	}

}
