package examapp;

import java.io.IOException;
import java.util.List;

import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Div;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.ColorConstants;


import java.util.ArrayList;




public class RegistrationForExamAppearance {

	public static final String FONT = "results/chapter01/times.ttf";
	
	public static void addFirstPage(Document doc) throws IOException{
	    PdfFont cyrilic = PdfFontFactory.createFont(FONT, "CP1251", true);      
	    List<Text> lista = InputValues.inputFieldsStudent();
	    
	    doc.add(new Paragraph("РЕПУБЛИКА МАКЕДОНИЈА").setFontColor(ColorConstants.BLUE).setFont(cyrilic).setFontSize(11).setFixedLeading(5).setTextAlignment(TextAlignment.CENTER)).setFontColor(ColorConstants.BLUE);
	    doc.add(new Paragraph("УНИВЕРЗИТЕТ “СВ. КЛИМЕНТ ОХРИДСКИ” - БИТОЛА").setFont(cyrilic).setFontSize(11).setFixedLeading(5).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph().setFont(cyrilic).setFontSize(11).setFixedLeading(11).setTextAlignment(TextAlignment.CENTER).add(lista.get(0)));
	    doc.add(new Paragraph("(единица)").setFont(cyrilic).setFontSize(11).setFixedLeading(1).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph());
	    doc.add(new Paragraph());
	    doc.add(new Paragraph("ИСПИТНА ПРИЈАВА").setFont(cyrilic).setBold().setCharacterSpacing(4).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph());
	    doc.add(new Paragraph());
	    
	    doc.add(new Paragraph("Се пријавувам за полагање на испит по предметот ____________________________________________ _________________________________________"
	    		+ "во _________________________________ испитен рок.")
	    		.setFont(cyrilic).setFontSize(11).setFixedLeading(17).setFixedPosition(50, 222, 530));
	    Paragraph predmet = new Paragraph(lista.get(1)).setFont(cyrilic).setFontSize(11).setFirstLineIndent(242).setFixedLeading(17);
	    Div divPredmet = new Div().add(predmet).setHeight(40).setFixedPosition(50, 220, 480).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divPredmet);
	    
	    doc.add(new Paragraph(lista.get(2)).setFont(cyrilic).setFontSize(11).setFixedPosition(295, 221.5f, 100));
	    
	    doc.add(new Paragraph("Испитот го полагам (прв пат, втор пат и т.н.)  ________________________________________________").setFont(cyrilic).setFontSize(11).setFixedPosition(50, 202, 582));
	    doc.add(new Paragraph(lista.get(3)).setFont(cyrilic).setFontSize(11).setFixedPosition(270, 201.5f, 100));

	    doc.add(new Paragraph("Во прилог го поднесувам индексот.").setFont(cyrilic).setFontSize(11).setFirstLineIndent(25).setFixedPosition(50, 178, 582));
	    
