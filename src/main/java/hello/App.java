package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * App of WordLadder
 * @author 516030910460
 * @version 0.0.2
 */

@RestController
public class App {

    @RequestMapping(value = "/app",method = RequestMethod.GET)
    public String say(String[] args) throws IOException {
            WordLadder map = new WordLadder("src/main/resources/dictionary.txt", 3);
            return map.ladder("dog", "cat");
    }
}