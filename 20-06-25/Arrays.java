List<Integer> breakingRecords(int[] scores) {
    int max = scores[0], min = scores[0], maxCount = 0, minCount = 0;
    for (int score : scores) {
        if (score > max) { max = score; maxCount++; }
        if (score < min) { min = score; minCount++; }
    }
    return Arrays.asList(maxCount, minCount);
}
