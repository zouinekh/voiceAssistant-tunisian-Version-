package voiceAssistant;

import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class VoiceAssistant {

	public static void main(String[]st) {
		
		Configuration config= new Configuration();
		config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		config.setDictionaryPath("src\\main\\resources\\4775.dic");
		config.setLanguageModelPath("src\\main\\resources\\4775.lm");
		try {
			LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
			speech.startRecognition(true);
			
			SpeechResult speechResult = null;
            ProcessBuilder browser=new ProcessBuilder("");

			while ((speechResult = speech.getResult()) != null) {
				String voiceCommand = speechResult.getHypothesis();
				System.out.println("Voice Command is " + voiceCommand);
				
				if (voiceCommand.equalsIgnoreCase("Open Chrome")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome ");
				} else if (voiceCommand.equalsIgnoreCase("Close Chrome")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}  else if(voiceCommand.equalsIgnoreCase("open youtube")){
	           
	                    browser=new ProcessBuilder("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe","youtube.com");
	                    //browserProcess=
	                    browser.start();
	            }else if (voiceCommand.equalsIgnoreCase("saker google")) {
					Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
				}else if (voiceCommand.equalsIgnoreCase("khadem google")) {
					Runtime.getRuntime().exec("cmd.exe /c start chrome ");
					
				}else if (voiceCommand.equalsIgnoreCase("good job")) {
					System.out.println("---------------------  THANKS !!! --------------------");
					System.out.println("****** THIS PROJECT IS MADED BY YOU GUYS ***** ");

					
				}else if (voiceCommand.equalsIgnoreCase("aaslema")) {
					System.out.println("*********************     SALUT !!!!!  kifeh n3awenk ********************");
					
				}else if (voiceCommand.equalsIgnoreCase("hello")) {
					System.out.println("*********************     Hello You Want Help !!  ********************");
					
				}else if (voiceCommand.equalsIgnoreCase("who are you")) {
					System.out.println("*********************    IM A JAVA PROGRAM WHO CAN HELP YOU  ********************");
					System.out.println("*********************    YOU CAN ASK FOR HELP IF U WANT  ********************");

				}else if (voiceCommand.equalsIgnoreCase("help")) {
					System.out.println("*********************    HEllO AGAIN  ********************");
					System.out.println("*********************    YOU HAVE SOME VOICE COMMANDE THAT U CAN RUN   ********************");
					System.out.println("MORE LIKE : "
							+ "\n"
							+ "\n"
							+ ": OPEN CHROME \n"
							+ "\n"
							+ ": CLOSE CHROME \n"
							+ "\n"
							+ ": OPEN YOUTUBE \n"
							+ "\n"
							+ "\n"
							+ ": ALSO KHADEM GOOGLE \n"
							+ ": SAKER GOOGLE \n"
							+ "\n"
							+ "\n"
							+ "\n"
							+ "and we have study mode pack for developers "
							
							+ "*********************** DONT FORGET TO TELL ME GOOD JOB CAUSE I LIKE THAT ***********");

					while((speechResult = speech.getResult())== null) {

						}
				} else if(voiceCommand.equalsIgnoreCase("study mode")){

                    browser=new ProcessBuilder("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe","https://www.youtube.com/watch?v=5qap5aO4i9A");
                    //browserProcess=
                    browser.start();
      
                    Runtime.getRuntime().exec("cmd.exe /c start code ");

            }
				
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
} 
}
