public class reversePyramidPattern
 {
    public static void printpattern(int n)
    {
        int i,j;
        for(i=n; i>=1 ;i--)
        {
            for(j=1 ; j<=i ; j++)
            {
             System.out.println(j+ "");
            }
        
        System.out.println();
    }
}
public static void main(String args[])
{
    int n=6;
    printpattern(n);
}
}