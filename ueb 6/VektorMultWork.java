public class VektorMultWork{
	
	public static int[] addVektor(int[] a, int[] b){
		int l;
		if (a.length > b.length){
			l = a.length;
		}else l = b.length;
		int[] r = new int[l];		
		for (int i=0; i < l; i++){
			if ((a.length > i) && (b.length >i)){
				r[i] = a[i] + b[i];
			}else if (a.length >i){
				r[i] = a[i];
			}
			else r[i] = b[i]; 
		}
		return r;
	}
	
    public static void main(String[] args) {
		int[] a = {12,-2,23,4,-15};
		int[] b = {8,1,-7,2,23,8,9,11,-89};
		
		int[] result = VektorMultWork.addVektor(a,b);
		for (int j=0; j<result.length; j++){
			System.out.println(result[j]);
		}
	}
}