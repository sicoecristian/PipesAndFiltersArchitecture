public class CutSeat {
    private ChairInProgress chairInProgress;



    public CutSeat(ChairInProgress chairInProgress) {
        this.chairInProgress = chairInProgress;
    }

    public CutSeat cutSeat(){

        this.chairInProgress.setSeat("Seat successfully assembled");
        return this;

    }

    public ChairInProgress returnChairWithCutSeat(){
        return this.chairInProgress;
    }

}
