package com.java.maven.MoodAnalyser;

public class MoodAnalyser
{
	private String message;

	/**
	 * No Arguement Constructor
	 */
	public MoodAnalyser() {

	}

	/**
	 * Parameterised Constructor
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * Given Message, ability to analyse  and Respond Happy or Sad
	 * Call Anallyse Mood Function with Message as  parameter and return Happy or Sad Mood
	 * @return
	 */

	public String analyzeMessage() {
		/**
		 * Handle Exception if User Provides Invalid Mood
		 * Given Null Mood Should Return Happy
		 */
		try {
			String msg=message.toLowerCase();
			if (msg.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}catch(NullPointerException exception) {
			return "HAPPY";
		}
	}
}
