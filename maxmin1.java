package arraydsa;

public class maxmin1{
    void  max(int ar[],int n) {
		int max = ar[0];
		for(int i=0;i<n;i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		System.out.println(max);
	}
	void min(int ar[],int n) {
		int min = ar[0];
		for(int i=0 ;i<n;i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[] = {12,43,55,445,45};
		int n = a.length;
		maxmin1 b = new maxmin1();
		b.max(a, n);
		b.min(a, n);
		
	}
}
		