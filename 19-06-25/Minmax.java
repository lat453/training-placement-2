void miniMaxSum(int[] arr) {
    Arrays.sort(arr);
    long min = 0, max = 0;
    for (int i = 0; i < 4; i++) min += arr[i];
    for (int i = 1; i < 5; i++) max += arr[i];
    System.out.println(min + " " + max);
}
