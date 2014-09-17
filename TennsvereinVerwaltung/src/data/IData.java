package data;

import java.util.Date;
import java.util.List;

import repository.Game;
import repository.Member;

/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public interface IData {
  public boolean createMember(String lastname, String firstname);
  public List<Member> getListOfMembers();
  public boolean createGame(Date date, Member memberOne, Member memberTwo);
  public List<Game> getListOfGames(Member member);
}
