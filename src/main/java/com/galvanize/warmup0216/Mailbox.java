package com.galvanize.warmup0216;

import org.springframework.web.bind.annotation.*;

@RestController
public class Mailbox {

    @GetMapping
    public String getDefault() {
        return "You've got /";
    }
    @GetMapping("/mail")
    public String getMail() {
        return "You've got mail!";
    }

    @PostMapping("/mail")
    public String postMail() {
        return "You've sent mail!";
    }

    @PatchMapping("/mail")
    public String patchMail() {
        return "You've edited mail!";
    }
    @PutMapping("/mail")
    public String putMail() {
        return "You've created mail!";
    }

    @DeleteMapping("/mail")
    public String deleteMail() {
        return "DELETED!";
    }

    @DeleteMapping("/mail/{name}")
    public String deleteSpecificNamedEmail(@PathVariable String name) {
        return "The " + name + " email was DELETED!";
    }


}
