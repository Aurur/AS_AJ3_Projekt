package repository;

import java.util.List;

/**
 * Kurzbeschreibung der Klasse
 * @version 1.0 vom 17.09.2014
 * @author Manfred Mustermann
 */
public class Tennisverein {
  List<Member> memberList;
  List<Game> gameList;
  
  public List<Member> getMemberList() {
    return memberList;
  }
  public void setMemberList(List<Member> memberList) {
    this.memberList = memberList;
  }
  public List<Game> getGameList() {
    return gameList;
  }
  public void setGameList(List<Game> gameList) {
    this.gameList = gameList;
  }
  
}
