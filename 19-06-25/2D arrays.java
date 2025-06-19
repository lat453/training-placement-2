int diagonalDifference(List<List<Integer>> arr) {
    int left = 0, right = 0;
    for (int i = 0; i < arr.size(); i++) {
        left += arr.get(i).get(i);
        right += arr.get(i).get(arr.size() - 1 - i);
    }
    return Math.abs(left - right);
}
