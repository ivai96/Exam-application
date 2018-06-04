package examapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//import com.itextpdf.io.font.PdfEncodings;
//import com.itextpdf.kernel.font.PdfFont;
//import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.element.Text;

public class InputValues {

	public static List<Text> inputFieldsStudent()
	{
		Scanner reader = new Scanner(System.in);
		List<Text> textFieldsStudent = new ArrayList<Text>();
		
		System.out.println("Внесете факултет: ");
	    String facultyName = reader.nextLine();
	    Text text1 = new Text(facultyName);
	    text1.setUnderline();
	    textFieldsStudent.add(text1);
		
		System.out.println("Внесете предмет за пријавување: ");
		String subjectName = reader.nextLine();
		Text text2 = new Text(subjectName);
		textFieldsStudent.add(text2);
		
	    System.out.println("Внесете испитен рок: ");
	    String examsPeriod = reader.nextLine();
	    Text text3 = new Text(examsPeriod);	    
	    textFieldsStudent.add(text3);
	    
	    System.out.println("По кој пат го полагате испитот: ");
	    String attemptsNumber = reader.nextLine();
	    Text text4 = new Text(attemptsNumber);	   
	    textFieldsStudent.add(text4);    
	    
	    System.out.println("Внесете име и презиме: ");
	    String nameSurname = reader.nextLine();
	    Text text5 = new Text(nameSurname);
	    text5.setUnderline();
	    textFieldsStudent.add(text5);
	    
	    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	    Date date = new Date();
	    
	    Text text6 = new Text(dateFormat.format(date));
	    text6.setUnderline();
	    textFieldsStudent.add(text6);
	
	    System.out.println("Внесете матичен број: ");
	    String embgNo = reader.nextLine();    
	    Text EMBG = new Text(embgNo);
	    EMBG.setUnderline();
	    textFieldsStudent.add(EMBG);   
	  
	    System.out.println("Внесете место: ");
	    String city = reader.nextLine();
	    Text text7 = new Text(city);
	    textFieldsStudent.add(text7);
	    
	   
	return textFieldsStudent; 
	}
	
