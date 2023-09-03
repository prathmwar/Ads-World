public class Main {
    public static void main(String[] args) {
        int[] h = {6,3,2,4,1,3,5,3,4};
        int[] maxH = new int[h.length];
        int[] ans = new int[h.length];

        int maxR=0;
        for(int i=h.length-1;i>=0;i--)
        {
            if(h[i]>maxR)
                maxR =h[i];
            maxH[i] = maxR;
        }

        //for calculating maxH array
        for(int i=0;i<h.length;i++)
        {
            ans[i] = maxH[i] - h[i];
        }

        System.out.println("Result array is: ");
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}

//Time comp = O(n)