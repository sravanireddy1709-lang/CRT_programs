class Subsets{
	static boolean subset(int[] a,int n,int target){
		if(target==0){
			return true;
		}
		if(n==0){
			return false;
		}
		return subset(a,n-1,target);
		return subset(a,n-1,target)||subset(a,n-1,target-a[n-1]);
	}
	public static void main(String[] args){
		int[] a={2,5,7,3,4,7};
		int target=9;
		System.out.println(subset(a,a.length,target));
	}
}