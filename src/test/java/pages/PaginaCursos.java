package pages;
 
public class PaginaCursos extends BasePage {
 
    private String fundamentosTestingLink = "//a[@href='/introduccion-al-testing-de-software'][normalize-space()='Ver producto']";
 
    public PaginaCursos() {
        super(driver);
    }
 
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }
 
}