	public static List<Text> inputFieldsProfeessor()
	{
		Scanner reader = new Scanner(System.in);
		List<Text> textFieldsProfessor = new ArrayList<Text>();
		
		System.out.println("Единица: ");
		String facultyName = reader.nextLine();
		Text facultyNameTxt = new Text(facultyName);
		facultyNameTxt.setUnderline();
		textFieldsProfessor.add(facultyNameTxt);
		
		System.out.println("Поени од прв колоквиум: ");
		String prvKolok = reader.nextLine();
		Text prvKolokTxt = new Text(prvKolok);		
		textFieldsProfessor.add(prvKolokTxt);
		
		System.out.println("Поени од втор колоквиум: ");
		String vtorKolok = reader.nextLine();
		Text vtorKolokTxt = new Text(vtorKolok);		
		textFieldsProfessor.add(vtorKolokTxt);
		
		System.out.println("Просечно поени од колоквиум/Завршно оценување: ");
		String prosecnoPoeni = reader.nextLine();
		Text prosecnoPoeniTxt = new Text(prosecnoPoeni);		
		textFieldsProfessor.add(prosecnoPoeniTxt);
		
		System.out.println("Присуство и активност на предавања: ");
		String prisustvoAtivnost = reader.nextLine();
		Text prisustvoAtivnostTxt = new Text(prisustvoAtivnost);		
		textFieldsProfessor.add(prisustvoAtivnostTxt);
		
		System.out.println("Присуство и активност на вежби: ");
		String prisustvoAtivnostVezbi = reader.nextLine();
		Text prisustvoAtivnostVezbiTxt = new Text(prisustvoAtivnostVezbi);		
		textFieldsProfessor.add(prisustvoAtivnostVezbiTxt);
		
		System.out.println("Изработка на семианрски труд: ");
		String seminarskiTrud = reader.nextLine();
		Text seminarskiTrudTxt = new Text(seminarskiTrud);		
		textFieldsProfessor.add(seminarskiTrudTxt);
			
		System.out.println("Самостојна (домашна) работа: ");
		String domasnaRabota = reader.nextLine();
		Text domasnaRabotaTxt = new Text(domasnaRabota);		
		textFieldsProfessor.add(domasnaRabotaTxt);
		
		System.out.println("Изработени или реализирани проекти / програми: ");
		String realiziraniProgrami = reader.nextLine();
		Text realiziraniProgramiTxt = new Text(realiziraniProgrami);		
		textFieldsProfessor.add(realiziraniProgramiTxt);
		
		System.out.println("Друго: ");
		String drugo = reader.nextLine();
		Text drugoTxt = new Text(drugo);		
		textFieldsProfessor.add(drugoTxt);
		
		System.out.println("Вкупно: ");
		String vkupno = reader.nextLine();
		Text vkupnoTxt = new Text(vkupno);		
		textFieldsProfessor.add(vkupnoTxt);
		
		System.out.println("Досие бр. ");
		String dosie = reader.nextLine();
		Text dosieTxt = new Text(dosie);		
		textFieldsProfessor.add(dosieTxt);
		
		System.out.println("Студиска програма: ");
		String studiskaPrograma = reader.nextLine();
		Text studiskaProgramaTxt = new Text(studiskaPrograma);		
		textFieldsProfessor.add(studiskaProgramaTxt);
		
		System.out.println("Циклус: ");
		String ciklus = reader.nextLine();
		Text ciklusTxt = new Text(ciklus);		
		textFieldsProfessor.add(ciklusTxt);
		
		System.out.println("Статус: ");
		String status = reader.nextLine();
		Text statusTxt = new Text(status);		
		textFieldsProfessor.add(statusTxt);
		
		System.out.println("Кандидат: ");
		String kandidat = reader.nextLine();
		Text kandidatTxt = new Text(kandidat);		
		textFieldsProfessor.add(kandidatTxt);
		
		System.out.println("Предмет: ");
		String predmet = reader.nextLine();
		Text predmetTxt = new Text(predmet);		
		textFieldsProfessor.add(predmetTxt);
		
		System.out.println("Реден број во списокот на кандидатите коишто полагаат испит: ");
		String redenBr = reader.nextLine();
		Text redenBrTxt = new Text(redenBr);		
		textFieldsProfessor.add(redenBrTxt);
			
		System.out.println("Внесете дата на полагање: ");
		String datаPolaganje = reader.nextLine();
		Text datаPolaganjeTxt = new Text(datаPolaganje);
		textFieldsProfessor.add(datаPolaganjeTxt);
		
		System.out.println("Бодови од писмен испит: ");
		String bodPismen = reader.nextLine();
		Text bodPismenTxt = new Text(bodPismen);		
		textFieldsProfessor.add(bodPismenTxt);
		
		System.out.println("Бодови од усен испит: ");
		String bodUsen = reader.nextLine();
		Text bodUsenTxt = new Text(bodUsen);		
		textFieldsProfessor.add(bodUsenTxt);
		
		System.out.println("Општа оценка: ");
		String opstaOcenka = reader.nextLine();
		Text opstaOcenkaTxt = new Text(opstaOcenka);		
		textFieldsProfessor.add(opstaOcenkaTxt);
		
		System.out.println("Место: ");
		String mesto = reader.nextLine();
		Text mestoTxt = new Text(mesto);		
		textFieldsProfessor.add(mestoTxt);
		
		System.out.println("Внесете дата на потпис: ");
		String dataPotpis = reader.nextLine();
		Text dataPotpisTxt = new Text(dataPotpis);
		textFieldsProfessor.add(dataPotpisTxt);			    
		
	    return textFieldsProfessor;
	    
}
}