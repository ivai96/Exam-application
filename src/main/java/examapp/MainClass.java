package examapp;


import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;


public class MainClass {

	public static final String DEST = "results/Prijava.pdf";
	public static boolean isStudent1;
	
	public static void main(String args[]) throws IOException, Exception {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new MainClass().createPdf(DEST);
		

		SignDocument sign = new SignDocument();
		
		boolean checkIfwantSign = false;
		while (!checkIfwantSign){
			Scanner reader2 = new Scanner(System.in);
			System.out.println("Дали сакате да го потпишете документот ?");
			String wantSign = reader2.nextLine();
			
			if (wantSign.equals("да")||wantSign.equals("ДА")||wantSign.equals("Да")||wantSign.equals("дА")
					||wantSign.equals("da")||wantSign.equals("DA")||wantSign.equals("dA")||wantSign.equals("Da")){
				checkIfwantSign=true;
				sign.execute(isStudent1);
				
			}
			else if (wantSign.equals("не")||wantSign.equals("НЕ")||wantSign.equals("Не")||wantSign.equals("нЕ")
					||wantSign.equals("ne")||wantSign.equals("NE")||wantSign.equals("nE")||wantSign.equals("Ne"))
			{
				checkIfwantSign=true;
				System.out.println("Пријавата е генерирана");
			}
			else
				System.out.println("Одговорете со „да“ или „не“");
		}
	}


	public void createPdf(String dest) throws IOException, GeneralSecurityException {
		
		
		PdfWriter writer = new PdfWriter(dest);				
		PdfDocument pdf = new PdfDocument(writer);		
		PageSize ps = PageSize.A5.rotate();
		pdf.setDefaultPageSize(ps);		
		Document document = new Document(pdf);		
		
		boolean checkIfStudent = false;
		while (!checkIfStudent){
			Scanner reader1 = new Scanner(System.in);
			System.out.println("Дали сакате да пополнете испитна пријава како студент ?");
			String isStudent = reader1.nextLine();
			
			if (isStudent.equals("да")||isStudent.equals("ДА")||isStudent.equals("Да")||isStudent.equals("дА")
					||isStudent.equals("da")||isStudent.equals("DA")||isStudent.equals("dA")||isStudent.equals("Da")){
				checkIfStudent=true;
				isStudent1=true;
			RegistrationForExamAppearance.addFirstPage(document);	
			}
			else if (isStudent.equals("не")||isStudent.equals("НЕ")||isStudent.equals("Не")||isStudent.equals("нЕ")
					||isStudent.equals("ne")||isStudent.equals("NE")||isStudent.equals("nE")||isStudent.equals("Ne"))
			{
				checkIfStudent=true;		
				RegistrationForExamAppearance.addSecondPage(document);
				isStudent1=false;
			}
			else
				System.out.println("Одговорете со „да“ или „не“");
		}
		document.close();	
		
	}
}