package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    static Map<String, String> dictionary = new HashMap();
    static {
        dictionary.put("hello", "xin chao");
        dictionary.put("chair", "ghe");
        dictionary.put("table", "ban");
        dictionary.put("information", "thong tin");
    }

    @GetMapping("/")
    public String getHomePage() {
        return "search";
    }

    @PostMapping("/")
    public String search(@RequestParam String word, Model model) {
        String english = word.trim().toLowerCase();
        String vietnam = dictionary.get(english);
        if (vietnam != null) {
            model.addAttribute("result", vietnam);
        } else {
            model.addAttribute("result", "not found");
        }
        return "search";
    }
}
