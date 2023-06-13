package pharmacy.JAXB;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class DateAdapter extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(String dateStr) {
        return LocalDate.parse(dateStr);
    }
    @Override
    public String marshal(LocalDate date) {
        return date.toString();
    }
}
