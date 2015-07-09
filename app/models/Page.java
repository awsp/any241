package models;

import com.avaje.ebean.annotation.CreatedTimestamp;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
public class Page extends Model {
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String title;

    @NotNull
    public String url;

    public String body;

    @CreatedTimestamp
    public Date createdAt = new Date();

    @Version
    public Date updatedAt = new Date();

    @Formats.DateTime(pattern="YYYY/MM/dd")
    public Date publishingOn;

    public boolean isShown = true;

    public static Finder<Long,Page> finder = new Finder<Long,Page>(Long.class, Page.class);
}
