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

/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public class XML implements IData {
	List<Member> listOfMembers;
	XML(){
		listOfMembers = getListOfMembers();
	}
  /**
   * This method saves (serializes) any java bean object into xml file
   */
  private void serializeObjectToXML(String xmlFileLocation,
      Object objectToSerialize) throws Exception {
      FileOutputStream os = new FileOutputStream(xmlFileLocation);
      XMLEncoder encoder = new XMLEncoder(os);
      encoder.writeObject(objectToSerialize);
      encoder.close();
  }

  /**
   * Reads Java Bean Object From XML File
   */
  private Object deserializeXMLToObject(String xmlFileLocation)
          throws Exception {
      FileInputStream os = new FileInputStream(xmlFileLocation);
      XMLDecoder decoder = new XMLDecoder(os);
      Object deSerializedObject = decoder.readObject();
      decoder.close();

      return deSerializedObject;
  }
  
  @Override
  public boolean createMember(String lastname, String firstname) {
    Member member = new Member(lastname, firstname);
    	listOfMembers.add(member);
    try {
      serializeObjectToXML("Member.xml", listOfMembers);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return false;
    }
    return true;
  }

  @Override
  public List<Member> getListOfMembers() {
		List<Member> member = null;
		  try {
			member = (List<Member>) deserializeXMLToObject("Member.xml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    return member;
  }

  @Override
  public boolean createGame(Date date, Member memberOne, Member memberTwo) {
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
  public List<Game> getListOfGames(Member member) {
    List<Game> allGames = getAllGames();
    for(Game game:allGames){
    	if(!game.getMemberOne().equals(member) && !game.getMemberTwo().equals(member)){
    		allGames.remove(game);
    	}
    }
    return null;
  }
 
  public List<Game> getAllGames() {
	List<Game> games = null;
	  try {
		games = (List<Game>) deserializeXMLToObject("Games.xml");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return games;
  }
  
}
