class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int n=fruits.length;
        int frq[]=new int[n];
        int type=0;
        int s=0,e=0;
        while(e<n){
            int ft=fruits[e];
            //expand...window ko bada rahe hy
            if(frq[ft]==0)type++;
            frq[ft]++;
            //shrink...chota krna window ko
            while(type>2){
                int st=fruits[s];
                frq[st]--;
                if(frq[st]==0)type--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
            e++;
        }
        return max;
    }
}