package personal.controllers;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import personal.model.User;

public class Validat {
    public void validate(User user){
        if (!pattern.matcher(user.getFirstName()).find()){
            throw new RuntimeException("Не корректнo, имя пользователя не должно быть пустым");
        }
            if(patternDigit.matcher(user.getFirstName()).find()){
            throw new RuntimeException("Не корректнo, имя пользователя состоит из букв");
        }
        
        


        if (!pattern.matcher(user.getLastName()).find()) {
                throw new RuntimeException("Не корректнo, фамилия пользователя не должно быть пустым");}
                if(patternDigit.matcher(user.getLastName()).find()){
                    throw new RuntimeException("Не корректнo, фамилия пользователя состоит из букв");
                }
        
        if (!patternDigit.matcher(user.getPhone()).find()){
                    throw new RuntimeException("Не корректнo, номер телефона состоит из цифр");

        } 
        
    }
    final String regex = "^\\S+$";
    final String reDigit = "^\\d+$";
    final Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE);
    final Pattern patternDigit = Pattern.compile(reDigit,Pattern.MULTILINE);
}
