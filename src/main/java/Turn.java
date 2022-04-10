import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Turn {

    private int firstThrow;

    private int secondThrow;

    private boolean eligibleBonusSpare = false;

    private boolean eligibleBonusStrike= false;

    public Turn(int firstThrow,int secondThrow){
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
        checkForBonus();
    }

    public void checkForBonus(){
        if(this.getFirstThrow() == 10){
            this.setEligibleBonusStrike(true);
        }else if(this.getScore() == 10){
            this.setEligibleBonusSpare(true);
        }
    }

    public int getScore(){
        return Integer.sum(firstThrow,secondThrow);
    }
}
