import java.util.List;

public class Controller {

    private FlowServis flowServis;

    public Controller() {
       flowServis = new FlowServis();
    }

    public void addFlow(Flow flow) {
        // код добавления потока
    }

    public void sortListFlows(List<Flow> flows) {
        flowServis.sortListFlows(flows);
    }
}