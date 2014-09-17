package repository;

import java.util.Date;

/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public class Game {

  private Date date;
  private Member memberOne;
  private Member memberTwo;
  
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public Member getMemberOne() {
    return memberOne;
  }
  public void setMemberOne(Member memberOne) {
    this.memberOne = memberOne;
  }
  public Member getMemberTwo() {
    return memberTwo;
  }
  public void setMemberTwo(Member memberTwo) {
    this.memberTwo = memberTwo;
  }
  public Game(Date date, Member memberOne, Member memberTwo) {
    super();
    this.date = date;
    this.memberOne = memberOne;
    this.memberTwo = memberTwo;
  }
  
  
  
}
