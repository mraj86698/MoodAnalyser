package com.java.maven.MoodAnalyser;

import com.java.maven.MoodAnalyser.MoodAnalyserException.ExceptionType;

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

	public String analyzeMessage()throws MoodAnalyserException {
		/**
		 * Handle Exception if User Provides Invalid Mood
		 * In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException
		 * Use Enum to differentiate the Mood Analysis Errors
		 */
		try {
			/**
			 * Given Empty Mood should Throw Mood Analysis Exception indicating EmptyMood
			 */
			if(message.length()==0)
				throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Mood cannot be empty");
			String msg=message.toLowerCase();
			if (msg.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}
		/**
		 * Given Null Mood should throw Mood Analysis Exception
		 */
		catch(NullPointerException exception) {
			throw new MoodAnalyserException(ExceptionType.ENTERED_NULL, "Mood cannot be null");
		}
	}
}
