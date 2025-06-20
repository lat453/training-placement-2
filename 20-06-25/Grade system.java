List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> result = new ArrayList<>();
    for (int grade : grades) {
        if (grade >= 38 && grade % 5 >= 3)
            grade += 5 - grade % 5;
        result.add(grade);
    }
    return result;
}
