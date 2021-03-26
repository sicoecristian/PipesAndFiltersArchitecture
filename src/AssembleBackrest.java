public class AssembleBackrest {
    private ChairInProgress chairInProgress;

    public AssembleBackrest(ChairInProgress chairInProgress) {
        this.chairInProgress = chairInProgress;
    }
    public AssembleBackrest assembleBackrest(){
        this.chairInProgress.setBackrest("Backrest successfully assembled");
        return this;
    }

    public ChairInProgress returnChairWithAssembledBackrest(){
        return this.chairInProgress;
    }
}
