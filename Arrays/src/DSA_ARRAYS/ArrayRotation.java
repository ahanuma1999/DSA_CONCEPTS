package DSA_ARRAYS;

public class ArrayRotation {
	
	void LeftRotation(int A[],int d, int n) {
 	   for(int i=0;i<d;i++) {
 		   LeftRotationbyOne(A, n);
 	   }
    }
    
    void LeftRotationbyOne(int A[],int n) {
    int temp=A[0];
    	for(int i=0;i<n-1;i++)
    		A[i]=A[i+1];
    	A[n-1] = temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4,5};
        ArrayRotation ar = new ArrayRotation();
        ar.LeftRotation(a, 2, 5);
        for(int A:a) {
        	System.out.println(A);
        }
	}

}
