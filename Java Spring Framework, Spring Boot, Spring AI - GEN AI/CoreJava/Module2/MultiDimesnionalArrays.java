package CoreJava.Module2;

public class MultiDimesnionalArrays
{
    public static void main(String[] args) {

        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);
        System.out.println(num[2][0]);
        System.out.println(num[2][1]);
        System.out.println(num[2][2]);

        int num1[][] = new int[2][3];
        num1[0][0] = 1;
        num1[0][1] = 2;
        num1[1][0] = 3;
        num1[1][1] = 4;

        for(int i=0; i<num1.length; i++)
        {
            for(int j=0; j<num1[i].length; j++)
            {
                num1[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<num1.length; i++)
        {
            for(int j=0; j<num1[i].length; j++)
            {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[]: num1)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }

        }


    }
}
