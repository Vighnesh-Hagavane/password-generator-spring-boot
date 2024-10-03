package com.example.demo;

import java.security.SecureRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordGeneratorController {

    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBER_CHARS = "0123456789";
    private static final String SYMBOL_CHARS = "!@#$%^&*()_-+=<>?";

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/generatePassword")
    public String generatePassword(@RequestParam int length,
                                   @RequestParam boolean includeUppercase,
                                   @RequestParam boolean includeLowercase,
                                   @RequestParam boolean includeNumbers,
                                   @RequestParam boolean includeSymbols,
                                   Model model) {

        StringBuilder passwordBuilder = new StringBuilder();
        String allCharacters = "";

        if (includeUppercase) {
            allCharacters += UPPERCASE_CHARS;
        }
        if (includeLowercase) {
            allCharacters += LOWERCASE_CHARS;
        }
        if (includeNumbers) {
            allCharacters += NUMBER_CHARS;
        }
        if (includeSymbols) {
            allCharacters += SYMBOL_CHARS;
        }

        if (allCharacters.isEmpty()) {
            model.addAttribute("error", "Please select at least one character type.");
            return "index";
        }

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            passwordBuilder.append(allCharacters.charAt(randomIndex));
        }

        String password = passwordBuilder.toString();
        model.addAttribute("password", password);
        return "index";
    }
}