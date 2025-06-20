int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
int lcm(int a, int b) { return a * b / gcd(a, b); }

int getTotalX(int[] a, int[] b) {
    int l = a[0], g = b[0];
    for (int i = 1; i < a.length; i++) l = lcm(l, a[i]);
    for (int i = 1; i < b.length; i++) g = gcd(g, b[i]);

    int count = 0;
    for (int i = l; i <= g; i += l)
        if (g % i == 0) count++;
    return count;
}
