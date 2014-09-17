package repository;
/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public class Member {
  private long memberId;
  private String lastname;
  private String firstname;
  
  public long getMemberId() {
    return memberId;
  }
  
  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }

  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public Member(String lastname, String firstname) {
    super();
    this.lastname = lastname;
    this.firstname = firstname;
  }
  
  
}
