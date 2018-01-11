class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        rem = 0
        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in nums and nums.index(rem) != i:
                return [i, nums.index(rem)]
