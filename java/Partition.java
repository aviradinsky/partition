class Partition{
    static int partition(int x){
        /* 
        returns the partition of integer 'x'
         */
        int ret = 0;
        for(int i = 1; i <= x; i++) ret += partitionXBaseN(x, i);
        return ret;
    }
    static int partitionXBaseN(int x, int n){
        /* 
        returns the number of ways to partition 'x' into 'n' integers greater than 0
         */
        if(x == n) return 1;
        if(x-n <= n) return partition(x-n);
        int ret = 0;
        for(int i = 1; i <= n; i++)ret += partitionXBaseN(x-n, i);
        return ret;
    }
}