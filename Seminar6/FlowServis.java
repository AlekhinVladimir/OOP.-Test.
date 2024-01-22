import java.util.List;

public class FlowServis {

    public void sortListFlows(List<Flow> flows) {
        flows.sort(new StreamComparator());
    }
}