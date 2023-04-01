package homework.homework6.diceGame5Ver2.game5;
import java.util.ArrayList;
import static homework.homework6.diceGame5Ver2.game5.Dice.diceCount;
import static homework.homework6.diceGame5Ver2.game5.Dice.rollDice;

public class Game {
    static ArrayList<Player> playerList = new ArrayList<>();

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    static void sumDices(ArrayList<Player> playerList) {
        int sumDicesScore = 0;

        for (int i = 0; i < playerList.size(); i++) {
            int startScore = 0;
            playerList.get(i).setPlayerScore(new Score());

            for (int j = 0; j < diceCount; j++) {
                startScore += playerList.get(i).getDiceArray()[j].getDiceNumber(); //플레이어1의 1번주사위+2번주사우;..+
                sumDicesScore = startScore;
            }
            playerList.get(i).getPlayerScore().setBeforeScore(sumDicesScore);//플레이어1의 스코어의 비포스코어에 저장
        }
    }

    static public void playerAdd(String playerName) { //플레이어 이름입력하면
        Player player = new Player(playerName);
        playerList.add(player);//그 이름을 가진 플레이어 객체를 생성 + List에 추가
    }

    static void rollThreeDices(ArrayList<Player> playerList) { //해당 플레이 리스트의 모두가 주사위를 세번씩 굴림
        for (int i = 0; i < playerList.size(); i++) { //<[주사위][][]> <[][][]> <[][][]>...<[][][]>
            playerList.get(i).setDiceArray(rollDice());

            int firstDiceNumber = playerList.get(i).getDiceArray()[0].getDiceNumber();
            if (firstDiceNumber % 2 != 0) {
                for (int j = 1; j < diceCount; j++) {
                    playerList.get(i).getDiceArray()[j].setDiceNumber(0);
                }
            }
        }
    }
    
    void target (Player player1) {
    	
    	ArrayList<Player> targetList = new ArrayList<>();
    	targetList = playerList;
    	
    	
    	
    }
    	
    	
    }
}

class WinnerCheck {


}