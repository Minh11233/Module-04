package com.codegym.dao;

import com.codegym.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailDao {
    private static List<Email> emailList;
    static {
        emailList = new ArrayList<>();
        Email email = new Email();
        email.setLanguage("English");
        email.setPageSize("5");
        email.setSpamFilter("Enable");
        email.setSignature("Minh");
        emailList.add(email);
    }
}
