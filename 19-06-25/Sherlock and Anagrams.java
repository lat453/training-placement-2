public static int sherlockAndAnagrams(String s) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j <= s.length(); j++) {
            char[] chars = s.substring(i, j).toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
    }
    int count = 0;
    for (int val : map.values()) {
        count += val * (val - 1) / 2;
    }
    return count;
}
