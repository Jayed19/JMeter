package JMeter;
import java.util.Random;

public class GenerateRandomEmail {


    public static String getRandomEmail(int length){
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    
    
    for(int i = 0; i < length; i++) {
    int index = random.nextInt(alphabet.length());
    char randomChar = alphabet.charAt(index);
    sb.append(randomChar);
    }
    
    String randomString = sb.toString();
    return randomString+"@mail.com";
    
      }
    
  
    }