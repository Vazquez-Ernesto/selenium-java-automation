package pages;
 
public class PaginaFundamentosTesting extends BasePage {
 
    private String fundamentosTestingLink = "//a[@href='/introduccion-al-testing-de-software'][normalize-space()='Ver producto']";
 
    public PaginaFundamentosTesting() {
        super(driver);
    }
 
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }

    public void clickIntroduccionTestingLink() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickIntroduccionTestingLink'");
    }
 
}
