class Solution(object):
    def circularArrayLoop(self, nums):
        n = len(nums)

        def next_index(i):
            return (i + nums[i]) % n

        for i in range(n):
            if nums[i] == 0:
                continue

            direction = nums[i] > 0
            slow = i
            fast = i

            while True:
                # Slow must continue in the same direction
                next_slow = next_index(slow)

                if nums[next_slow] == 0:
                    break

                if (nums[next_slow] > 0) != direction:
                    break

                # Fast first step
                next_fast = next_index(fast)

                if nums[next_fast] == 0:
                    break

                if (nums[next_fast] > 0) != direction:
                    break

                # Fast second step
                next_fast = next_index(next_fast)

                if nums[next_fast] == 0:
                    break

                if (nums[next_fast] > 0) != direction:
                    break

                slow = next_slow
                fast = next_fast

                if slow == fast:
                    # A one-element cycle is invalid
                    if slow == next_index(slow):
                        break

                    return True

            # Mark the current path as visited
            j = i

            while nums[j] != 0 and (nums[j] > 0) == direction:
                next_j = next_index(j)
                nums[j] = 0
                j = next_j

        return False