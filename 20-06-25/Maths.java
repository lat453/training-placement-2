String kangaroo(int x1, int v1, int x2, int v2) {
    if (v1 == v2) return x1 == x2 ? "YES" : "NO";
    if ((x2 - x1) * (v1 - v2) < 0) return "NO";
    return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
}
