void plusMinus(int[] arr) {
    int pos = 0, neg = 0, zero = 0;
    for (int n : arr) {
        if (n > 0) pos++;
        else if (n < 0) neg++;
        else zero++;
    }
    System.out.printf("%.6f\n%.6f\n%.6f", (double)pos/arr.length, (double)neg/arr.length, (double)zero/arr.length);
}
