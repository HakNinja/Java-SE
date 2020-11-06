public class Star{
public static void main(String []args){
int i,j,n=5,k;
k=n-1;
for (i=0;i<n;i++){

for (j=0;j<2*n;j++){
if((i+j>=n-1) && (i+j<=k))
   System.out.print(" * ");
else
   System.out.print("   ");
}
k=k+2;
System.out.println("\n");
}
}
}
