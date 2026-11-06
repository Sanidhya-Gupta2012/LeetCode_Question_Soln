class Solution {
    public int distMoney(int money, int children) {
         int count=0;
        if(money<children) return -1;
        if(money>8*children) return children-1;
        if(money==8*children) return children;
        if(money<8) return 0;
        while(money>=children){
            money-=8;
            children--;
            count++;
        }
        if(children==0 && money==-4) return count-2;
        return count-1;
    }
}