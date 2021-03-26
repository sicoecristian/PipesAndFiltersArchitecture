public class PackageChair {
    private ChairInProgress chairInProgress;

    public PackageChair(ChairInProgress chairInProgress) {
        this.chairInProgress = chairInProgress;
    }
    public Chair returnChair(){
        return new Chair(this.chairInProgress.getSeat(),this.chairInProgress.getFeet(),this.chairInProgress.getBackrest(),this.chairInProgress.getStabilizerBar());
    }
}
