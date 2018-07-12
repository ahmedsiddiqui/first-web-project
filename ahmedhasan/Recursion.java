public static double powerN(double base, int n) {
	if(n==0){
	    return 1;
	  }
	else if(n>0){
	    return base * powerN(base,n-1);
	  }
	else{
            return 1/base * powerN(base,n+1);
	  }
}