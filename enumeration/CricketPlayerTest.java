package com.ee.enumeration;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Shubham on 07-09-2016.
 */
public class CricketPlayerTest {
    CricketPlayer t20MatchPlayer;
    CricketPlayer oneDayMatchPlayer;
    @Before
    public void setUp() throws Exception {
        t20MatchPlayer = new CricketPlayer("Vishal",22,PlayingStategy.T20_STYLE);
        oneDayMatchPlayer = new CricketPlayer("Sachin",35,PlayingStategy.ONE_DAY_STYLE);

    }

    @org.junit.Test
    public void itShouldReturnStyleOft20MatchPlayer() throws Exception {
        String result = "Playing offensively";
        assertEquals(result,t20MatchPlayer.play());

    }
    @org.junit.Test
    public void itShouldReturnTheStyleOfOneDayMatchPlayer() throws Exception {
        assertEquals(oneDayMatchPlayer.play(),"Playing both offensively and defensively");
    }

    @org.junit.Test
    public void itShouldReturnTheStyleOfOneDayMatchPlayerAfterChangingTheStyle() throws Exception {
        oneDayMatchPlayer.setPlayingStrategy(PlayingStategy.T20_STYLE);
        assertNotEquals(oneDayMatchPlayer.play(),"Playing both offensively and defensively");
    }


}