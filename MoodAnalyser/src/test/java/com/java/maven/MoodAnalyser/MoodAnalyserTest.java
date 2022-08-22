package com.java.maven.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest {


	/**
	 * Testing for Sad case Given “I am in Sad Mood” message Should Return SAD
	 * analyseMood method can just return SAD to pass this Test Case (TC)
	 */
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyzeMessage();
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
		assertEquals("SAD", mood);
	}

	/**
	 * Testing for other case Given “I am in Any Mood” message Should Return HAPPY
	 */
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyzeMessage();
		} catch (MoodAnalyserException e) {

			e.printStackTrace();
		}
		assertEquals("HAPPY", mood);
	}
	/**
	 * Given Empty Mood should Throw Mood Analysis Exception indicating EmptyMood
	 */
	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException_OfTypeNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyzeMessage();
		}
		catch(MoodAnalyserException e) {
			assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	/**
	 * Given Null Mood should throw Mood Analysis Exception indicating Null Mood
	 */
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException_OfTypeEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyzeMessage();
		}
		catch(MoodAnalyserException e) {
			assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
