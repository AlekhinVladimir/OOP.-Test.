public class Main {
    public static void main(String[] args) {
        Flow flow = new Flow();

        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        flow.addStudyGroup(group1);
        flow.addStudyGroup(group2);
        flow.addStudyGroup(group3);

        System.out.println("Study groups in the flow:");
        for (StudyGroup group : flow) {
            System.out.println(group.getName());
        }
    }
}