package CoreJava.Module2;

public class JaggedAnd3DArray {
    public static void main(String[] args) {

        int num[][][] = new int[3][][];

        num[0] = new int[2][5];
        num[1] = new int[3][5];
        num[2] = new int[4][5];

        for(int i=0; i<num.length; i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                for(int k=0; k<num[i][j].length; k++)
                {
                    num[i][j][k] = (int)(Math.random()*10);
                }

            }
        }

        for(int i=0; i<num.length;i++)
        {
            for(int j=0; j<num[i].length; j++)
            {
                for(int k=0; k<num[i][j].length; k++)
                {
                    System.out.print(num[i][j][k] + " ");
                }
                System.out.println();
            }

        }

        for(int n[][]: num)
        {
           for(int m[]:n)
            {
                for(int k: m)
                {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }

    }
}
