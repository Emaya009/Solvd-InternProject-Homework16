package pharmacy.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
      public static void main(String[] args) throws JAXBException, FileNotFoundException {
       Pharmacyjaxb pharmacy=new Pharmacyjaxb();
       JAXBContext jaxbContext = JAXBContext.newInstance(Pharmacyjaxb.class);
       Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
       Pharmacyjaxb object=(Pharmacyjaxb) jaxbUnmarshaller.unmarshal(new FileReader("C:\\Users\\balaj\\IdeaProjects\\SolvdIntern\\src\\main\\java\\pharmacy\\JAXB\\Pharmacyjaxb.xml"));
       System.out.println("Unmarshalling Done");
       System.out.println(object.getName());
       System.out.println(object.getDate());
       List<Drug> drugsList=object.getDrugs();
       System.out.println(drugsList);

    }
}

