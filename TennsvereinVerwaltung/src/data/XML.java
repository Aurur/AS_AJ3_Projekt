package data;

import java.util.Date;
import java.util.List;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import repository.Game;
import repository.Member;
import repository.Tennisverein;

/**
 * Kurzbeschreibung der Klasse
 * @version 1.0 vom 17.09.2014
 * @author Manfred Mustermann
 */
public class XML implements IData {
  
  private Tennisverein tv = new Tennisverein();
  
  public void serializeObjectToXML(String xmlFileLocation, Object objectToSerialize) throws Exception {
          FileOutputStream os = new FileOutputStream(xmlFileLocation);
          XMLEncoder encoder = new XMLEncoder(os);
          encoder.writeObject(objectToSerialize);
          encoder.close();
      }
   
      /**
       * Reads Java Bean Object From XML File
       */
  public Object deserializeXMLToObject(String xmlFileLocation) throws Exception {
          FileInputStream os = new FileInputStream(xmlFileLocation);
          XMLDecoder decoder = new XMLDecoder(os);
          Object deSerializedObject = decoder.readObject();
          decoder.close();
   
          return deSerializedObject;
  }
      
  @Override
  public boolean createMember(String lastname, String firstname) {
    try {
      
      List<Member> memberList = tv.getMemberList();
      memberList.add(new Member(lastname,firstname));
      tv.setMemberList(memberList);
      
      serializeObjectToXML("Tennisverein.xml", tv);
      
    } catch (Exception e2) {
      return false;
    }
    
    return true;
  }

  @Override
  public List<Member> getListOfMembers() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean createGame(Date date, Member memberOne, Member memberTwo) {
    try {
      
      List<Game> gameList = tv.getGameList();
      gameList.add(new Game(date, memberOne, memberTwo));
      tv.setGameList(gameList);
      
      serializeObjectToXML("Tennisverein.xml", tv);
      
    } catch (Exception e2) {
      return false;
    }
    
    return true;
  }

  @Override
  public List<Game> getListOfGames(Member member) {
    // TODO Auto-generated method stub
    return null;
  }

}
