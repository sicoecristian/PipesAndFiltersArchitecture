public class AssembleStabilizerBar {
    private ChairInProgress chairInProgress;

    public AssembleStabilizerBar(ChairInProgress chairInProgress) {
        this.chairInProgress = chairInProgress;
    }
    public AssembleStabilizerBar assembleStabilizerBar(){
        this.chairInProgress.setStabilizerBar("Stabilizer bar successfully assembled");
        return this;
    }
    public ChairInProgress returnChairWithAssembledStabilizerBar(){
        return this.chairInProgress;
    }
}
