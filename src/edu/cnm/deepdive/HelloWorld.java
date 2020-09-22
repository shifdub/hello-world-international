package edu.cnm.deepdive;

import java.util.ResourceBundle;

public class HelloWorld {

  private static final String USER_NAME_KEY = "user.name";
  private static final String SALUTATION_KEY = "hello";
  private static final String SALUTATION_FORMAT = "%s, %s!%n";
  private static final String BUNDLE_BASE_NAME = "strings";

  public static void main(String[] args) {
    String userName = System.getProperty(USER_NAME_KEY);
    ResourceBundle strings = ResourceBundle.getBundle(BUNDLE_BASE_NAME);
    String salutation = strings.getString(SALUTATION_KEY);
    System.out.printf(SALUTATION_FORMAT, salutation, userName);
    System.getProperties().list(System.out);
  }
}
