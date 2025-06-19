void staircase(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.println(" ".repeat(n - i) + "#".repeat(i));
    }
}
