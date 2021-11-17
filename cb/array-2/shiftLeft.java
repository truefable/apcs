public int[] shiftLeft(int[] nums) {
  if (nums.length == 0) {
    return nums;
  } else {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length - 1; i++) {
      a[i] = nums[i+1];
    }
    a[nums.length - 1] = nums[0];
    return a;
  }
}