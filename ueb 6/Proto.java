public class VektorWork{
	
	public static int[] addVektor(int[] a, int[] b){
		int[] r = new int[a.length];
		for (int i=0; i < a.length; i++){
			r[i] = a[i] +b[i];
		}
	}
	
    public static void main(String[] args) {
		int[] a = {12,-2,23,4,-15}:
		int[] b = {8,1,-7,2,23};
		
		int[] result = VektorWork.addVektor(a,b);
		for (int j=0; j<result.length; j++){
			System.out.println(result[j]);
		}
	}
}