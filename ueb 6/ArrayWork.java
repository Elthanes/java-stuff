public class ArrayWork {

    public static double ArrayFunc(double[] w, int func) {
		double r;
		switch (func){
			case 1:
				r=w[0];
				for(int i=0; i < w.length;i++){
					if (r > w[i]){
						r= w[i];
					}
				}
				return r;
			case 2:
				r=w[0];
				for(int i=0; i < w.length;i++){
					if (r < w[i]){
						r= w[i];
					}
				}
				return r;
			case 3:
				r=0;
				for (int i=0; i < w.length; i++){
					r +=w[i];
				}
				r /=w.length;
				return r;
			case 4:
				r=0;
				for (int i=0; i < w.length; i++){
					r +=w[i];
				}
				r *=1.19;
				return r;
			default:
			return 0;
        //Ihre Loesung

    } 
	}

    public static void main(String[] args) {
        int arg=Integer.parseInt(args[0]);
        double werte[] = {1.9, 4.6, 99.0, 12.49, 78.99, 0.5, 56.98, 8.90, 119.90, 2.20};
       
        System.out.println(ArrayWork.ArrayFunc(werte, arg));
    }
}