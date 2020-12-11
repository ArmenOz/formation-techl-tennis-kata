import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TennisTest4 {
    
    private String firstPlayerName = "first test name";
    
    @Test
    public void score_is_zero_zero() {
        TennisGame4 game = new TennisGame4("", "");
        String actual = game.getScore();
        String expected = "Love-All";
        assertEquals(expected, actual);
    }
    
    @Test
    public void score_is_one_zero() {
        // GIVEN 
        TennisGame4 game = new TennisGame4(firstPlayerName, "");
        game.wonPoint(firstPlayerName);
        String expected = "Fifteen-Love";

        // WHEN 
        String actual = game.getScore();
        
        // THEN
        assertEquals(expected, actual);
    }

    @Test 
    public void score_is_one_one() {
        // GIVEN 
        TennisGame4 game = new TennisGame4(firstPlayerName, "testPlayer2");
        String expected = "Fifteen-All";
        game.wonPoint(firstPlayerName);
        game.wonPoint("testPlayer2");

        // WHEN 
        String actual = game.getScore();

        // THEN 
        assertEquals(expected, actual);
    }
}
