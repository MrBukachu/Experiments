package io.mart.selenide_page_object_with_fields;


import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
  @Test
  public void userCanSearch() {
    GooglePage page = open("https://google.com/ncr", GooglePage.class);
    SearchResultsPage results = page.searchFor("selenide");
    
    results.checkResultsSize(1);
    results.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
  }
}
