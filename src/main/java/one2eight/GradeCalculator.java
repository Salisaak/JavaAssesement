package one2eight;
//
//    Create a class called GradeCalculator.
//        Inside the class add one method called calculateGrades which takes an array of grades,
//        the method's job is to add all the grades together and returns the total.
//        For example: if grades were {1,2,3,4,5} total would be 15.
//        Apply TDD to this class by creating a Test Case for it. Make sure your test first fail (RED),
//        then pass (Green) then you can Refactor if needed.

public class GradeCalculator {

    public static int calculateGrades(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum;
    }
}
