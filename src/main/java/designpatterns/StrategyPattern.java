/**
 * 
 */
package main.java.designpatterns;

/**
 * Example to show Strategy design pattern in Java.
 * 
 * @author rupesh sharma
 *
 */
public class StrategyPattern {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create the strategy context for PDF templates
		PDFTemplateContext templateContext = new PDFTemplateContext();
		
		// Execute one of the strategies, in this case AccountPDFTemplate
		templateContext.generatePDF(new AccountPDFTemplate());
		
		// Execute the other strategy, in this case CardPDFTemplate
		templateContext.generatePDF(new CardPDFTemplate());
	}

}

/**
 * Strategy context for PDF templates
 *
 */
class PDFTemplateContext{
	
	/**
	 * Generate PDF using the corresponding template.
	 * 
	 * @param template PDF template
	 */
	void generatePDF(PDFTemplate template) {
		template.generatePDF();
	}
}

/**
 * Functional Interface (only one abstract method) to generate the PDF using the template.
 *
 */
@FunctionalInterface
interface PDFTemplate{	
	
	/**
	 * Generate PDF using the template
	 */
	void generatePDF();
}

/**
 * Generate PDF using the template for Account
 *
 */
class AccountPDFTemplate implements PDFTemplate{

	@Override
	public void generatePDF() {
		System.out.println("Generating PDF for Account");		
	}
	
}

/**
 * Generate PDF using the template for Card
 *
 */
class CardPDFTemplate implements PDFTemplate{

	@Override
	public void generatePDF() {
		System.out.println("Generating PDF for Card");		
	}
	
}
