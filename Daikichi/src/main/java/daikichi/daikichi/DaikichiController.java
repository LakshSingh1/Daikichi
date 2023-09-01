package daikichi.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DaikichiController {
    @RequestMapping("/travel/{location}")
    public String destination(@PathVariable("location") String Location) {
        return "Congratulations! You will soon travel to " + Location;
    }

    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number") int number) {
        // if number is even
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
        }
    }
}
