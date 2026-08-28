class Solution {
     fun removeElement(nums: IntArray, `val`: Int): Int {
            var i = 0
            var j = nums.size - 1
            while (i <= j) {

                while (j >= i  && nums[j] == `val`) j--

                if (j < i ) break

                while (i < j && nums[i] != `val`){ i++ }

                if (nums[i] == `val`) {
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    i++
                    j--
                } else {
                    i++
                }
            }
            return i
        }
}