	    doc.add(new Paragraph("Име и презиме на студентот").setFont(cyrilic).setFontSize(11).setFixedPosition(375, 129, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph().setUnderline().setFont(cyrilic).setFontSize(11).add(" ").add(lista.get(4)).add(" ").setFixedPosition(375, 11, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("Датум ").add(lista.get(5)).add(" год.").setFont(cyrilic).setFontSize(11).setFixedPosition(36, 101, 200).setTextAlignment(TextAlignment.LEFT));
	    doc.add(new Paragraph().setFont(cyrilic).setFontSize(11).add(lista.get(7)).setFixedPosition(-12.5f, 84, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("____________").setFont(cyrilic).setFontSize(12).setFixedPosition(-12.5f, 84.5f, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("(место)").setFont(cyrilic).setFontSize(11).setFixedPosition(-12.5f, 72, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("ЕМБГ: ").add(lista.get(6)).setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 85, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("(потпис на студентот)").setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 52, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("___________________").setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 65, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("").setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 75, 200).setTextAlignment(TextAlignment.CENTER));
	  
	    }
	
	public static void addEmptyFirstPage(Document doc) throws IOException{
	    PdfFont cyrilic = PdfFontFactory.createFont(FONT, "CP1251", true);      
	    List<Text> lista = new ArrayList<Text>();
	    		//InputValues.inputFields();
	    for(int i=0;i<25;i++){
	    	lista.add(new Text(""));
	    }
	    
	    doc.add(new Paragraph("РЕПУБЛИКА МАКЕДОНИЈА").setFontColor(ColorConstants.BLUE).setFont(cyrilic).setFontSize(11).setFixedLeading(5).setTextAlignment(TextAlignment.CENTER)).setFontColor(ColorConstants.BLUE);
	    doc.add(new Paragraph("УНИВЕРЗИТЕТ “СВ. КЛИМЕНТ ОХРИДСКИ” - БИТОЛА").setFont(cyrilic).setFontSize(11).setFixedLeading(5).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph().setFont(cyrilic).setFontSize(11).setFixedLeading(11).setTextAlignment(TextAlignment.CENTER).add(lista.get(3)));
	    doc.add(new Paragraph("(единица)").setFont(cyrilic).setFontSize(11).setFixedLeading(1).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph());
	    doc.add(new Paragraph());
	    doc.add(new Paragraph("ИСПИТНА ПРИЈАВА").setFont(cyrilic).setBold().setCharacterSpacing(4).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph());
	    doc.add(new Paragraph());
	    doc.add(new Paragraph("Се пријавувам за полагање на испит по предметот ")
	    		.setFont(cyrilic).setFontSize(11)
	    		.add(lista.get(0))
	    		.add(" во ")
	    		.add(lista.get(1))
	    		.add(" испитен рок. ")
	    		.add("Испитот го полагам (прв пат, втор пат и т.н.) ")
	    		.add(lista.get(2))
	    		.add(".")
	    		.setTextAlignment(TextAlignment.JUSTIFIED));
	    doc.add(new Paragraph("Во прилог го поднесувам индексот.").setFont(cyrilic).setFontSize(11).setFirstLineIndent(25));
	    doc.add(new Paragraph("Име и презиме на студентот").setFont(cyrilic).setFontSize(11).setFixedPosition(375, 179, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph().setUnderline().setFont(cyrilic).setFontSize(11).add(" ").add(lista.get(4)).add(" ").setFixedPosition(375, 165, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("Датум ").add(lista.get(5)).add(" год.").setFont(cyrilic).setFontSize(11).setFixedPosition(36, 151, 200).setTextAlignment(TextAlignment.LEFT));
	    doc.add(new Paragraph().setFont(cyrilic).setFontSize(11).add(lista.get(6)).setFixedPosition(-12.5f, 134, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("____________").setFont(cyrilic).setFontSize(12).setFixedPosition(-12.5f, 134.5f, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("(место)").setFont(cyrilic).setFontSize(11).setFixedPosition(-12.5f, 123, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("ЕМБГ: ").add(lista.get(7)).setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 125, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("(потпис на студентот)").setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 92, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("___________________").setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 105, 200).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph(lista.get(8)).setFont(cyrilic).setFontSize(11).setFixedPosition(375f, 105, 200).setTextAlignment(TextAlignment.CENTER));
	  
	    }
 
	public static void addSecondPage(Document doc) throws IOException{
	    PdfFont cyrilic = PdfFontFactory.createFont(FONT, "CP1251", true);  
	    PdfFont base = PdfFontFactory.createFont("C:/Users/Ivana/workspace/ExamApplication/results/chapter01/wingding.ttf", PdfEncodings.IDENTITY_H , false);
	    char checked='\u00FE';
	    char unchecked='\u00A8';	    		
		
	    List<Text> lista = InputValues.inputFieldsProfeessor();
		
	    doc.add(new Paragraph("Единица:").setFont(cyrilic).setFontSize(10).setFixedLeading(12).setFixedPosition(40, 390, 200));
	    Paragraph parEdinica = new Paragraph().add(lista.get(0)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(42).setFixedLeading(12);
	    Div divEdinica = new Div().add(parEdinica).setHeight(40).setFixedPosition(40, 366.5f, 225).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divEdinica);
	    
	    doc.add(new Paragraph("Поени:").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 328, 200));
	    doc.add(new Paragraph("I колоквиум:").setFont(cyrilic).setFontSize(10).setFixedPosition(52, 310, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 310, 200));
	    doc.add(new Paragraph(lista.get(1)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 310, 200));	    
	    doc.add(new Paragraph("II колоквиум:").setFont(cyrilic).setFontSize(10).setFixedPosition(48, 296, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 296, 200));
	    doc.add(new Paragraph(lista.get(2)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 296, 200));
	    doc.add(new Paragraph("1. Просечно поени од колоквиуми / Завршно оценување").setFont(cyrilic).setFontSize(10).setFixedLeading(12).setFixedPosition(45, 266, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 265, 200));
	    doc.add(new Paragraph(lista.get(3)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 265, 200));
	   
	    doc.add(new Paragraph("2. Присуство и активност на предавања").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 252, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 251, 200));
	    doc.add(new Paragraph(lista.get(4)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 251, 200));
	    doc.add(new Paragraph("3. Присуство и активност на вежби").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 238, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 237, 200));
	    doc.add(new Paragraph(lista.get(5)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 237, 200));
	    doc.add(new Paragraph("4. Изработка на семинарски труд").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 224, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 223, 200));
	    doc.add(new Paragraph(lista.get(6)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 223, 200));
	    doc.add(new Paragraph("5. Самостојна (домашна) работа").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 210, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 209, 200));
	    doc.add(new Paragraph(lista.get(7)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 209, 200));
	    doc.add(new Paragraph("6. Изработени или реализирани проекти / програми").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 180, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 179, 200));
	    doc.add(new Paragraph(lista.get(8)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 179, 200));
	    doc.add(new Paragraph("7. Друго").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 162, 200));
	    doc.add(new Paragraph("__________________________________________________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 126, 190).setFixedLeading(12));
	    Paragraph p = new Paragraph(lista.get(9)).setFont(cyrilic).setFontSize(10).setFixedLeading(13);
	    Div d = new Div().add(p).setHeight(53).setFixedPosition(45, 113.5f, 180).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(d);	    

	    doc.add(new Paragraph("ВКУПНО ").add("_________").setBold().setFont(cyrilic).setFontSize(10).setFixedPosition(45, 90, 175));
	    doc.add(new Paragraph(lista.get(10)).setFont(cyrilic).setFontSize(10).setFixedPosition(100, 90, 30).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("Испитната пријава е усвоена со Одлука бр. 07-844/16-4 од 09.06.2009 год. на ректорската управа на Универзитетот “Св. Климент Охридски„ - Битола ").setFont(cyrilic).setFontSize(10).setFixedPosition(112, 20, 370).setTextAlignment(TextAlignment.CENTER));
		    
	    
	    doc.add(new Paragraph("Досиe бр. ").add(lista.get(11)).setFont(cyrilic).setFontSize(10).setFixedPosition(315, 390, 200));
	    
	    doc.add(new Paragraph("Студиска програма ").setFont(cyrilic).setFontSize(10).setFixedLeading(13).setFixedPosition(315, 376.5f, 200));
	    Paragraph parStudProg = new Paragraph().add(lista.get(12)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(86).setFixedLeading(13);
	    Paragraph parStudProgLine = new Paragraph("___________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFirstLineIndent(86).setFixedLeading(13);
	    Div divstudProg = new Div().add(parStudProg).setHeight(40).setFixedPosition(315, 352, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    Div divstudProgLine = new Div().add(parStudProgLine).setHeight(40).setFixedPosition(315, 352, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divstudProg);
	    doc.add(divstudProgLine);
	    
	    doc.add(new Paragraph("Циклус ").add("_______ ").add(" Статус: редовен        вонреден").setFont(cyrilic).setFontSize(10).setFixedPosition(315, 346,  220).setFixedLeading(13));
	    doc.add(new Paragraph(lista.get(13)).setFont(cyrilic).setFontSize(10).setFixedPosition(349, 346,  30).setFixedLeading(13).setTextAlignment(TextAlignment.CENTER));
	    if(lista.get(14).getText().equals("редовен") || lista.get(14).getText().equals("redoven")){
	    	doc.add(new Paragraph(String.valueOf(checked)).setFont(base).setFontSize(13).setFixedPosition(461, 343,  200));
	    	doc.add(new Paragraph(String.valueOf(unchecked)).setFont(base).setFontSize(13).setFixedPosition(520, 343,  200));	    	
	    }
	    else{
	    	
	    	doc.add(new Paragraph(String.valueOf(unchecked)).setFont(base).setFontSize(11).setFixedPosition(461, 343,  200));
	    	doc.add(new Paragraph(String.valueOf(checked)).setFont(base).setFontSize(11).setFixedPosition(520, 343,  200));	  
	    }
	    
	    doc.add(new Paragraph("Кандидат  ").add("_____________________________________").setFont(cyrilic).setFontSize(10).setFixedPosition(315, 331, 232).setFixedLeading(13));
	    doc.add(new Paragraph(lista.get(15)).setFont(cyrilic).setFontSize(10).setFixedPosition(361, 330, 232).setFixedLeading(13));
	    
	    Paragraph pPredmet = new Paragraph("Предмет ").add("____________________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFixedLeading(13);
	    Paragraph pPredmetValue = new Paragraph(lista.get(16)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(40).setFixedLeading(13);
	    Div divPredmet = new Div().add(pPredmet).setHeight(40).setFixedPosition(315, 292, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    Div divPredmetValue = new Div().add(pPredmetValue).setHeight(40).setFixedPosition(315, 292, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divPredmet);
	    doc.add(divPredmetValue);	    
	    
	    
	    doc.add(new Paragraph("Внесено во списокот на кандидатите кои што полагаат испит под реден број: ___________________")
	    		.add(" на ден ____________________").add(" година.")
	    		.setFont(cyrilic).setFontSize(10).setFirstLineIndent(14f).setFixedLeading(13).setFixedPosition(315, 261, 232));
	    doc.add(new Paragraph(lista.get(18)).setFont(cyrilic).setFontSize(10).setFixedPosition(350, 259.5f, 92));
	    doc.add(new Paragraph(lista.get(17)).setFont(cyrilic).setFontSize(10).setFixedPosition(452, 272.5f, 92));
	    
	    doc.add(new Paragraph("Кандидатот денес полагаше испит по ______________ ______________________________________________ и го покажа следниот успех:")
	    		.setFont(cyrilic).setFontSize(10).setFixedLeading(13).setFixedPosition(315, 222, 232));
	    Paragraph predmet2 = new Paragraph(lista.get(16)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(165).setFixedLeading(13);
	    Div divPredmet2 = new Div().add(predmet2).setHeight(35).setFixedPosition(315, 229.5f, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divPredmet2);
	    
	    
	    
	    doc.add(new Paragraph("на писмениот испит:").setFont(cyrilic).setTextAlignment(TextAlignment.RIGHT).setFontSize(10).setFixedPosition(240, 205, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 205, 200));
	    doc.add(new Paragraph().add(lista.get(19)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 205, 200));
	    doc.add(new Paragraph("на усниот испит: ").setFont(cyrilic).setTextAlignment(TextAlignment.RIGHT).setFontSize(10).setFixedPosition(240, 192, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 192, 200));
	    doc.add(new Paragraph().add(lista.get(20)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 192, 200));
	    doc.add(new Paragraph("ОПШТА ОЦЕНКА").setFont(cyrilic).setFontSize(10).setBold().setFixedPosition(315, 177, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 177, 200));
	    doc.add(new Paragraph().add(lista.get(21)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 177, 200));
	    doc.add(new Paragraph("Во ").add(lista.get(22)).setFont(cyrilic).setFontSize(10).setFixedPosition(315, 160, 230));
	    doc.add(new Paragraph(" год.").setFont(cyrilic).setFontSize(10).setFixedPosition(457, 160, 100));
	    doc.add(new Paragraph(lista.get(23)).setFont(cyrilic).setFontSize(10).setFixedPosition(402, 159.5f, 200));
	    doc.add(new Paragraph("_____________   ___________").setFont(cyrilic).setFontSize(10).setFixedPosition(328, 160, 200));
	    doc.add(new Paragraph("Предметен наставник / Испитна комисија").setFont(cyrilic).setFontSize(10).setFixedPosition(440, 120, 95));
	    doc.add(new Paragraph("1.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 97, 200));
	    doc.add(new Paragraph("").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 97, 95));
	    doc.add(new Paragraph("2.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 82, 200));
	    doc.add(new Paragraph("").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 82, 95));
	    doc.add(new Paragraph("3.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 67, 200));
	    
	}
	public static void addEmptySecondPage(Document doc) throws IOException{
	    PdfFont cyrilic = PdfFontFactory.createFont(FONT, "CP1251", true);  
	    PdfFont base = PdfFontFactory.createFont("C:/Users/Ivana/workspace/ExamApplication/results/chapter01/wingding.ttf", PdfEncodings.IDENTITY_H , false);
	    char checked='\u00FE';
	    char unchecked='\u00A8';	    		
		
	    List<String> lista = new ArrayList<String>();
	    for(int i=0;i<25;i++){
	    	lista.add("");
	    }
		
	    doc.add(new Paragraph("Единица:").setFont(cyrilic).setFontSize(10).setFixedLeading(12).setFixedPosition(40, 390, 200));
	    Paragraph parEdinica = new Paragraph().add(lista.get(0)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(42).setFixedLeading(12);
	    Div divEdinica = new Div().add(parEdinica).setHeight(40).setFixedPosition(40, 367, 230).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divEdinica);
	    
	    doc.add(new Paragraph("Поени:").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 328, 200));
	    doc.add(new Paragraph("I колоквиум:").setFont(cyrilic).setFontSize(10).setFixedPosition(52, 310, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 310, 200));
	    doc.add(new Paragraph(lista.get(1)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 310, 200));	    
	    doc.add(new Paragraph("II колоквиум:").setFont(cyrilic).setFontSize(10).setFixedPosition(48, 296, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 296, 200));
	    doc.add(new Paragraph(lista.get(2)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 296, 200));
	    doc.add(new Paragraph("1. Просечно поени од колоквиуми / Завршно оценување").setFont(cyrilic).setFontSize(10).setFixedLeading(12).setFixedPosition(45, 266, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 265, 200));
	    doc.add(new Paragraph(lista.get(3)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 265, 200));
	   
	    doc.add(new Paragraph("2. Присуство и активност на предавања").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 252, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 251, 200));
	    doc.add(new Paragraph(lista.get(4)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 251, 200));
	    doc.add(new Paragraph("3. Присуство и активност на вежби").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 238, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 237, 200));
	    doc.add(new Paragraph(lista.get(5)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 237, 200));
	    doc.add(new Paragraph("4. Изработка на семинарски труд").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 224, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 223, 200));
	    doc.add(new Paragraph(lista.get(6)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 223, 200));
	    doc.add(new Paragraph("5. Самостојна (домашна) работа").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 210, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 209, 200));
	    doc.add(new Paragraph(lista.get(7)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 209, 200));
	    doc.add(new Paragraph("6. Изработени или реализирани проекти / програми").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 180, 210));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(250, 179, 200));
	    doc.add(new Paragraph(lista.get(8)).setFont(cyrilic).setFontSize(10).setFixedPosition(250, 179, 200));
	    doc.add(new Paragraph("7. Друго").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 162, 200));
	    doc.add(new Paragraph("__________________________________________________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFixedPosition(45, 126, 190).setFixedLeading(12));
	    Paragraph p = new Paragraph(lista.get(9)).setFont(cyrilic).setFontSize(10).setFixedLeading(13);
	    Div d = new Div().add(p).setHeight(53).setFixedPosition(45, 113.5f, 180).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(d);	    

	    doc.add(new Paragraph("ВКУПНО ").add("_________").setBold().setFont(cyrilic).setFontSize(10).setFixedPosition(45, 90, 175));
	    doc.add(new Paragraph(lista.get(10)).setFont(cyrilic).setFontSize(10).setFixedPosition(100, 90, 30).setTextAlignment(TextAlignment.CENTER));
	    doc.add(new Paragraph("Испитната пријава е усвоена со Одлука бр. 07-844/16-4 од 09.06.2009 год. на ректорската управа на Универзитетот “Св. Климент Охридски„ - Битола ").setFont(cyrilic).setFontSize(10).setFixedPosition(112, 20, 370).setTextAlignment(TextAlignment.CENTER));
	    
	    
	    
	    
	    
	    doc.add(new Paragraph("Досиe бр. ").add(lista.get(11)).setFont(cyrilic).setFontSize(10).setFixedPosition(315, 390, 200));
	    
	    doc.add(new Paragraph("Студиска програма ").setFont(cyrilic).setFontSize(10).setFixedLeading(13).setFixedPosition(315, 376.5f, 200));
	    Paragraph parStudProg = new Paragraph().add(lista.get(12)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(86).setFixedLeading(13);
	    Paragraph parStudProgLine = new Paragraph("___________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFirstLineIndent(86).setFixedLeading(13);
	    Div divstudProg = new Div().add(parStudProg).setHeight(40).setFixedPosition(315, 352, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    Div divstudProgLine = new Div().add(parStudProgLine).setHeight(40).setFixedPosition(315, 352, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divstudProg);
	    doc.add(divstudProgLine);
	    
	    doc.add(new Paragraph("Циклус ").add("_______ ").add(" Статус: редовен        вонреден").setFont(cyrilic).setFontSize(10).setFixedPosition(315, 346,  220).setFixedLeading(13));
	    doc.add(new Paragraph(lista.get(13)).setFont(cyrilic).setFontSize(10).setFixedPosition(349, 346,  30).setFixedLeading(13).setTextAlignment(TextAlignment.CENTER));
	    if(lista.get(13).toString() ==("редовен")){
	    	doc.add(new Paragraph(String.valueOf(checked)).setFont(base).setFontSize(13).setFixedPosition(461, 343,  200));
	    	doc.add(new Paragraph(String.valueOf(unchecked)).setFont(base).setFontSize(13).setFixedPosition(520, 343,  200));	    	
	    }
	    else{
	    	doc.add(new Paragraph(String.valueOf(unchecked)).setFont(base).setFontSize(11).setFixedPosition(461, 343,  200));
	    	doc.add(new Paragraph(String.valueOf(checked)).setFont(base).setFontSize(11).setFixedPosition(520, 343,  200));	  
	    }
	    
	    doc.add(new Paragraph("Кандидат  ").add("_____________________________________").setFont(cyrilic).setFontSize(10).setFixedPosition(315, 331, 232).setFixedLeading(13));
	    doc.add(new Paragraph(lista.get(14)).setFont(cyrilic).setFontSize(10).setFixedPosition(361, 330, 232).setFixedLeading(13));
	    
	    Paragraph pPredmet = new Paragraph("Предмет ").add("____________________________________________________________________________________").setFont(cyrilic).setFontSize(10).setFixedLeading(13);
	    Paragraph pPredmetValue = new Paragraph(lista.get(15)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(40).setFixedLeading(13);
	    Div divPredmet = new Div().add(pPredmet).setHeight(40).setFixedPosition(315, 292, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    Div divPredmetValue = new Div().add(pPredmetValue).setHeight(40).setFixedPosition(315, 292, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divPredmet);
	    doc.add(divPredmetValue);
	    
	    
	    
	    doc.add(new Paragraph("Внесено во списокот на кандидатите кои што полагаат испит под реден број: ___________________")
	    		.add(" на ден ____________________").add(" година.")
	    		.setFont(cyrilic).setFontSize(10).setFirstLineIndent(14f).setFixedLeading(13).setFixedPosition(315, 261, 232));
	    doc.add(new Paragraph(lista.get(16)).setFont(cyrilic).setFontSize(10).setFixedPosition(350, 259.5f, 92));
	    doc.add(new Paragraph(lista.get(17)).setFont(cyrilic).setFontSize(10).setFixedPosition(452, 272.5f, 92));
	    
	    doc.add(new Paragraph("Кандидатот денес полагаше испит по ______________ ______________________________________________ и го покажа следниот успех:")
	    		.setFont(cyrilic).setFontSize(10).setFixedLeading(13).setFixedPosition(315, 222, 232));
	    Paragraph predmet2 = new Paragraph(lista.get(18)).setFont(cyrilic).setFontSize(10).setFirstLineIndent(165).setFixedLeading(13);
	    Div divPredmet2 = new Div().add(predmet2).setHeight(35).setFixedPosition(315, 229.5f, 232).setVerticalAlignment(VerticalAlignment.TOP);
	    doc.add(divPredmet2);
	    
	    
	    
	    doc.add(new Paragraph("на писмениот испит:").setFont(cyrilic).setTextAlignment(TextAlignment.RIGHT).setFontSize(10).setFixedPosition(240, 205, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 205, 200));
	    doc.add(new Paragraph().add(lista.get(19)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 205, 200));
	    doc.add(new Paragraph("на усниот испит: ").setFont(cyrilic).setTextAlignment(TextAlignment.RIGHT).setFontSize(10).setFixedPosition(240, 192, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 192, 200));
	    doc.add(new Paragraph().add(lista.get(20)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 192, 200));
	    doc.add(new Paragraph("ОПШТА ОЦЕНКА").setFont(cyrilic).setFontSize(10).setBold().setFixedPosition(315, 177, 200));
	    doc.add(new Paragraph().add("___").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 177, 200));
	    doc.add(new Paragraph().add(lista.get(21)).setFont(cyrilic).setFontSize(10).setFixedPosition(450, 177, 200));
	    doc.add(new Paragraph("Во ").add(lista.get(22)).setFont(cyrilic).setFontSize(10).setFixedPosition(315, 160, 230));
	    doc.add(new Paragraph(" год.").setFont(cyrilic).setFontSize(10).setFixedPosition(457, 160, 100));
	    doc.add(new Paragraph(lista.get(23)).setFont(cyrilic).setFontSize(10).setFixedPosition(402, 159.5f, 200));
	    doc.add(new Paragraph("_____________   ___________").setFont(cyrilic).setFontSize(10).setFixedPosition(328, 160, 200));
	    doc.add(new Paragraph("Предметен наставник / Испитна комисија").setFont(cyrilic).setFontSize(10).setFixedPosition(440, 120, 95));
	    doc.add(new Paragraph("1.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 97, 200));
	    doc.add(new Paragraph("").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 97, 95));
	    doc.add(new Paragraph("2.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 82, 200));
	    doc.add(new Paragraph("").setFont(cyrilic).setFontSize(10).setFixedPosition(450, 82, 95));
	    doc.add(new Paragraph("3.  ______________________").setFont(cyrilic).setFontSize(10).setFixedPosition(420, 67, 200));
	    
	}
}
