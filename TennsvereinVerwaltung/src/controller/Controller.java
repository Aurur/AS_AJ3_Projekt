package controller;

import java.util.Date;
import java.util.List;

import data.IData;

import repository.Game;
import repository.Member;

/**
 * FA21
 * @version 1.0 vom 17.09.2014
 * @author Andreas Lau, Vivian Fuhl
 */
public class Controller implements IController{

  private IData data;
  
  
  public IData getData() {
    return data;
  }

  public void setData(IData data) {
    this.data = data;
  }

  public Controller(IData data) {
    super();
    this.data = data;
  }

  @Override
  public boolean createMember(String lastname, String firstname) {
    
    return data.createMember(lastname, firstname);
  }

  @Override
  public String[] getListOfMembers() {
	  List<Member> memberList = data.getListOfMembers();
	  String [] memberArray = new String[memberList.size()];
	  for(int i=0;i<memberList.size();i++){
		  memberArray[i]=memberList.get(i).getFirstname() + " " + memberList.get(i).getLastname();
		  
	  }
    return memberArray;
  }

  @Override
  public boolean createGame(Date date, Member memberOne, Member memberTwo) {
    return data.createGame(date, memberOne, memberTwo);
  }

  @Override
  public String[][] getListOfGames(Member member) {
	  
	  List<Game> gameList = data.getListOfGames(member);
	  String [][] gameArray = new String[gameList.size()][3];
	  for(int i=0;i<gameList.size();i++){
		  gameArray[i][0]=gameList.get(i).getDate().toString();
		  gameArray[i][1]=gameList.get(i).getMemberOne().getFirstname() + " " + gameList.get(i).getMemberOne().getLastname();
		  gameArray[i][2]=gameList.get(i).getMemberTwo().getFirstname() + " " + gameList.get(i).getMemberTwo().getLastname();
		  }
    return gameArray;
  }

  
}
