

public class AssembleFeet {
    private ChairInProgress chairInProgress;

    public AssembleFeet(ChairInProgress chairInProgress){
        this.chairInProgress=chairInProgress;
    }

    public AssembleFeet assembleFeet() {

        this.chairInProgress.setFeet("Feet successfully assembled");
        return this;
    }


    public ChairInProgress returnChairWithAssembledFeet() {
        return chairInProgress;
    }
}
