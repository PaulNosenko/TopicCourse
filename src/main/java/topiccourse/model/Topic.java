package topiccourse.model;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import javax.persistence.*;

@Entity(name = "topics")
public class Topic implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="description")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
