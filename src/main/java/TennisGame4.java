
public class TennisGame4 {

    private String firstPlayerName = "";
    private String secondPlayerName = "";
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    public TennisGame4(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

	public String getScore() {
        String scoreIsZeroZero = "Love-All";
        String scoreIsOneZero = "Fifteen-Love";
        String scoreIsOneOne = "Fifteen-All";

        if(scorePlayer1 == 1) {
            if(scorePlayer2 == 1) {
                return scoreIsOneOne;
            }
            return scoreIsOneZero;
        }
		return scoreIsZeroZero;
	}

	public void wonPoint(String playerName) {
        if (playerName == this.firstPlayerName){
            this.scorePlayer1++;
        } else if (playerName == this.secondPlayerName) {
            this.scorePlayer2++;
        }
	}
    
}
