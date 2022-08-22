package com.java.maven.MoodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyserTest
{
private MoodAnalyser analyser;

	/**
	 * Testing for Sad case
	 * Given “I am in Sad Mood” message Should Return SAD
	 * analyseMood method can just return SAD to pass this Test Case (TC)
	 */
	@Test
	public void message_WhenSad_MustReturn_Sad() {
		analyser = new MoodAnalyser("I am in SAD Mood");
		Assert.assertEquals("SAD", analyser.analyzeMessage());
	}

	/**
	 * Testing for other case
	 * Given “I am in Any Mood” message Should Return HAPPY
	 */
	@Test
	public void message_WhenNotSad_MustReturn_Happy() {
		analyser = new MoodAnalyser("I am a Any Mood");
		Assert.assertEquals("HAPPY", analyser.analyzeMessage());
	}


	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyzeMessage();
		assertEquals("HAPPY", mood);
	}
}
