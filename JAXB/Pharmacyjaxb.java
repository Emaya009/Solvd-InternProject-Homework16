package pharmacy.JAXB;

import pharmacy.Annotations.Column;
import pharmacy.Annotations.Id;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name="pharmacy")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pharmacyjaxb {
    @XmlElement(name = "name")
    @Id(name = "name")
    @Column(name = "name")
        private String name;
    @XmlElement(name = "date")
    @XmlJavaTypeAdapter(DateAdapter.class)
        private LocalDate date;
    @XmlElementWrapper(name = "drugs")
    @XmlElement(name = "drug")
    private List<Drug> drugs;

    public Pharmacyjaxb() {
    }

    public Pharmacyjaxb(String name, LocalDate date, List<Drug> drugs) {
        this.name = name;
        this.date = date;
        this.drugs = drugs;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Drug> getDrugs() {
            return drugs;
        }

        public void setDrugs(List<Drug> drugs) {
            this.drugs = drugs;
        }

    @Override
    public String toString() {
        return "Pharmacyjaxb{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", drugs=" + drugs +
                '}';
    }
}

