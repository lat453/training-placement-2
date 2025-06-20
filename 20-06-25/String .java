String timeConversion(String s) {
    int hour = Integer.parseInt(s.substring(0, 2));
    String ampm = s.substring(8);
    if (ampm.equals("AM") && hour == 12) hour = 0;
    if (ampm.equals("PM") && hour != 12) hour += 12;
    return String.format("%02d%s", hour, s.substring(2, 8));
}
