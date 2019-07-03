
  package com.bnym.entity;
  
  import javax.persistence.Entity; 
  import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType; 
  import javax.persistence.Id;
  //import javax.persistence.TableGenerator;
  import javax.validation.constraints.NotEmpty;
  
  @Entity 
  public class UserRegistration {
  
  @Id  
  //@TableGenerator(name="user_seq", initialValue=0, allocationSize=50)  
  //@GeneratedValue(strategy = GenerationType.TABLE, generator="user_seq")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  @NotEmpty(message="Email can not be empty.") 
  private String email;
  
  @NotEmpty(message="Password can not be empty.") 
  private String password;
  
  // setters and getters 
  public Long getId() { return id; } 
  public void  setId(Long id) { this.id = id; }
  
  public String getEmail() { return email; } 
  public void setEmail(String email)  { this.email = email; } 
  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }
  
  } // end of class
 