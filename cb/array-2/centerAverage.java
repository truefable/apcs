public int centeredAverage(int[] nums) {
  int min = nums[0];
  int minindex = 0;
  int max = nums[0];
  int maxindex = 0;
  for (int i = 1; i < nums.length; i++) {
    if (min > nums[i]) {
      min = nums[i];
      minindex = i;
    }
  }
  for (int i = 1; i < nums.length; i++) {
    if (max < nums[i]) {
      max = nums[i];
      maxindex = i;
    }
  }
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    sum = sum + nums[i];
  }
  int caverage = (sum - nums[minindex] - nums [maxindex]) / (nums.length - 2);
  return caverage;
}