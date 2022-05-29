package ar.edu.unju.fi.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Represents an User
 * @author ariel
 *
 */
@Entity
@Table(name = "users")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2404562132568669741L;
	/**
	 * The internal id of the User
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name = "native",strategy = "native")
	@Column(name = "user_id")
	private Long id;
	/**
	 * First name of the User
	 */
	@Column(name = "user_first_name")
	private String firstName;
	 /** Last name of the User
	 */
	@Column(name = "user_last_name")
	private String lasttName;
	/**
	 * Email of User
	 */
	@Column(name = "user_email", unique=true)
	private String email;
	
	/**
	 * UserName of User
	 */
	@Column(name = "user_user_name", unique=true)
	private String userName;
	
	/**
	 * Password of User
	 */
	@Column(name = "user_password", unique=true)
	private String password;
	
	/**
	 * REpresent the list of roles of the User
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles",
	           joinColumns = @JoinColumn(referencedColumnName = "user_id"),
	           inverseJoinColumns = @JoinColumn(referencedColumnName = "rol_id"))
	private Set<Role> roles;
		
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(Long id, String firstName, String lasttName, String email, String userName, String password,
			Set<Role> roles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
}

