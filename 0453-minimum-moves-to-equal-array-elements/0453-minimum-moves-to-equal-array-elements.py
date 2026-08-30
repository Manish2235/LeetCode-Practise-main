class Solution(object):
    def minMoves(self, nums):
        min_val = min(nums)
        moves = 0
        for num in nums:
            moves += num - min_val
        return moves