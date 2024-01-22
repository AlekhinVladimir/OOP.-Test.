import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow flow1, Flow flow2) {
        return Integer.compare(flow1.studyGroups.size(), flow2.studyGroups.size());
    }
}

