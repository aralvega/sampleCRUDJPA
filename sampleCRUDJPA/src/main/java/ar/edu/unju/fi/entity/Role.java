package ar.edu.unju.fi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Represents the Role of an User
 * @author ariel
 *
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2570359725304914490L;
	/**
	 * The internal id of Role
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name = "rol_id")
	private Long id;
	/**
	 * Name of the Role
	 */
	@Column(name = "rol_name")
	private String name;
	/**
	 * A description of Role
	 */
	@Column(name = "rol_description")
	private String description;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

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
	
	
	
	
}
