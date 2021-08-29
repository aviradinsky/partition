from functools import lru_cache

@lru_cache(maxsize=None)
def partition(x: int):
    """
    returns the partition of integer 'x'
    """
    return sum([partition_x_base_n(x,i+1) for i in range(x)])

@lru_cache(maxsize=None)
def partition_x_base_n(x: int,n: int):
    """
    returns the number of ways to partition 'x' into 'n' integers greater than 0
    """
    if x == n: return 1
    if x-n <= n: return partition(x-n)
    return sum([partition_x_base_n(x-n,i+1) for i in range(n)])