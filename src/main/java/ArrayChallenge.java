public class ArrayChallenge {

    public static void main(String[] args) {
        var studentArray = createStudentArray(5);
        for (String student : studentArray) {
            System.out.println(student);
        }
    }

    public static String[] createStudentArray(int numberOfStudents) {
        String[] studentArray = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            studentArray[i] = "Student " + (i+1);
        }
        return studentArray;
    }

}
