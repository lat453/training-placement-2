List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alice = 0, bob = 0;
    for (int i = 0; i < 3; i++) {
        if (a.get(i) > b.get(i)) alice++;
        else if (a.get(i) < b.get(i)) bob++;
    }
    return Arrays.asList(alice, bob);
}
