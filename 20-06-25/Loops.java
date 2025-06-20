int birthdayCakeCandles(int[] candles) {
    int max = 0, count = 0;
    for (int c : candles) {
        if (c > max) {
            max = c;
            count = 1;
        } else if (c == max) count++;
    }
    return count;
}
