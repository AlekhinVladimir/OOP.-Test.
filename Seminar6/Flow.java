import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudyGroup> {

    List<StudyGroup> studyGroups;

    public Flow() {
        studyGroups = new ArrayList<>();
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroups.add(studyGroup);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}


