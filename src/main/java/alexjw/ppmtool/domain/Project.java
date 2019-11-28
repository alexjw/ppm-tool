package alexjw.ppmtool.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class Project extends MyDomain {

    private String name;

    private String identifier;

    private String description;

    private Date start_date;
    private Date end_date;

}
