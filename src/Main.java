
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {


    public static List<Chair> chairFactory(List<ChairInProgress> chairsInProgress)  {
        return chairsInProgress.stream()
                .map(CutSeat::new)
                .map(CutSeat::cutSeat)
                .map(CutSeat::returnChairWithCutSeat)
                .map(AssembleFeet::new)
                .map(AssembleFeet::assembleFeet)
                .map(AssembleFeet::returnChairWithAssembledFeet)
                .map(AssembleBackrest::new)
                .map(AssembleBackrest::assembleBackrest)
                .map(AssembleBackrest::returnChairWithAssembledBackrest)
                .map(AssembleStabilizerBar::new)
                .map(AssembleStabilizerBar::assembleStabilizerBar)
                .map(AssembleStabilizerBar::returnChairWithAssembledStabilizerBar)
                .map(PackageChair::new)
                .map(PackageChair::returnChair)
                .collect(Collectors.toList());

    }

    public static void main(String[] args)  {
        List<ChairInProgress> chairsInProgress=new ArrayList<ChairInProgress>();
        List<Chair> chairs=new ArrayList<Chair>();
        ChairInProgress c1=new ChairInProgress();
        ChairInProgress c2=new ChairInProgress();
        chairsInProgress.add(c1);
        chairsInProgress.add(c2);
        chairs=chairFactory(chairsInProgress);
        System.out.println(chairs);
    }
}
