package controller;

import java.util.Date;
import java.util.List;

import data.XML;

import repository.Game;
import repository.Member;

/**
 * Kurzbeschreibung der Klasse
 * @version 1.0 vom 17.09.2014
 * @author Manfred Mustermann
 */
public class Controller implements IController{

  private XML data;
  
  
  public XML getData() {
    return data;
  }

  public void setData(XML data) {
    this.data = data;
  }

  public Controller(XML data) {
    super();
    this.data = data;
  }

  @Override
  public boolean createMember(String lastname, String firstname) {
    
    return data.createMember(lastname, firstname);
  }

  @Override
  public List<Member> getListOfMembers() {
    return data.getListOfMembers();
  }

  @Override
  public boolean createGame(Date date, Member memberOne, Member memberTwo) {
    return data.createGame(date, memberOne, memberTwo);
  }

  @Override
  public List<Game> getListOfGames(Member member) {
    return data.getListOfGames(member);
  }

  
}
