import java.util.Scanner;
class MatMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        int b[][] = new int[5][5];
        int c[][] = new int[5][5];
        
        int r1,c1,r2,c2,i,j,k;
        System.out.println("Enter the row and coloumn of the frist matrix :");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the row and coloumn of the second matrix :");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if(c1 == r2) {
            System.out.println("Enter the elements of the frist matrix : \n");
            for(i=0;i<r1;i++)
            for(j=0;j<c1;j++) 
                a[i][j] = sc.nextInt();
            System.out.println("Enter the elements of the second matrix :\n");
            for(i=0;i<r2;i++)
            for(j=0;j<c2;j++)
                b[i][j] = sc.nextInt();
            for(i=0;i<r1;i++)
            for(j=0;j<c2;j++)
                {
                    c[i][j]=0;
                    for(k=0;k<c1;k++)
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            System.out.println("Matrix Multiplication is: \n");
            for(i=0;i<r1;i++)
                {
                    for(j=0;j<c2;j++)
                        System.out.print("\t"+c[i][j]);
                        System.out.print("\n");
                }
        }
        else 
            System.out.println("Matrix Multiplication is not Possible !!");
    }
}