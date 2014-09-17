package data;

import java.util.Date;
import java.util.List;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.beans.XMLEncoder;
import repository.Game;
import repository.Member;

/**
 * Kurzbeschreibung der Klasse
 * @version 1.0 vom 17.09.2014
 * @author Manfred Mustermann
 */
public class XML implements IData {

  @Override
  public boolean createMember(String lastname, String firstname) {
    XMLEncoder e;
    try {
      e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Test.xml")));
    } catch (FileNotFoundException e1) {
      return false;
    }
    e.writeObject("test1");
    e.close();
    return true;
  }

  @Override
  public List<Member> getListOfMembers() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean createGame(Date date, Member memberOne, Member memberTwo) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<Game> getListOfGames(Member member) {
    // TODO Auto-generated method stub
    return null;
  }

}
