import java.util.Scanner;


class ReverseArray{
	int len;
	int[] arr;
	

	ReverseArray(int len){
		this.len = len;
		this.arr = new int[this.len];
	}

	void insert(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+len+" array elements \n");
		for(int i = 0; i<len; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("array elements  inserted \n");


	}

	void display(){
		String out = "";
		for(int i = 0; i<len; i++){
			out+=Integer.toString(arr[i])+" ";
		}

		System.out.println(out+"\n");
	}

	void reverseArray(){
		int start = 0;
		int end = len-1;
		int temp;

		while(end > start){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void main(String args[]){
		ReverseArray A = new ReverseArray(4);
		A.insert();
		A.display();
		A.reverseArray();
		A.display();
	}
}
